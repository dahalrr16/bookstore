package com.sang.servlet;
	

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sang.dao.MySqlCon;
import com.sang.model.Book;
import com.sang.model.Book;

@WebServlet("/Book/register")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public BookServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter output=response.getWriter();
		
		//Capturing the data from UI
		String title =request.getParameter("title");
		String author =request.getParameter("author");
		String priceInString =request.getParameter("price");
		 double price=0.00;
		    try {
				price=Double.parseDouble(priceInString);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
			}

		
	   // Printing the data in UI
		output.println("Book Title="+title);
		output.println("Book Author="+author);
		output.println("Book Price="+price);
		
		//making one account object and setting the data from UI to account object
		Book bk= new Book();
		bk.setTitle(title);
		bk.setAuthor(author);
		bk.setPrice(price);
		//printing the account in console
				System.out.println("book detail from ui "+bk.toString());
				
		
	 //getting values as variables
		String bookTitle=bk.getTitle();
		String bookAuthor=bk.getAuthor();
		double bookPrice=bk.getPrice();
		
		
		//Getting connection for MySql
		
		MySqlCon mySqlCon=new MySqlCon();
		try {
			Connection conn=mySqlCon.getConnection();
		//	Statement stmt=conn.createStatement();  
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO `book`(title, author, price) VALUE(?,?,?);");
			pstmt.setString(1,bookTitle);
			pstmt.setString(2, bookAuthor);
			pstmt.setDouble(3, bookPrice);
	        pstmt.executeUpdate();
	        
	        
	        
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        
				
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
