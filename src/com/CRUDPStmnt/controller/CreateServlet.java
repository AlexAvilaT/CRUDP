package com.CRUDPStmnt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CRUDPStmnt.model.Employee;
/**
 * Servlet implementation class CreateServlet
 */
@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
  	/**
  	 * post method that allows me to create an employee
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		// TODO Auto-generated method stub
		response.setContentType("text/html charset ='utf-8'");
		PrintWriter output = response.getWriter();
		
		Employee myEmployee = new Employee();
		
		
		//myEmployee.setIdEmployee(Integer.parseInt(request.getParameter("txtIdEmployee")));
		
		myEmployee.setNameEmployee(request.getParameter("txtNameEmployee"));
		
		myEmployee.setAgeEmployee(Integer.parseInt(request.getParameter("txtAgeEmployee")));
		
		myEmployee.setAdressEmployee(request.getParameter("txtAdressEmployee"));
		
		myEmployee.setSalaryEmployee(Double.parseDouble(request.getParameter("txtSalaryEmployee")));
	
		myEmployee.setDepartmentEmployee(request.getParameter("txtDepartmentEmployee"));
		
		//1.- declarar variables
		
		String urlServer = "jdbc:mysql://localhost:3306/tiendita?useSSL=false&serverTimezone=UTC";
		String nameUser = "root";
		String password = "root";
		int rowsAffected =0;
		String sentenciaSQLPStatement = "INSERT INTO Employees (NameEmployee, AgeEmployee, AdressEmployee, SalaryEmployee, DepartmentEmployee) VALUES (?,?,?,?,?)" ;
		
		//2.- declarar constantes
		
		Connection conn = null;
		PreparedStatement pstmnt = null;
		
		//3.- instanciar el driver
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			
			//4 abrir conexion
			
			conn = DriverManager.getConnection(urlServer, nameUser, password);
			
			//5 configuramos el prepared statement
			pstmnt = conn.prepareStatement(sentenciaSQLPStatement);
			pstmnt.setString(1, myEmployee.getNameEmployee());
			pstmnt.setInt(2, myEmployee.getAgeEmployee());
			pstmnt.setString(3, myEmployee.getAdressEmployee());
			pstmnt.setDouble(4, myEmployee.getSalaryEmployee());
			pstmnt.setString(5, myEmployee.getDepartmentEmployee());
			
			
			
			//6. ejecutar la query
			
			rowsAffected = pstmnt.executeUpdate();
			if(rowsAffected>0)
			{
				output.append("Registro añadido con exito");
			}
			else
			{
				output.append("tas todo sope");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				pstmnt.close();
				conn.close();	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
		output.close();
		
	}

}
