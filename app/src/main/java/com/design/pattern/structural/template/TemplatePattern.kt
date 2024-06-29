package com.design.pattern.structural.template

/**
 * author: Frankie
 * Date: 2024/6/30
 * Description:
 * 模板模式就是有一定的模板规律，模板是一定的。但是模板的内容根据不同个体所以有所不一样。
 * 总结就是
 * 一个抽象类一个final 定义的方法实现类该模板的内容
 * 内容按照一定顺序实现
 * 把内容抽取成接口，根据每个个体的不同进行不同实现
 *
 * example
 * 如果上面的讲解不明白起定义。那么看看这个例子
 * 放假时，有一部分人要去旅游，但是每个人根据自己的经济条件，他们出行的方式也许是不一样的。
 * 但是他们一定都会进行买票，乘坐交通工具，然后去酒店
 * 那么我们定义goJourney 这个方法是共同的。
 * 然后 goJourney 实现方法买票，乘坐交通工具，然后去酒店
 *
 *     final fun goJourney() {
 *         buyTickets()
 *         takeTransport()
 *         go2Hotel()
 *         println("    ")
 *     }
 * 因为个人经济状况不一样，所以出事方式不一样，所以每个不同个体继承抽象类Journey
 * 继而实现不同的出行方式
 *
 *
 */
fun main() {
    val entrepreneur = Entrepreneur()
    entrepreneur.goJourney()
    val student=Student()
    student.goJourney()
    val works=Works()
    works.goJourney()
}