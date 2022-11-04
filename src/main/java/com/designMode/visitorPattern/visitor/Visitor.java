package com.designMode.visitorPattern.visitor;

import com.designMode.visitorPattern.ScenerySpot.imp.DolphinSpot;
import com.designMode.visitorPattern.ScenerySpot.imp.LeopardSpot;

// 抽象游客
public interface Visitor {
    // 参观猎豹馆
    void visitorLeopardSpot(LeopardSpot leopardSpot);

    // 参观海报馆
    void visitDolphinSpot(DolphinSpot dolphinSpot);

}
