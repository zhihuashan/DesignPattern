package com.designMode.decoratePattern.one;
//脱咖啡因咖啡
public class Decaf extends Beverage{
    public Decaf(Bev bev1) {
        description = "Decaf";
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
        return 1.05;
    }
}
