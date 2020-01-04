package cn.rayest.visitor;

import cn.rayest.visitor.soldier.Soldier;
import cn.rayest.visitor.soldier.impl.Archer;
import cn.rayest.visitor.soldier.impl.Gunner;
import cn.rayest.visitor.soldier.impl.Rider;
import cn.rayest.visitor.visitor.impl.AttackVisitor;
import cn.rayest.visitor.visitor.impl.RetreatVisitor;

import java.util.Arrays;
import java.util.List;

public class SoldierTest {
    public static void main(String[] args) {
        List<Soldier> soldiers = Arrays.asList(new Archer(), new Rider(), new Gunner());
        RetreatVisitor retreatVisitor = new RetreatVisitor();
        AttackVisitor attackVisitor = new AttackVisitor();

        for (Soldier soldier : soldiers) {
            soldier.accept(attackVisitor);
        }

        System.out.println("战争进行中...");

        for (Soldier soldier : soldiers) {
            soldier.accept(retreatVisitor);
        }
    }
}
