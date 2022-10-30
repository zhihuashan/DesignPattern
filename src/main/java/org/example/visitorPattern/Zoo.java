package org.example.visitorPattern;

import org.example.visitorPattern.ScenerySpot.ScenerySpot;
import org.example.visitorPattern.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

// 对象结构
public class Zoo {
    // 场馆集合
    private List<ScenerySpot> list = new ArrayList<ScenerySpot>();

    // 接待游客 反转执行访问者的访问方法
    public void accept(Visitor visitor){
        // 遍历所有可以访问的场馆
        for(ScenerySpot scenerySpot : list){
            // 游客访问场馆
            scenerySpot.accept(visitor);
        }
    }

    public void add(ScenerySpot scenerySpot){
        list.add(scenerySpot);
    }

    public  void remove(ScenerySpot scenerySpot){
        list.remove(scenerySpot);
    }
}
