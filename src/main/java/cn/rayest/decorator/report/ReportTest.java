package cn.rayest.decorator.report;

import cn.rayest.decorator.report.decorator.HighScoreDecorator;
import cn.rayest.decorator.report.decorator.ScoreSortDecorator;
import cn.rayest.decorator.report.report.SchoolReport;
import cn.rayest.decorator.report.report.impl.FourthGradeSchoolReport;

public class ReportTest {
    public static void main(String[] args) {
        SchoolReport report = new FourthGradeSchoolReport();
        report = new HighScoreDecorator(report);
        report = new ScoreSortDecorator(report);
        report.report();
        report.sign("lee");
    }
}
