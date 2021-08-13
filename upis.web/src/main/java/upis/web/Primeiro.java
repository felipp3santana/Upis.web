package upis.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ops")
public class Primeiro extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Método HTTP POST</h1>");
		out.println("<h3>Seja bem vindo! <br /><br /> Usuário: "+req.getParameter("user") + "<br /> Senha: " + req.getParameter("password") + "</h3>");
		out.println("</body>");
		out.println("</html>");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Método HTTP GET</h1>");
		out.println("<h1>Seja bem vindo, "+req.getParameter("nome") + " " + req.getParameter("sobrenome") + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
