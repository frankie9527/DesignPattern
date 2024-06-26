package com.design.pattern.behavioral.command


/**
 * author: Frankie
 * Date: 2024/6/27
 * Description:
 */
interface Command {
    fun execute()
}

class Power {
    fun powerOn() {
        println("powerOn")
    }

    fun powerOff() {
        println("powerOff")
    }
}

class PowerOnCommand(private val power: Power) : Command {
    override fun execute() {
        power.powerOn()
    }
}

class PowerOffCommand(private val power: Power) : Command {
    override fun execute() {
        power.powerOff()
    }
}

class SwitchChannel {
    fun switch() {
        println("SwitchChannel")
    }
}

class SwitchChannelCommand(private val switch: SwitchChannel) : Command {
    override fun execute() {
        switch.switch()
    }
}

class Volume {
    fun volumeIncrease() {
        println("volumeIncrease")
    }

    fun volumeReduction() {
        println("volumeReduction")
    }
}
class VolumeIncreaseCommand(private val volume: Volume) : Command {
    override fun execute() {
        volume.volumeIncrease()
    }
}
class VolumeReductionCommand(private val volume: Volume) : Command {
    override fun execute() {
        volume.volumeReduction()
    }
}