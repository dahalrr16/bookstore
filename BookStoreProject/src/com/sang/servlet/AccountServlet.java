package com.sang.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sang.model.Account;
import com.sang.dao.MySqlCon;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/Account/register")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   public AccountServlet() {
	        super();
	       
	    }

		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			PrintWriter output=response.getWriter();
			output.println("Hello");
			
			
			//capturing the data from the UI
			String uname =request.getParameter("uname");
			String emailId =request.getParameter("emailId");
			String psw =request.getParameter("psw");
		    String ageInString=request.getParameter("age");//123
		    int age=0;
		    try {
				age=Integer.parseInt(ageInString);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
			}
	
			
// Printing the data in UI 
			output.println("User name=  "+uname);
			output.println("Email id=  "+emailId);
			output.println("password= "+psw);
			output.print("Age= "+age);
			
	//making one account object and setting the data from UI to account object 		
		Account a= new Account();
		a.setUname(uname);
		a.setEmailId(emailId);
		a.setPsw(psw);
		a.setAge(age);
		//printing the account in console
		System.out.println("account detail from ui "+a.toString());
		
		//getting values as variables 
	String name=a.getUname();
	String email=a.getEmailId();
	String password=a.getPsw();
	int age2=a.getAge();
	
	//Getting connection for MySql
		
	MySqlCon mySqlCon=new MySqlCon();
	try {
		Connection conn=mySqlCon.getConnection();
	//	Statement stmt=conn.createStatement();  
		PreparedStatement pstmt = conn.prepareStatement("INSERT INTO `account`(uname, emailId, psw, age) VALUE(?,?,?,?);");
		pstmt.setString(1, name);
		pstmt.setString(2, email);
        pstmt.setString(3, password);
        pstmt.setInt(4, age2);
        pstmt.executeUpdate();
        
        
	//	String query="select * from Account where id=1";
	//	String query="INSERT INTO `service`.`account` ( `uname`, `emailId`, `psw`) VALUES ( 'lekh', 'lekhdahal2010@gmail.com', 'jpt');";
//		String query="INSERT INTO `service`.`account` ( `uname`, `emailId`, `psw`) VALUES ( name, email, password);";
		
	//	ResultSet rs=stmt.executeQuery(query);  
//		while(rs.next())  
//			System.out.println("id  "+rs.getInt(1)+"  name:"+rs.getString(2));  
			conn.close();  
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		}

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter output=response.getWriter();
			output.println("Hello");
			doGet(request, response);
		}

	}

	
	
	


