package com.designMode.decoratePattern.one;
// 一种咖啡
public class HouseBlend extends Beverage{
    public HouseBlend(Bev bev1) {
        bev = bev1;
        description = "HouseBlend";
    }

    public Bev getBev() {
        return bev;
    }

    public void setBev(Bev bev){
        this.bev = bev;
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
