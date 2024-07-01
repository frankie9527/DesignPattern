package com.design.pattern.structural.decorator

/**
 * author: Frankie
 * Date: 2024/7/1
 * Description:
 */

fun  main(){
    val dressUp=SeamlessHalfBraCamisole(QibiMiniSkirt(Lipstick(BlackSilk())))
    println("打扮描述 "+dressUp.describe())
    println("打扮得分 "+dressUp.score())
}