import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		
		Date date = new Date(0);
		
		   writer.write("<h1 Today's date>"+ date+"</h1>");
		   writer.flush();
		   writer.close();

		 
	}

}
