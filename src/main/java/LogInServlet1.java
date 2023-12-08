import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogInServlet1 extends HttpServlet{
	protected void doGet(HttpServlet req,HttpServletResponse resp) throws IOException {
		RequestDispatcher dispatcher = req.getReuestDispatcher("login.html");
		dispatcher.forward((ServletRequest) req, resp);
	}
	
	protected void doPost(HttpServlet req,HttpServletResponse resp) throws IOException {
		String rs = "<button>Click Here This was POST Request HTTP</button>";
		resp.getWriter().write(rs);
	}
	
	//@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		HttpServletRequest request = (HttpServletRequest)req;
//		String method = request.getMethod();
//		System.out.println("Login servlet called");
//		String resp = " ";
//		if(method.equals("POST")) {
//			resp = "<button>Click Here This was POST Request HTTP</button>";
//		}
//		else if(method.equals("GET")) {
//			resp = "<button>Click Here This was GET Request HTTP</button>";
//			
//		}
//		System.out.println(request.getMethod());
//		PrintWriter writer = res.getWriter();
//		writer.write(resp);
//		writer.flush();
//		writer.close();
//	}


}
