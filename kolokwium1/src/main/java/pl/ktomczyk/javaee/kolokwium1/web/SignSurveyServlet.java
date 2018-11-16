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

@WebServlet("/sign-survey")
public class SignSurveyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //session context
        HttpSession session = request.getSession();

        PrintWriter out = response.getWriter();

        SurveyService ns = (SurveyService)getServletContext().getAttribute("app_news");


        Survey sSurvey = null;
        String name = request.getParameter("name");
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        String frequency = request.getParameter("frequency");
        String selectedSubjects = "";

        for (String subject : request.getParameterValues("subjects")) {
            selectedSubjects += subject + " ";
        }

        if (session.getAttribute("sess_news") == null) {
            sSurvey = new Survey(name, from, to, frequency, selectedSubjects);
            ns.addSurvey(sSurvey);
        } else {
            sSurvey = (Survey) session.getAttribute("sess_news");
            ns.removeSurvey(sSurvey);

            sSurvey = new Survey(name, from, to, frequency, selectedSubjects);

//            sSurvey.setName(name);
//            sSurvey.setFrom(from);
//            sSurvey.setTo(to);
//            sSurvey.setFrequency(frequency);
//            sSurvey.setSubjects(selectedSubjects);

            ns.addSurvey(sSurvey);
        }


        session.setAttribute("sess_news", sSurvey);

        response.sendRedirect("thanks.jsp");
    }

    @Override
    public void init() throws ServletException {

        // application context
        getServletContext().setAttribute("app_news", new SurveyService());
    }
}

