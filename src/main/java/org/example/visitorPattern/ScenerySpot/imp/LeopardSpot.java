package org.example.visitorPattern.ScenerySpot.imp;

import org.example.visitorPattern.ScenerySpot.ScenerySpot;
import org.example.visitorPattern.visitor.Visitor;

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
