package com.designMode.visitorPattern;

import com.designMode.visitorPattern.ScenerySpot.imp.DolphinSpot;
import com.designMode.visitorPattern.ScenerySpot.imp.LeopardSpot;
import com.designMode.visitorPattern.visitor.imp.CommonVisitor;
import com.designMode.visitorPattern.visitor.imp.StudentVisitor;

public class VisitorPattern {
    public static void main(String[] args) {
        Zoo zoo =  new Zoo();
        // 添加两种场馆
        zoo.add(new LeopardSpot());
        zoo.add(new DolphinSpot());

        // 场馆接待学生访问者 每个场馆都需要单独接待访问者
        zoo.accept(new StudentVisitor());

        // 场馆接待普通访问者
        zoo.accept(new CommonVisitor());
    }
}
