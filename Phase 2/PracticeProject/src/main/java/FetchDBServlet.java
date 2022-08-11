

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class FetchDBServlet
 */
@WebServlet("/list")

public class FetchDBServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		Properties  props= new Properties();
		
		InputStream in=getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
		
		
		Connection conn= DBConfig.getConnection(props);
		
		
		if(conn!=null) {
			
			Statement stmt;
			try {
				stmt = conn.createStatement();
				ResultSet rs=stmt.executeQuery("select * from product");
				
				out.print("<table border=1 cellpadding=10 cellspacing=0> <thead><tr>");
				out.print("<th>ID</th><th>ProductName</th><th>ProductBrand</th><th>Price</th><th>Quantity</th>");
				out.print("<tr></thead>");
				out.print("<tbody>");
				
				while(rs.next()) {
					
					out.print("<tr>");
					//out.print(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getBigDecimal(3)+" "+rs.getTimestamp(4)+"<br>");
					out.print("<td>"+rs.getInt(1)+"</td>");
					out.print("<td>"+rs.getString(2)+"</td>");
					out.print("<td>"+rs.getString(3)+"</td>");
					out.print("<td>"+rs.getInt(4)+"</td>");
					out.print("<td>"+rs.getInt(5)+"</td>");
					out.print("</tr>");
				}
				
				out.print("</tbody></table>");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		else {
			
			out.print("Error While Connecting Connections");
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	
}