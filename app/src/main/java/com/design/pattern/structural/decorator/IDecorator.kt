package com.design.pattern.structural.decorator

/**
 * @author: Frankie
 * @Date: 2024/7/1
 * @Description:
 */

interface GirlDressUp {
    fun score(): Int;
    fun describe(): String;
}

class BlackSilk(private val dressUp: GirlDressUp?=null) :GirlDressUp{
    override fun score(): Int {
        return 23+ (dressUp?.score() ?: 0)
    }

    override fun describe(): String {
        return "黑丝 "+ (dressUp?.describe() ?: "")
    }
}

class Lipstick(private val dressUp: GirlDressUp) :GirlDressUp{
    override fun score(): Int {
        return 10+dressUp.score()
    }

    override fun describe(): String {
        return "口红 "+dressUp.describe()
    }
}

class QibiMiniSkirt(private val dressUp: GirlDressUp) :GirlDressUp{
    override fun score(): Int {
        return 32+dressUp.score()
    }

    override fun describe(): String {
        return "齐逼小短裙 "+dressUp.describe()
    }
}

class SeamlessHalfBraCamisole(private val dressUp: GirlDressUp) :GirlDressUp{
    override fun score(): Int {
        return 34+dressUp.score()
    }

    override fun describe(): String {
        return "半胸上衣nice nice  "+dressUp.describe()
    }
}