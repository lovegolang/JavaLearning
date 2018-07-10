package com.woshidaniu.designpattern.行为.职责链.demo;

import java.util.Collections;
import java.util.Map;

/**
 * Created by kang on 2018/7/8.
 */
//麦当劳分店
public class McSubbranch {

    private final static int MIN_DISTANCE = 500;//假设是500米以内送餐

    private static int count;//类计数

    private final int number;//分店号

    private int x;//分店的横坐标，用于判断距离

    private int y;//分店的纵坐标，用于判断距离

    private Map<String, Integer> menu;//菜单

    public McSubbranch(int x, int y, Map<String, Integer> menu) {
        super();
        this.x = x;
        this.y = y;
        this.menu = menu;
        number = ++count;
    }

    public boolean order(int x,int y,Map<String, Integer> order){
        //如果距离小于500米并且订单中的食物不缺货，则订单成功，否则失败
        if (CommonUtils.getDistance(x, y, this.x, this.y) < MIN_DISTANCE && !CommonUtils.outOfStock(menu, order)) {
            for (String name : order.keySet()) {
                menu.put(name, menu.get(name) - order.get(name));
            }
            return true;
        }else {
            return false;
        }
    }

    public Map<String, Integer> getMenu() {
        return Collections.unmodifiableMap(menu);
    }

    public String toString() {
        return "麦当劳分店第" + number + "个";
    }



}