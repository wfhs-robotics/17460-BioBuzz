package org.firstinspires.ftc.teamcode.data

enum class BallType {
    NECTAR,
    POLLEN,
    NOTHING;


    companion object {
        var current: BallType = NECTAR
    }
}