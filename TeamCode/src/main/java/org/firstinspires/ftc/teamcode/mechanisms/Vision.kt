package org.firstinspires.ftc.teamcode.mechanisms

import com.pedropathing.ivy.Command
import com.pedropathing.math.Pose
import com.pedropathing.math.Vector
import dev.nextftc.hardware.RobotController.expansionHub
import dev.nextftc.hardware.actuators.NextServo
import dev.nextftc.hardware.webcams.NextHuskyLens
import dev.nextftc.robot.Mechanism
import org.firstinspires.ftc.teamcode.Data.Alliance
import kotlin.math.abs
import kotlin.math.sqrt
import kotlin.math.tan

class Vision : Mechanism {
    val huskylens: NextHuskyLens = NextHuskyLens("HuskyLens")
    private val huskylensServo = NextServo(expansionHub, 0)

    }