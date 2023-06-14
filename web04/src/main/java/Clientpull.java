

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Clientpull extends HttpServlet {

	int count = 0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		response.setHeader("Refresh", "1");
		
		out.println("<html><head><title>Client Pull</title></head>");
		out.println("<body><h2 style='text-align:center'>Client Pull 테스트</h2>");
		out.println(++count);
		out.println("</body></html>");
	}

}
