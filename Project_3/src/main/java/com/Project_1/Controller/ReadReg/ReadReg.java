package com.Project_1.Controller.ReadReg;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Project_1.model.SLVservice;
import com.Project_1.model.SLVservice_impl;
@WebServlet("/ReadReg")
public class ReadReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ReadReg() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SLVservice service = new SLVservice_impl();
		service.ConnectDB();
		ResultSet res = service.ReadReg();
		request.setAttribute("result", res);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/viewrej.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
