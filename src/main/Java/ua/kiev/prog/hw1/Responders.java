package ua.kiev.prog.hw1;

import java.util.ArrayList;

public class Responders {
    private ArrayList<Responder> responders = new ArrayList<>();

    public void addResponder(Responder responder) {
        responders.add(responder);
    }

    public String getStatistics() {
        StringBuilder result = new StringBuilder();
        int avrAge = 0;
        int q1An1 = 0;
        int q1An2 = 0;
        int q2An1 = 0;
        int q2An2 = 0;
        for (Responder responder : responders) {
            avrAge += responder.getAge();
            if (responder.getQuestion1() == Responder.Response.RESPONSE1) {
                q1An1++;
            } else {
                q1An2++;
            }
            if (responder.getQuestion2() == Responder.Response.RESPONSE1) {
                q2An1++;
            } else {
                q2An2++;
            }
        }
        avrAge /= responders.size();
        result.append("<table border=\"1\">\n");
        result.append("<tr><td>Количество опрошенных: </td><td>" + responders.size() + "</td></tr>\n");
        result.append("<tr><td>Средний возраст Опрошенных: </td><td>" + avrAge + "</td></tr>\n");
        result.append("<tr><td>Количество атомов во вселенной</td><td>Нормальное " + q1An1 + " (" + (float)q1An1 / (float)responders.size() * 100 + "%)</td></tr>\n");
        result.append("<tr><td></td><td>Приемлемое " + q1An2 + " (" + (float)q1An2 / (float)responders.size() * 100 + "%)</td></tr>\n");
        result.append("<tr><td>Температура солнца</td><td>Средняя " + q2An1 + " (" + (float)q2An1 / (float)responders.size() * 100 + "%)</td></tr>\n");
        result.append("<tr><td></td><td>Положительная " + q2An2 + " (" + (float)q2An2 / (float)responders.size() * 100 + "%)</td></tr>\n");
        result.append("</table>\n");
        return result.toString();
    }
}
