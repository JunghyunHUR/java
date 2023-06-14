

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Hello extends HttpServlet {


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		req.setCharacterEncoding("utf-8");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>HelloWorld</title>");
		out.println("<body>");
		out.println("<h1>Hello World!!!</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
