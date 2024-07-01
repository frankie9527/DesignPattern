package com.design.pattern.behavioral.mediator


/**
 * @author: Frankie
 * @Date: 2024/7/2
 * @Description:
 */
abstract class Mediator {
    abstract fun register(person: Person)
    abstract fun relay(person: Person,str: String) //转发
}
 class HouseMediator : Mediator() {
    private val persons: MutableList<Person> = ArrayList<Person>()
     override fun register(person: Person) {
         persons.add(person)
     }


     override fun relay(person: Person,str: String) {
        for (p in persons) {
            if (!p.type!!.equals(person.type)) {
                p.receive(str)
            }
        }
    }
}
abstract class Person() {
    var type: Int? = null
    abstract fun sendMessage(str: String)
    abstract fun receive(str: String)
}

class LandLords(private val mediator: Mediator) : Person() {
    init {
        type=0;
    }
    override fun sendMessage(str: String) {
        mediator.relay(this,str)
    }

    override fun receive(str: String) {
        println("LandLords  receive from Tenant $str")
    }

}

class Tenant(private val name: String,private val mediator: Mediator) : Person() {
    init {
        type=1;
    }
    override fun sendMessage(str: String) {
        mediator.relay(this,str)
    }

    override fun receive(str: String) {
        println("$name  receive from LandLords $str")
    }

}