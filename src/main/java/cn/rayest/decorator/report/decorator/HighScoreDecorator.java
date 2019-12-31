package cn.rayest.decorator.report.decorator;

import cn.rayest.decorator.report.report.SchoolReport;

public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport report) {
        super(report);
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }

    private void reportHighScore() {
        System.out.println("汇报各科最高成绩...");
    }


}
