package net.junghyun.web05;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Hello extends HttpServlet {
	@Override
	public void init() throws ServletException {
    	//thread 시작 되면 한 번 실행
		System.out.println("init");
    }
    @Override
    public void destroy() {
    	//끝 날때 한 번 실행
    	System.out.println("destroy");
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("doGet");
		
		String mytext = req.getParameter("mytext");
		String[] hobbys = req.getParameterValues("hobby");
		String major = req.getParameter("major");
		String protocol = req.getParameter("protocol");
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		req.setCharacterEncoding("utf-8");
		
		out.println("<html>");
		out.println("<head><title>문서</title></head>");
		out.println("<body>");
		out.println("<h1 style='text-align : center';>Hello Java</h1>");
		out.println("<ul>");
		
//		out.println("<li><label>하실말씀 : </label>" + mytext + "</li>");
//		out.println("<li><label>취미 : </label>");
		
//		if(hobbys == null) {
//			out.println("없음");
//		}else {
//			for(int i = 0; i < hobbys.length-1; i++) {
//				out.println(hobbys[i] + ", ");
//			}
//			out.println(hobbys[hobbys.length-1]);
//		}
//		out.println(Arrays.toString(hobbys));
		
//		out.println("</li>");
//		out.println("<li><label>좋아하는 과목 : </label>" + major + "</li>");
//		out.println("<li><label>전송프로토콜 : </label>" + protocol + "</li>");
		
		Enumeration en = req.getParameterNames();
		while(en.hasMoreElements()) {
			String name = (String) en.nextElement();
			String values[] = req.getParameterValues(name);
			if(values != null) {
				for(int i = 0; i < values.length; i++) {
					out.println("<li>" + name+ " : " + values[i] + "</li>");
				}
			}
		}
		
		
		out.println("</ul>");
		out.println("</body></html>");
		
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("doPost");
				
		doGet(req, res);
	}
	@PostConstruct
	private void initPostConstruct() {
		System.out.println("init전 한 번 실행됨");
	}

	@PreDestroy
	private void destroyPreDestroy() {
		System.out.println("destroy 후 한 번 실행");
	}
}
