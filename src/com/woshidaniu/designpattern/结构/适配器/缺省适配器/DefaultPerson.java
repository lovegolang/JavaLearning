package com.woshidaniu.designpattern.结构.适配器.缺省适配器;

/**
 * Created by kang on 2018/7/7.
 */
//         1，第一种类适配器，一般是针对适配目标是接口的情况下使用。
//
//                 2，第二种对象适配器，一般是针对适配目标是类或者是需要复用的对象多于一个的时候使用，这里再专门提示一下，对象适配器有时候是为了将多个类一起适配，所以才不得不使用组合的方式，而且我们采用对象适配器的时候，继承也不是必须的，而是根据实际的类之间的关系来进行处理，上述例子当中一定要直接或间接的继承自BaseEntity是为了不破坏我们原来的继承体系，但有些情况下这并不是必须的。
//
//                 对于第三个缺省适配器，一般是为了弥补接口过大所犯下的过错，但是也请注意衡量利弊，权衡好以后再考虑是否要使用缺省适配器。
//

public class DefaultPerson implements  Person {
    @Override
    public void speak() {

    }

    @Override
    public void listen() {

    }

    @Override
    public void work() {

    }
}
