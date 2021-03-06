package com.woshidaniu.designpattern.solid;

/**
 * Created by kang on 2018/7/5.
 */
// 迪米特原则（六大原则中最害羞的姑娘，不太爱和陌生人说话）：也称最小知道原则，即一个类应该尽量不要知道其他类太多的东西，不要和陌生的类有太多接触。
//这个原则的制定，是因为如果一个类知道或者说是依赖于另外一个类太多细节，这样会导致耦合度过高，应该将细节全部高内聚于类的内部，其他的类只需要知道这个类主要提供的功能即可。
//
//        所谓高内聚就是尽可能将一个类的细节全部写在这个类的内部，不要漏出来给其他类知道，否则其他类就很容易会依赖于这些细节，这样类之间的耦合度就会急速上升，这样做的后果往往是一个类随便改点东西，依赖于它的类全部都要改。

//               我们最终将两个方法都变为私有封装在Reader类当中，这样外部的类就无法知道这两个方法了，所以迪米特原则虽说是指的一个类应当尽量不要知道其他类太多细节，但其实更重要的是一个类应当不要让外部的类知道自己太多。两者是相辅相成的，只要你将类的封装性做的很好，那么外部的类就无法依赖当中的细节。
public class 迪米特原则 {
}
