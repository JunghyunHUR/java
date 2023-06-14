package net.jason;

import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/*
 * 데이터 생성
 * 	-DataSet 로 데이터를 관리함
 * 
 * 차트 생성
 * 	- ChartFactory 클래스 안의 createXxxChart() 메소드
 * 
 * 커스터마이징
 * 	- Plot 클래스를 이용하여 원하는 형태로 커스터마이징
 * */

public class PieChartTest extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		DefaultPieDataset dp = new DefaultPieDataset();
		dp.setValue("이마트", new Double(40.0));
		dp.setValue("홈플러스", new Double(25.0));
		dp.setValue("롯데마트", new Double(15.5));
		
		JFreeChart chart = ChartFactory.createPieChart("주식 상황", dp, true, true, false);
		ServletOutputStream out = res.getOutputStream();
		ChartUtils.writeChartAsPNG(out, chart, 400, 400);
	}

}
