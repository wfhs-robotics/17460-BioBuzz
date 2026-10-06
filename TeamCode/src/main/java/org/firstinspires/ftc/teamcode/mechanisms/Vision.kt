package org.firstinspires.ftc.teamcode.mechanisms

import dev.nextftc.hardware.RobotController.expansionHub
import dev.nextftc.hardware.actuators.NextServo
import dev.nextftc.hardware.webcams.NextHuskyLens
import dev.nextftc.robot.Mechanism

class Vision : Mechanism {
    val huskylens: NextHuskyLens = NextHuskyLens("HuskyLens")
    private val huskylensServo = NextServo(expansionHub, 0)

    }