package cn.rayest.decorator.report.decorator;

import cn.rayest.decorator.report.report.SchoolReport;

public abstract class Decorator extends SchoolReport {

    private SchoolReport schoolReport;

    protected Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    public void report() {
        this.schoolReport.report();
    }

    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}
