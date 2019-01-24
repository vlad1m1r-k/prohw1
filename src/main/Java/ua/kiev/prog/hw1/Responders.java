package ua.kiev.prog.hw1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Responders {
    private ArrayList<Responder> responders = new ArrayList<>();

    public void addResponder(Responder responder) {
        responders.add(responder);
    }

    public Map<String, Integer> getStatistics() {
        Map<String, Integer> statistics = new HashMap<>();
        statistics.put("totalResponders", responders.size());
        statistics.put("averageAge", 0);
        statistics.put("question1Answer1", 0);
        statistics.put("question1Answer2", 0);
        statistics.put("question2Answer1", 0);
        statistics.put("question2Answer2", 0);
        for (Responder responder : responders) {
            statistics.put("averageAge", statistics.get("averageAge") + responder.getAge());
            if (responder.getQuestion1() == Responder.Response.RESPONSE1) {
                statistics.put("question1Answer1", (statistics.get("question1Answer1") + 1));
            } else {
                statistics.put("question1Answer2", (statistics.get("question1Answer2") + 1));
            }
            if (responder.getQuestion2() == Responder.Response.RESPONSE1) {
                statistics.put("question2Answer1", (statistics.get("question2Answer1") + 1));
            } else {
                statistics.put("question2Answer2", (statistics.get("question2Answer2") + 1));
            }
        }
        statistics.put("averageAge", statistics.get("averageAge") / responders.size());
        return statistics;
    }
}
