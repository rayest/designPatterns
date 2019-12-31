package cn.rayest.decorator.report.report.impl;


import cn.rayest.decorator.report.report.SchoolReport;

// 四年级成绩单
public class FourthGradeSchoolReport extends SchoolReport {
    public void report() {
        System.out.println("显示成绩单");
    }

    public void sign(String name) {
        System.out.println("家长签名: " + name);
    }
}
