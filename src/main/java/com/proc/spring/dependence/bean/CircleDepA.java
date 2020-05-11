package com.proc.spring.dependence.bean;

/**
 * Created by fangjianhui on 2020/5/8.
 */
public class CircleDepA {

    private CircleDepB circleDepB;

    public void doDepBMethod(){
        circleDepB.doDepBMethod();
    }

    public void doDepAMethod(){
        System.out.println("this is DepAMethod...");
    }

    public CircleDepB getCircleDepB() {
        return circleDepB;
    }

    public void setCircleDepB(CircleDepB circleDepB) {
        this.circleDepB = circleDepB;
    }
}
