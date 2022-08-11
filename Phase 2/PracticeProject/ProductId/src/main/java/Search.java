

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Search() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int ProductId=Integer.parseInt(request.getParameter("p_id"));
			
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root","rosevarghese");
			PreparedStatement ps=con.prepareStatement("select * from product where p_id= ?");
			ps.setInt(1, ProductId);
			out.println("<table width=75% border=1>");
			     out.println("<caption><h1>Product Details</h1></caption>");
			     ResultSet rs=ps.executeQuery();
			     
			     ResultSetMetaData rsmd=rs.getMetaData();
			     int totalcolumn=rsmd.getColumnCount();
			     out.print("<tr>");
			    
			     for(int i=1;i<=totalcolumn;i++)
			     {
			    	 out.print("<th>"+rsmd.getColumnName(i)+"</th>");
			    	 
			     }
			     out.print("<tr>");
			     while(rs.next())
			     {
			    	 out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getInt(4)+"</td><td>"+rs.getInt(5)+"</td></tr>");
			     }
			     out.print("</table>");
			
		}
		catch(Exception e)
		{
			out.print(e);
		}
	}
}