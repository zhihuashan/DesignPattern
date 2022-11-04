package com.designMode.visitorPattern.ScenerySpot.imp;

import com.designMode.visitorPattern.ScenerySpot.ScenerySpot;
import com.designMode.visitorPattern.visitor.Visitor;

// 具体元素:海豚馆
public class DolphinSpot implements ScenerySpot {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitDolphinSpot(this);
    }

    @Override
    public Integer ticketRate() {
        // 票价
        return 2000;
    }
}
