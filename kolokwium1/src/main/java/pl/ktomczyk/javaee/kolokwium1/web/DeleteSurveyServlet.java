package pl.ktomczyk.javaee.kolokwium1.web;

import pl.ktomczyk.javaee.kolokwium1.domain.Survey;
import pl.ktomczyk.javaee.kolokwium1.service.SurveyService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

@WebServlet("/deleteSurvey")
public class DeleteSurveyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        SurveyService ns = (SurveyService)getServletContext().getAttribute("app_news");

        List<Survey> allSurveys = ns.getAllSurveys();

        String name = request.getParameter("name");

        for (Iterator<Survey> iter = allSurveys.listIterator(); iter.hasNext(); ) {
            Survey a = iter.next();
            if (a.getName().equals(name)) {
                iter.remove();
                out.append("<p>Usunieto z surveya</p>");
            }
        }

        out.append("<a href='surveys'>Przenies do wszystkich surveyow</a>");
        out.append("</body></html>");
        out.close();

    }

    @Override
    public void init() throws ServletException {

        
        getServletContext().setAttribute("app_news", new SurveyService());
    }
}

