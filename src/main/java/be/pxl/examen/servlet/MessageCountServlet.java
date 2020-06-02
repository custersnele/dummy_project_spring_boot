package be.pxl.examen.servlet;

import be.pxl.examen.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/messagecount")
public class MessageCountServlet extends HttpServlet {

	@Autowired
	private MessageService messageService;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		long count = messageService.countMessages();
		try (PrintWriter out = resp.getWriter()) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>Er zijn momenteel  " + count + " boodschappen.</h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}
}

