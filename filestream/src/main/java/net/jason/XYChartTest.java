package net.jason;

import java.awt.Font;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class XYChartTest extends HttpServlet {

	String url;
	String id = "root", pass = "ss2414ss";
	Connection conn;
	
	public void init() {
		try {
			
			url = "jdbc:mysql://localhost:3306/mywork";
			String option = "?useUnicode=true&characterEncoding=UTF-8";
			url += option;
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			Statement st = conn.createStatement();
			String sql = "select value from mycom";
			ResultSet rs = st.executeQuery(sql);
			XYSeries vs = new XYSeries("우리회사 매출동향");
			int i = 1;
			while(rs.next()) {
				vs.add(i, rs.getInt(1));
				i += 1;
			}
			XYSeriesCollection ds = new XYSeriesCollection(vs);
			JFreeChart chart = ChartFactory.createXYLineChart("매출동향", "날짜", "가격", ds,
					PlotOrientation.VERTICAL, true, true, true);
			
			Font labelFont = chart.getTitle().getFont();
			chart.getTitle().setFont(
					new Font("맑은고딕", labelFont.getStyle(), labelFont.getSize())
					);

			/* X축 제목
			 * chart.getDomainAxis().getLabelFont();
			 * */
			
			/* X축 레이블
			 * chart.getDomainAxis().getTickLabelFont();
			 * */
			
			/* Y축 제목
			 * chart.getDomainAxis().getLabelFont();
			 * */
			
			/* Y축 레이블
			 * chart.getRangeAxis().getTickLabelFont();
			 * */
			
			/* 범례
			 * */
			chart.getLegend().setItemFont(new Font("맑은고딕", Font.PLAIN, 10));
			
			ServletOutputStream out = res.getOutputStream();
			ChartUtils.writeChartAsPNG(out, chart, 400, 400);
			
		}catch(Exception e) {}
	}

}
