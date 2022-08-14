
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Product;
import com.test.SaveObject;

@WebServlet("/add")
public class RegisterServlet extends  HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get the printWriter
		PrintWriter pw = res.getWriter();
		//set Contenet Type
		res.setContentType("text/html");
		//read the form dat
		String pname = req.getParameter("pname");
		String price = req.getParameter("price");
		String brand = req.getParameter("brand");
		String quantity = req.getParameter("quantity");
		
	     Product pr = new Product();
		pr.setPname(pname);
		pr.setPrice(price);
		pr.setBrand(brand);
		pr.setQuantity(quantity);
		
		int count = SaveObject.save(pr);
		
		if(count==0) {
			pw.println("<h2Product not added......</h2>");
			pw.println("<a href='form.html'>Home</a>");
		}else {
			pw.println("<h2>Product Added Successfully</h2>");
			pw.println("<a href='form.html'>Home</a>");
		}
		//close the stream
		pw.close();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}