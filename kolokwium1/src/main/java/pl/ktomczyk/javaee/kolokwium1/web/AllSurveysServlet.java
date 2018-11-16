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
import java.util.List;

@WebServlet("/surveys")
public class AllSurveysServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        SurveyService ns = (SurveyService)getServletContext().getAttribute("app_news");

        List<Survey> allSurveys = ns.getAllSurveys();

        out.append("<html><body><h2>Wszystkie survey:</h2>");
        out.append("<p>Tutaj zapisane są wszystkie dodane ankety</p><br>");

        for (Survey survey: allSurveys) {
                out.append("<form action='deleteSurvey'>");
                out.append("<input type='hidden' name='name' value='" + survey.getName() + "'/>");
                out.append("<p>Imię: " + survey.getName() + "</p>");
                out.append("<p>Od: " + survey.getFrom() + "</p>");
                out.append("<p>Do: " + survey.getTo() + "</p>");
                out.append("<p>Czestotliwosc korzystania: " + survey.getFrequency() + "</p>");
                out.append("<p>Tematy: " + survey.getSubjects() + "</p>");
                out.append("<input type='submit' value='Usun' />");
                out.append("</form>");
        }

        out.append("</body></html>");
        out.close();

    }

    @Override
    public void init() throws ServletException {

        
        getServletContext().setAttribute("app_news", new SurveyService());
    }
}

