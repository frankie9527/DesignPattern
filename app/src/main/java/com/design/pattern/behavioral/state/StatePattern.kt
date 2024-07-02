package com.design.pattern.behavioral.state

/**
 * author: Frankie
 * Date: 2024/7/3
 * Description:
 */
fun main() {
    val laborer = Laborer();
    laborer.currentTime(GetUp())
    laborer.currentTime(EatBreakfast())
    laborer.currentTime(Working())
}