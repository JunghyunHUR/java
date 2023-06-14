

import java.io.IOException;

import com.oracle.wls.shaded.org.apache.xalan.lib.Redirect;

import board.MemberDDL;
import board.MembersDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class MembersOk extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		MembersDTO dto = new MembersDTO();
		MemberDDL ddl = new MemberDDL();
		String url = null;
		
		
		dto.setUserid(req.getParameter("userid"));
		dto.setUserpass(req.getParameter("userpass"));
		dto.setUsername(req.getParameter("username"));
		dto.setUseremail(req.getParameter("useremail"));
		dto.setPostcode(Integer.parseInt(req.getParameter("postcode")));
		dto.setAddr(req.getParameter("addr"));
		dto.setDetailaddr(req.getParameter("detailaddr"));
		dto.setTel(req.getParameter("tel"));
		dto.setUip();
		boolean isSuccess = ddl.insert(dto);
		if(isSuccess) {
			System.out.println("insert is success");
			HttpSession session = req.getSession();
			session.setAttribute("user", req.getParameter("userid"));
			session.setAttribute("level", isSuccess);
			url = "index.jsp";
			res.sendRedirect(url);
		}else {
			System.out.println("insert is failed");
			url = "?fname=member/register";
			res.sendRedirect(url);
		}
		
		doGet(req, res);
	}

}
