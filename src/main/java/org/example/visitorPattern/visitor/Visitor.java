package org.example.visitorPattern.visitor;

import org.example.visitorPattern.ScenerySpot.imp.DolphinSpot;
import org.example.visitorPattern.ScenerySpot.imp.LeopardSpot;

// 抽象游客
public interface Visitor {
    // 参观猎豹馆
    void visitorLeopardSpot(LeopardSpot leopardSpot);

    // 参观海报馆
    void visitDolphinSpot(DolphinSpot dolphinSpot);

}
