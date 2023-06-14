<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*, 
				 java.util.List, 
				 org.apache.commons.fileupload.*, 
				 org.apache.log4j.Logger" 
%>

<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>
<%
/*
	String dir = application.getRealPath("/upload");
	int max = 5 * 1024 * 1024; // 5MB
	try{
		MultipartRequest m = new MultipartRequest(request, dir, max, "UTF-8", new DefaultFileRenamePolicy());
		
		String subject = m.getParameter("subject");
		String file1 = m.getFilesystemName("file1");
		String ofile1 = m.getOriginalFileName("file1");
		String file2 = m.getFilesystemName("file2");
		String ofile2 = m.getOriginalFileName("file2");

	}catch(Exception e){
		e.printStackTrace(new PrintWriter(out));
	}
	*/
	Logger log = Logger.getLogger(request.getRequestURI());
	String path = "C:/Junghyun/java/fileupload/src/main/webapp/upload";
	//String rootPath = System.getProperty("user.dir");
	//String path = getServletContext().getRealPath("/upload/");
	//String path = config.getServletContext().getRealPath("/upload/");
	//String path = request.getSession().getServletContext().getRealPath("/uploads/");
	/*
		System.getProperty("user.dir") // 이클립스 실행시 워크 스페이스 (해당 프로젝트명 전까지)
		System.getProperty("user.home") // 사용자 홈 디렉토리
	*/
	//폴더가 지정한 곳에 없다면 생성
	File isDir = new File(path);
	if(isDir.isDirectory()){
		System.out.println("폴더가 이미 있음");
	}else{
		try{
			isDir.mkdir();			
			System.out.println("폴더를 생성함.");
		}catch(Exception e){
			e.getStackTrace();
		}
	}
	DiskFileUpload upload = new DiskFileUpload();
	upload.setFileSizeMax(5 * 1024 * 1024); //최대 5MB까지 업로드 가능
	upload.setSizeThreshold(4096); // 메모리에 저장할 최대 size
	upload.setRepositoryPath(path); //파일 임시 저장소
	List items = upload.parseRequest(request );
%> 
<%= path %>

</body>
</html>
