package cn.rayest.visitor.soldier;

import cn.rayest.visitor.visitor.Visitor;

public interface Soldier {
    void accept(Visitor visitor);
}
