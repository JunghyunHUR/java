

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Timer;
import java.util.TimerTask;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cron
 */
public class Cron extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//필드
	private long num;
	private Timer timer;
	private TimerTask task;
	
	
    //생성자
    public Cron() {
        super();
        // TODO Auto-generated constructor stub
    }

    //메소드
    //최초에 한 번 실행 init
    public void init() {
    	int delay = 0;
    	int period = 5000;
    	timer = new Timer();
    	task = new TimerTask(){
    		public void run() {
    			num ++;
    		}
    	};
    	timer.scheduleAtFixedRate(task, delay, period);//스케줄 5초에 한 번
    }
    
    public void destroy() {
    	task.cancel(); //중지
    	timer.cancel();
    }
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html/charset=utf-8");
		PrintWriter out = res.getWriter();
		req.setCharacterEncoding("UTF-8");
		
		out.println("<html>");
		out.println("<html lang='ko'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<meta http-equiv='X-UA-Compatible' content='IE=edge'>");
		out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("<title>myShop</title>");    
		out.println("<link rel='stylesheet' href='css/style.css'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>크론 텍스트</h1>");
		out.println("5초 간격으로 숫자가 증가함.");
		out.println("새로고침 버튼을 눌러주세요.");
		out.println("<p>숫자 = " + num);
		out.println("</body></html>");
		
	}

	

}
