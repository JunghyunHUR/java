

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns= {"/Login"}, initParams= {@WebinitParam(name="admEmail", value="hjoung3@naver.com")})
public class Login extends HttpServlet {

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String userEmail = req.getParameter("email");
		String userPass = req.getParameter("password");
		
		String admEmail = getInitParameter("email");
		String admPass = getInitParameter("password");
		
		
		
		res.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		
		PrintWriter out = res.getWriter();
		
		

		
		out.println("<html><head><title>정보출력</title></head><body>");
		
		if(userEmail.equals(admEmail) && userPass.equals(admPass)) {
			res.sendRedirect("admin");
			out.println("<script>alert('"+ userEmail +"관리자님 반갑습니다.');</script>");
		}else {
			res.sendRedirect("login.html");
			out.println("<script>alert('입력한 정보가 틀렸습니다.');</script>");
		}
		
		out.println("<ul>");
		out.println("<li><label>이메일</label>"+ userEmail +"</li>");
		out.println("<li><label>비밀번호</label>"+ userPass +"<li>");

		out.println("<li><label>관리자 이메일</label>"+ admEmail +"</li>");
		out.println("<li><label>관리자 비밀번호</label>"+ admPass +"<li>");
		out.println("</ul></body></html>");
		
		out.close();
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
