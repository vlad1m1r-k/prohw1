package ua.kiev.prog.hw1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

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
        Map<String, Integer> statistics = responders.getStatistics();
        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
            req.setAttribute(entry.getKey(), entry.getValue());
        }
        req.getRequestDispatcher("statistics.jsp").forward(req, resp);
    }
}
