package com.woshidaniu.designpattern.行为.命令;

/**
 * Created by kang on 2018/7/7.
 */
public class Demand implements Task {
    private Programmer programmer;

    public Demand(Programmer programmer) {
        super();
        this.programmer = programmer;
    }

    public void handle() {
        programmer.handleDemand();
    }

    public String toString() {
        return "Demand [programmer=" + programmer.getName() + "]";
    }
}
