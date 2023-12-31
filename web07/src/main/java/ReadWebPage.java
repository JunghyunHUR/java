

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import web07.WebPageReader;


public class ReadWebPage extends HttpServlet {


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		String page = req.getParameter("webpage");
		String content = new WebPageReader().setWebPageName(page).getWebPageContent();
		
		ServletOutputStream os = res.getOutputStream();
	     os.write(content.getBytes(StandardCharsets.UTF_8));
		
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		doGet(req, res);
	}

}
