package org.example.visitorPattern.visitor.imp;

import org.example.visitorPattern.ScenerySpot.imp.DolphinSpot;
import org.example.visitorPattern.ScenerySpot.imp.LeopardSpot;
import org.example.visitorPattern.visitor.Visitor;

public class StudentVisitor implements Visitor {
    @Override
    public void visitorLeopardSpot(LeopardSpot leopardSpot) {
        // 学生价格5折
        int v = (int) (leopardSpot.ticketRate() * 0.5);
        System.out.println("学生游客游览豹子馆票价:" + v);
    }

    @Override
    public void visitDolphinSpot(DolphinSpot dolphinSpot) {
        //
        int v = (int) (dolphinSpot.ticketRate() * 0.5);
        System.out.println("学生游览海豹馆票价:" + v);
    }
}
