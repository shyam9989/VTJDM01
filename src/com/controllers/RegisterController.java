package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.config.Config;

import com.model.UserModel;
import com.service.RegisterService;
import com.utils.UserNotfoundException;


@WebServlet("/register")
public class RegisterController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		PrintWriter out=resp.getWriter();
		RegisterService loginService=Config.getLoginService();

		UserModel um = new UserModel();
		um.setName(name);
		um.setPassword(password);
		um.setEmailid(email);
		um.setAddress(address);
		
		try {
			boolean status=loginService.registerUser(um);
			String alert = "<div class=\"alert alert-success wrap-input100\">\n" +
                    "                        <p style=\"font-family: Ubuntu-Bold; font-size: 18px; margin: 0.25em 0; text-align: center; color:#FFF;\">\n" +
                    "                            Registration Success\n" +
                    "                        </p>\n" +
                    "                    </div>";
			req.setAttribute("alert",alert);
		     req.getRequestDispatcher("login.jsp").forward(req, resp);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UserNotfoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.print(e.getMessage());
		}

	}

}
