package be.pxl.dummy.servlet;

import be.pxl.dummy.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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

