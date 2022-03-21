package com.Project_1.Controller.Loginverify;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Project_1.model.SLVservice;
import com.Project_1.model.SLVservice_impl;
@WebServlet("/LoginVerify")
public class LoginVerify extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginVerify() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		SLVservice service = new SLVservice_impl();
		service.ConnectDB();
		boolean status = service.verifylogin(email,password);
		if (status==true) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/reg.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("error", "Invalid Email / Password");
			request.getRequestDispatcher("login.jsp");
		}
	}

}
