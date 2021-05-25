package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member")
public class member extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out=res.getWriter();
		String id=req.getParameter("id");
		String password=req.getParameter("password");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		
		System.out.println("아이디 : " + id );
		System.out.println("비밀번호 : " + password );
		System.out.println("이름 : " + name );
		System.out.println("나이 : " + age );
		
		List<String> array = new ArrayList<String>();
		array.add(id);
		array.add(password);
		array.add(name);
		array.add(age);
		req.setAttribute("member", array);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("member_result.jsp");
		dispatcher.forward(req, res);
		
	}
}
