package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/odd")
public class Odd extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out=res.getWriter();
		out.println("<html><head><title>홀짝 판별</title></head><body>");
		int a=3;
		if(a%2 == 0) {
			out.print("<h1>짝수 입니다.</h1>");
		}else {
			out.print("<h1>홀수 입니다</h1></body></html>");
		}
	}
}
