package cn.rayest.visitor.soldier.impl;

import cn.rayest.visitor.soldier.Soldier;
import cn.rayest.visitor.visitor.Visitor;

public class Rider implements Soldier {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void attack(){
        System.out.println("Rider 发起进攻");
    }

    public void retreat(){
        System.out.println("Rider 发起撤退");
    }
}
