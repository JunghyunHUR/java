package net.jason;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloImg extends HttpServlet {

	protected void serivce(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		ServletOutputStream out = res.getOutputStream();
		res.setContentType("image/gif");
		Graphics2D g = null;
		
		try {
			BufferedImage img = new BufferedImage(400, 60, BufferedImage.TYPE_INT_RGB);
			g = img.createGraphics();
			g.setColor(Color.white);
			g.fillRect(0, 0, 400, 60);
			g.setColor(Color.black);
			g.setFont(new Font("serif", Font.BOLD, 48));
			g.drawString("Hello 안녕", 10, 50);
//			GifEncoder encoder = new GifEncoder(img, out);
//			encoder.encodeDone();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(g != null) g.dispose();
		}
	}


}
