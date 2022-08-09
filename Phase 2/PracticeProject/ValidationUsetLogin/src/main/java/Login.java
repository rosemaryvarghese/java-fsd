import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
@WebServlet("/login")
public class Login implements Servlet
{
	public void init(ServletConfig config)
	{
	}
	public ServletConfig getServletConfig()
	{
		return null;
	}
	
	@Override
	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(username.equals("admin")&& password.equals("rose123") ) 
		{	out.println("<h1>Dashboard</h1>");
		out.print("Welcome  "+username);
		out.print("<br><br><br><a href='logoutsucess'>Logout here</a>");


		}
		else {
			out.print("<h2>Sorry, Username and password don't match. Try again!</h2>");
		   
		}
	}	
	public String getServletInfo()
	{
		return null;
	}
	public void destroy()
	{
		
	}
}
