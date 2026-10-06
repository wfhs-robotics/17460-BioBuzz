package org.firstinspires.ftc.teamcode.data

enum class Alliance(className: String) {
    BLUE("blue_nectar"),
    RED("red_nectar");

    val className: String?

    init {
        this.className = className
    }
}