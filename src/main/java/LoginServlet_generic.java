import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LoginServlet_generic extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest)req;
		String method = request.getMethod();
		System.out.println("Login servlet called");
		String resp = " ";
		if(method.equals("POST")) {
			resp = "<button>Click Here This was POST Request</button>";
		}
		else if(method.equals("GET")) {
			resp = "<button>Click Here This was GET Request</button>";
			
		}
		System.out.println(request.getMethod());
		PrintWriter writer = res.getWriter();
		writer.write(resp);
		writer.flush();
		writer.close();
	}

}
