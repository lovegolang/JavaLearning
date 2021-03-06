package com.woshidaniu.designpattern.结构.外观;

/**
 * Created by kang on 2018/7/7.
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new FacadeImpl();
        facade.function12();
        System.out.println("-------------------------");
        facade.function23();
        System.out.println("-------------------------");
        facade.function123();

        /*  以上为使用了外观模式的调用方式，以下为原始方式   */

        System.out.println("-------------以下原始方式--------------");
        Sub1 sub1 = new Sub1Impl();
        Sub2 sub2 = new Sub2Impl();
        Sub3 sub3 = new Sub3Impl();
        sub1.function1();
        sub2.function2();
        System.out.println("-------------------------");
        sub2.function2();
        sub3.function3();
        System.out.println("-------------------------");
        sub1.function1();
        sub2.function2();
        sub3.function3();
    }
}
