package com.woshidaniu.designpattern.行为.策略.calpriceannotationmultiple;

/**
 * Created by kang on 2018/7/7.
 */
@TotalValidRegion(@ValidRegion(min=1000,max=2000,order=99))
public class Vip implements CalPrice{

    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.8;
    }

}