

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class HttpHeader extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) 
	throws IOException, ServletException{
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		req.setCharacterEncoding("UTF-8");
		
		out.println("<html><head><title>헤더정보</title></head>");
		out.println("<body><h2 style='text-align:center'>헤더정보</h2>");
		out.println("<hr><ol>");
		
		Enumeration e = req.getHeaderNames();
		// hasMoreElements();
		while(e.hasMoreElements()) {
			String name = (String)e.nextElement();
			String value = req.getHeader(name);
			out.println("<li>");
			out.print(name);
			out.print(" : ");
			out.println(value);
			out.println("</li>");
		}
		
		out.println("</ol></body></html>");
		
	}

}
