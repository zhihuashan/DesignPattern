package org.example.visitorPattern.ScenerySpot;

import org.example.visitorPattern.visitor.Visitor;

// 抽象元素：场馆景点
public interface ScenerySpot {
    // 接待访问者
    void accept(Visitor visitor);
    // 票价
    Integer ticketRate();
}
