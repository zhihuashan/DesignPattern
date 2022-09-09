package org.example.visitorPattern;

import org.example.visitorPattern.ScenerySpot.imp.DolphinSpot;
import org.example.visitorPattern.ScenerySpot.imp.LeopardSpot;
import org.example.visitorPattern.visitor.imp.CommonVisitor;
import org.example.visitorPattern.visitor.imp.StudentVisitor;

public class VisitorPattern {
    public static void main(String[] args) {
        Zoo zoo =  new Zoo();
        // 添加
        zoo.add(new LeopardSpot());
        zoo.add(new DolphinSpot());

        //接待学生访问者
        zoo.accept(new StudentVisitor());

        // 接待普通访问者
        zoo.accept(new CommonVisitor());
    }
}
