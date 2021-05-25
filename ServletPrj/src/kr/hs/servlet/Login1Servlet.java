package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginSuccess")
public class Login1Servlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out=res.getWriter();
		String id=req.getParameter("id");
		String pass=req.getParameter("password");
		String result="";
		
		if(id.equals("user")) {
			String str="<script>alert('로그인에 성공하셨습니다');</script>";
			out.print(str);
			result="id : " + id +  "   password : " + pass;
		}else {
			String str="<script>alert('로그인에 실패하셨습니다');</script>";
		}
		req.setAttribute("info", result);
		RequestDispatcher dispatcher = req.getRequestDispatcher("login2_form.jsp");
		dispatcher.forward(req, res);
	}
}
