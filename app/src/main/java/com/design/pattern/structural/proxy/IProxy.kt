package com.design.pattern.structural.proxy

/**
 * @author: Frankie
 * @Date: 2024/6/27
 * @Description:
 */
interface IUserAction {
    fun playMoney()
    fun bookingTicket()
}
class Frankie :IUserAction{
    override fun playMoney() {
        println("Frankie playMoney")
    }

    override fun bookingTicket() {
        println("Frankie buyTicket")
    }
}

class Tom(private val frankie: Frankie):IUserAction{
    override fun playMoney() {
        frankie.playMoney()
    }

    override fun bookingTicket() {
        frankie.bookingTicket()
    }
}