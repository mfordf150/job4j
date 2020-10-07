package ru.job4j.oop.inheritance;

public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }

    public class ReportUsage {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
    }

    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }

    public class HtmlReport extends TextReport {
        public String generate(String name, String body) {

            return "<h1>" + name + "</h1>" +
                    "<br/>" +
                    "<span>" + body + "</span>";
        }
    }

}