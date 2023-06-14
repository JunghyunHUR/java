

import java.io.IOException;
import java.io.PrintWriter;

import board.MemberDDL;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class MemberIdCheck extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.getWriter().append("Served at: ").append(req.getContextPath());
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");
		MemberDDL ddl = new MemberDDL();
		
		boolean result = ddl.idcheck(id);
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		
		if(result) out.println("0");
		else out.println("1");
		
		out.close();
	}

}
