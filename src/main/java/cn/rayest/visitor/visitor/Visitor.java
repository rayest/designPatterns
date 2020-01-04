package cn.rayest.visitor.visitor;

import cn.rayest.visitor.soldier.impl.Archer;
import cn.rayest.visitor.soldier.impl.Gunner;
import cn.rayest.visitor.soldier.impl.Rider;

// 定义访问者。可以访问哪些对象
public interface Visitor {
    void visit(Archer archer);
    void visit(Gunner gunner);
    void visit(Rider rider);
}
