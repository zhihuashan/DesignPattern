package com.designMode.visitorPattern.ScenerySpot.imp;

import com.designMode.visitorPattern.ScenerySpot.ScenerySpot;
import com.designMode.visitorPattern.visitor.Visitor;

// 具体元素
public class LeopardSpot implements ScenerySpot {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitorLeopardSpot(this);
    }

    @Override
    public Integer ticketRate() {
        return 1500;
    }
}
