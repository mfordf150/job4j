package ru.job4j.oop.inheritance;

public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }

    public static class ReportUsage {
        public static void main(String[] args) {
            JSONReport report = new JSONReport();
            HtmlReport report1 = new  HtmlReport();
            String text = report.generate("name" + ",", "" + "body");
            System.out.println(text);
        }
    }


    public static class HtmlReport extends TextReport {


        public String genreate(String name, String body) {
            return "<h1>" + name + "</h1>" +
                    "<br/>" +
                    "<span>" + body + "</span>";
        }
    }


    public static class JSONReport extends TextReport {
        @Override
        public String generate(String name, String body) {
            return String.format("{\n name: %s \n body: %s \n}", name, body);
        }
    }

}



