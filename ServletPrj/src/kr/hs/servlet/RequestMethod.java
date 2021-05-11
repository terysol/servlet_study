package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/req")
public class RequestMethod extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out=res.getWriter();
		out.print("<html><head><title>요청 방식</title></head><body>");
		out.print("request URI : " + req.getRequestURI() + "<br>");
		out.print("Server name : " + req.getServerName()+ "<br>");
		out.print("Server Port : " + req.getServerPort()+ "<br>");
		out.print("client addr : " + req.getRemoteAddr()+ "<br>");
		out.print("client Host : " + req.getRemoteHost()+ "<br>");
		out.print("client Port : " + req.getRemotePort() + "</body></html>");
		
		
	}
}
