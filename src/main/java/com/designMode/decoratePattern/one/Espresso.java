package com.designMode.decoratePattern.one;
// 浓缩咖啡
public class Espresso extends Beverage{
    public Espresso(Bev bev1) {
        description = "Espresso";
        bev = bev1;
    }

    public Bev getBev() {
        return bev;
    }

    public void setBev(Bev bev){
        this.bev = bev;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
