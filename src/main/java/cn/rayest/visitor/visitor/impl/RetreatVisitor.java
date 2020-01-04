package cn.rayest.visitor.visitor.impl;

import cn.rayest.visitor.soldier.impl.Archer;
import cn.rayest.visitor.soldier.impl.Gunner;
import cn.rayest.visitor.soldier.impl.Rider;
import cn.rayest.visitor.visitor.Visitor;

public class RetreatVisitor implements Visitor {
    @Override
    public void visit(Archer archer) {
        archer.retreat();
    }

    @Override
    public void visit(Gunner gunner) {
        gunner.retreat();
    }

    @Override
    public void visit(Rider rider) {
        rider.retreat();
    }
}
