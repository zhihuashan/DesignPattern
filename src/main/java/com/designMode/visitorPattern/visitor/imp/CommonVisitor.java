package com.designMode.visitorPattern.visitor.imp;

import com.designMode.visitorPattern.ScenerySpot.imp.DolphinSpot;
import com.designMode.visitorPattern.ScenerySpot.imp.LeopardSpot;
import com.designMode.visitorPattern.visitor.Visitor;

// 普通游客
public class CommonVisitor implements Visitor {
    @Override
    public void visitorLeopardSpot(LeopardSpot leopardSpot) {
        System.out.println("普通游客游览豹子馆票价:" + leopardSpot.ticketRate());
    }

    @Override
    public void visitDolphinSpot(DolphinSpot dolphinSpot) {
        System.out.println("普通游客游览海豹馆票价:" + dolphinSpot.ticketRate());
    }
}
