package cn.rayest.decorator.report.decorator;

import cn.rayest.decorator.report.report.SchoolReport;

public class ScoreSortDecorator extends Decorator {
    public ScoreSortDecorator(SchoolReport report) {
        super(report);
    }

    @Override
    public void report(){
        super.report();
        this.reportSort();
    }

    private void reportSort() {
        System.out.println("汇报成绩排名");
    }
}
