package com.designMode.decoratePattern.one;
// 星巴克咖啡超类
// component 被装饰的组件
public abstract class Beverage {
    // 杯子大小
    Bev bev;
    String description = "Unknown Beverage";

    public Bev getBev() {
        return null;
    }

    public void setBev(Bev bev){
        return;
    }
    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
