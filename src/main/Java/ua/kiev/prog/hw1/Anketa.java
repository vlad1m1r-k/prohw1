package ua.kiev.prog.hw1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/anketa")
public class Anketa extends HttpServlet {
    private Responders responders;

    @Override
    public void init() throws ServletException {
        responders = new Responders();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        responders.addResponder(new Responder(req.getParameter("firstname"), req.getParameter("lastname"), Integer.valueOf(req.getParameter("age")),
                Responder.Response.valueOf(req.getParameter("question1")), Responder.Response.valueOf(req.getParameter("question2"))));
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html lang=\"ru\">");
        writer.println("<head>");
        writer.println("<meta contentType=\"text/html\"; charset=\"UTF-8\">");
        writer.println("<title>Статистика опрошенных</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h2>Статистика опрошенных</h2><br>");
        writer.println(responders.getStatistics());
        writer.println("</body>");
        writer.println("</html>");
    }
}
