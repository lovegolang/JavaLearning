package com.woshidaniu.designpattern.行为.状态;

/**
 * Created by kang on 2018/7/8.
 */
public class SpeedUpState implements RunState{

    public void run(Hero hero) {
        System.out.println("--------------加速跑动---------------");
        try {
            Thread.sleep(4000);//假设加速持续4秒
        } catch (InterruptedException e) {}
        hero.setState(Hero.COMMON);
        System.out.println("------加速状态结束，变为正常状态------");
    }

}