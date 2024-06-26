package com.design.pattern.behavioral.strategy

/**
 * @author: Frankie
 * @Date: 2024/6/27
 * @Description:
 */
class V8Engine : IEngine {
    override fun engine() {
        println("V8发动机")
    }
}
class MqlTire : ITire {
    override fun tire() {
        println("米其林轮胎")
    }
}
class BenZPrice : IPrice {
    override fun price() {
        println("售价¥398000")
    }
}