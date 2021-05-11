package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out=res.getWriter();
		String id=req.getParameter("id");
		String password=req.getParameter("password");
		String name=req.getParameter("name");
		
		String [] habby=req.getParameterValues("hobby");
		String gender=req.getParameter("gender");
		
		String job=req.getParameter("job");
		String contents=req.getParameter("contents");
		
		out.print("아이디 : " + id + "<br>");
		out.print("비밀번호 : " + password + " <br>");
		out.print("이름 : " + name + "<br>");
		
		out.print("취미 : " );
		for(String hol : habby) {
			out.print(hol );
		}
		out.print("<br>" + "성별 : " + gender + "<br>");
		out.print("직업 : " + job + "<br>");
		out.print("내용 : " + contents + "<br>");
		
		
		
	}
}
