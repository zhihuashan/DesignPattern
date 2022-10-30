package com.designMode.decoratePattern.one;

public class DarkRoast extends Beverage{

    public DarkRoast(Bev bev1) {
        description = "DarkRoast";
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
        return 0.99;
    }
}
