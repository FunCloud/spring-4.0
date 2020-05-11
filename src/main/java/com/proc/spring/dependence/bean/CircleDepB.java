package com.proc.spring.dependence.bean;

/**
 * Created by fangjianhui on 2020/5/8.
 */
public class CircleDepB {

    private CircleDepA circleDepA;

    public void doDepBMethod(){
        System.out.println("this is DepBMethod...");
    }

    public void doDepAMethod(){
        circleDepA.doDepAMethod();
    }

    public CircleDepA getCircleDepA() {
        return circleDepA;
    }

    public void setCircleDepA(CircleDepA circleDepA) {
        this.circleDepA = circleDepA;
    }
}
