package AdvanceJavaTasks;

import java.util.*;

public class CloudWatchLogs {

    public static List<List<String>> filterLogs(List<List<String>> logs) {
        List<List<String>> result = new ArrayList<>();

        for (List<String> log : logs) {
            String status = log.get(2);
            if (status.equals("ERROR") || status.equals("CRITICAL")) {
                result.add(log);
            }
        }

        Collections.sort(result, (a, b) -> {
            String dateTimeA = a.get(0) + " " + a.get(1);
            String dateTimeB = b.get(0) + " " + b.get(1);
            return dateTimeA.compareTo(dateTimeB);
        });

        return result;
    }

    public static void main(String[] args) {

        List<List<String>> logs = Arrays.asList(
                Arrays.asList("01-01-2023", "14:00", "ERROR", "failed"),
                Arrays.asList("01-01-2023", "15:00", "INFO", "established"),
                Arrays.asList("01-01-2023", "01:30", "ERROR", "failed"),

                Arrays.asList("02-01-2023", "09:15", "CRITICAL", "disk failure"),
                Arrays.asList("02-01-2023", "09:15", "ERROR", "network timeout"), // same time
                Arrays.asList("02-01-2023", "10:00", "WARN", "high memory usage"),

                Arrays.asList("31-12-2022", "23:59", "ERROR", "unexpected shutdown"),
                Arrays.asList("01-01-2023", "00:01", "CRITICAL", "startup failure"),

                Arrays.asList("03-01-2023", "08:45", "INFO", "service started"),
                Arrays.asList("03-01-2023", "08:50", "ERROR", "service crashed"),

                Arrays.asList("01-01-2023", "14:00", "CRITICAL", "database down") // same date & time as earlier ERROR
        );

        List<List<String>> filteredLogs = filterLogs(logs);

        for (List<String> log : filteredLogs) {
            System.out.println(log);
        }
    }
}
