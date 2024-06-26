package com.design.pattern.structural.proxy

/**
 * @author: Frankie
 * @Date: 2024/6/27
 * @Description:
 * 个人总结。frankie 委托tome 去车站买票！其实付款和买票的本质都是frankie来的！
 * 通过代理设计模式可以看出，代理类和真实的类实现类相同的接口！并代理类持有真实类的接口
 * 代理真实类进行操作
 */

fun main(){
    val tom=Tom(Frankie());
    tom.bookingTicket()
    tom.playMoney()
}