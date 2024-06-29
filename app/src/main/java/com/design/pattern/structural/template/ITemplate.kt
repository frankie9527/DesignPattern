package com.design.pattern.structural.template

/**
 * author: Frankie
 * Date: 2024/6/30
 * Description:
 */

abstract class Journey {
    abstract fun buyTickets()
    abstract fun takeTransport()
    abstract fun go2Hotel()

    //模板
    final fun goJourney() {
        buyTickets()
        takeTransport()
        go2Hotel()
        println("    ")
    }
}

class Entrepreneur : Journey() {
    override fun buyTickets() {
        println("秘书代买")
    }

    override fun takeTransport() {
        println("飞机头等舱")
    }

    override fun go2Hotel() {
        println("商务车一对一接送")
    }
}

class Student : Journey() {
    override fun buyTickets() {
        println("学校网店买票")
    }

    override fun takeTransport() {
        println("坐性价比最高的绿皮车")
    }

    override fun go2Hotel() {
        println("嘿嘿，拼车")
    }

}

class Works : Journey() {
    override fun buyTickets() {
        println("12306")
    }

    override fun takeTransport() {
        println("坐高铁")
    }

    override fun go2Hotel() {
        println("滴滴快车")
    }

}