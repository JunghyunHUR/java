

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FRead extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String dir = req.getParameter("dir");
		String file = req.getParameter("file");
		if(file == null || dir == null) return;
		
		String realDir = getServletContext().getRealPath(dir);
		File f = new File(realDir + "/" + file);
		if(f.isDirectory()) return;
		
		if(file.endsWith("html") || file.endsWith("txt") || 
			file.endsWith("jsp") || file.endsWith("xml")) {
			res.setContentType("text/html;charset=UTF-8");
			PrintWriter out = res.getWriter();
			sendText(dir, file, realDir, out);
		}else {
			if(file.endsWith("gif")) res.setContentType("image/gif");
			else if(file.endsWith("jpg")) res.setContentType("image/jpeg");
			else if(file.endsWith("png")) res.setContentType("image/png");
			else {
				res.setContentType("application/octet");
				res.setHeader("Content-Disposition", "attachment;filename=" + file);
			}
			ServletOutputStream out = res.getOutputStream();
			sendBinary(realDir, file, out);
		}
	}

	private void sendBinary(
			String realDir, 
			String file, 
			ServletOutputStream out) throws IOException {
		
		String path = realDir + "/" + file;
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(path));
		byte buf[] = new byte[1024];
		int n = -1;
		while((n = in.read(buf, 0, 1024)) != -1) {
			out.write(buf, 0 ,n);
			out.flush();
		}
		in.close();
		out.close();
	}

	private void sendText(
			String dir,
			String file, 
			String realDir, 
			PrintWriter out) throws IOException{
		
		String path = realDir + "/" + file;
		File dataFile = new File(path);
		
		BufferedReader in = new BufferedReader(new FileReader(dataFile));
		String line = null;
		
		out.println("<html><head><title>"+ file +"</title></head><body>");
		out.println("<h3 style=\"text-align:center\">" + dir +"/" + file + "</h3>");
		out.println("<form name=\"form\" style=\"text-align:center\" action=\"fwrite.jsp\" method=\"post\">");
		out.println("<textarea name=\"contents\" cols=\"75\" rows=\"25\">");
		while((line = in.readLine()) != null) {
			line = replace(line, "&", "&amp;");
			line = replace(line, "<", "&lt;");
			line = replace(line, ">", "&gt;");
			out.println(line);
		}
		out.println("</textarea><br><br>");
		out.println("<input type=\"hidden\" name=\"dir\" value=\"\">");
		out.println("<input type=\"hidden\" name=\"file\" value=\"\">");
		out.println("<div style=\"text-align:center\"><input type=\"button\" value=\"취소\" onclick=\"javascript:history.go(-1)\">");
		out.println("<input type=\"submit\" value=\"  저  장  \"></div>");
		out.println("</form></body</html>");
		in.close();
		out.close();
	}

	private String replace(String s, String from, String to) {
		
		int index = s.indexOf(from);
		StringBuffer buf = new StringBuffer();
		if(index < 0)return s;
		
		buf.append(s.substring(0, index));
		buf.append(to);
		if(index + from.length() < s.length()) {
			buf.append(replace(s.substring(index + from.length(), s.length()),from, to));
		}
		return buf.toString();
	}

}
