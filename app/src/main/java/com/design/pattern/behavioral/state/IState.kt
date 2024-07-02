package com.design.pattern.behavioral.state

/**
 * @author: Frankie
 * @Date: 2024/7/3
 * @Description:
 */

interface UserState{
    fun time()
    fun behavior()
}

class GetUp :UserState{
    override fun time() {
        print("8:00 am ")
    }

    override fun behavior() {
        println("get up")
    }

}
class EatBreakfast :UserState{
    override fun time() {
        print("8:00-8:30 am ")
    }

    override fun behavior() {
        println("Eat Breakfast")
    }
}
class Working:UserState{
    override fun time() {
        print("9:30-11:30 and 13:30-18:30 ")
    }

    override fun behavior() {
        println("i am working")
    }
}
// 打工人
class Laborer{
   var userState:UserState?=null
    fun currentTime(state:UserState) {
        this.userState=state
        userState?.time()
        userState?.behavior()
    }
}