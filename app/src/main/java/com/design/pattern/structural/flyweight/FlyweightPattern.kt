package com.design.pattern.structural.flyweight

/**
 * @author: Frankie
 * @Date: 2024/7/1
 * @Description:
 * java 和kt 是互通的，怎么简单怎么来。
 * 个人觉得工厂模式和享元模式 相差不大
 * 只是享元模式把生成的对象缓存起来。
 * 但是缓存起来的是持有的接口，这样更具有扩展性，这就是面向接口编程！
 */

fun main() {
    MainUiWidgetFactory.getUiWidget(0).show()
    MainUiWidgetFactory.getUiWidget(1).show()
}