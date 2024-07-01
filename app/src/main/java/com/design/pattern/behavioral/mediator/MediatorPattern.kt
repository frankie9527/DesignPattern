package com.design.pattern.behavioral.mediator

/**
 * @author: Frankie
 * @Date: 2024/7/2
 * @Description:
 *
 * 个人觉得中介者模式就是观察者模式的升级。
 * 中介持有客户端的接口或者抽象类
 *
 * 客户端持有中介的接口或者抽象类
 *
 * 把多对多转化成一对多，降低类耦合
 */
fun main(){
    val house=HouseMediator()
    val landLords=LandLords(house)
    val tenant1=Tenant("tenant1",house)
    val tenant2=Tenant("tenant2",house)
    house.register(landLords)
    house.register(tenant1)
    house.register(tenant2)

    landLords.sendMessage("出租最低1500")

    println("  ")
    tenant1.sendMessage("我最多只能给1400")
    tenant2.sendMessage("我全部身价1299")

}