import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.naming.InitialContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet  extends HttpServlet{
	static {
		System.out.println("1. Loading class...");
		
	}
	{
		System.out.println("2. Creating object...");
	}
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("3. Init Method Zero Parameter");

	}
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		System.out.println("4.Init method servlet config");
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		super.service(req,res);
		System.out.println("5.Service method");
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			System.out.println("6.Do get method");
			
			PrintWriter writer = resp.getWriter();
			Random random = new Random();
			
			resp.setContentType("text/html");
			writer.write("<ol>");
			for(int i = 0; i < 20; i++) {
				String cardNumber = (random.nextFloat() + "").substring(2,6)+"-"+
						(random.nextFloat() + "").substring(2,6)+"-"+
						(random.nextFloat() + "").substring(2,6)+"-"+
						(random.nextFloat() + "").substring(2,6);
			
			}
			writer.write("</ol>");
			writer.flush();
			writer.close();

		
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("7. Last : Destroy");
	}
	
}
