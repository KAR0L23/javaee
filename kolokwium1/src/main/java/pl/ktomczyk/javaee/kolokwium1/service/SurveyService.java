package pl.ktomczyk.javaee.kolokwium1.service;

import pl.ktomczyk.javaee.kolokwium1.domain.Survey;

import java.util.ArrayList;
import java.util.List;

public class SurveyService {
    private List<Survey> db = new ArrayList<Survey>();

    public void addSurvey(Survey survey) {
        Survey newSurvey = new Survey(survey.getName(), survey.getFrom(), survey.getTo(), survey.getFrequency(), survey.getSubjects());
        db.add(newSurvey);
    }

    public List<Survey> getAllSurveys() {
        return db;
    }

    public void removeSurvey(Survey survey) {
        db.remove(survey);
    }
}

