package org.firstinspires.ftc.teamcode.Mechanisms;

import com.pedropathing.ivy.Command

import org.firstinspires.ftc.teamcode.Data.Config

import dev.nextftc.hardware.RobotController
import dev.nextftc.hardware.actuators.NextMotor
import dev.nextftc.hardware.actuators.NextServo
import dev.nextftc.robot.Mechanism

class Drivetrain : Mechanisms {
    fun Drivetrain{
        frontRight.setDirection(NextMotor.Direction.REVERSE)
        backRight.setDirection(NextMotor.Direction.REVERSE)
    }

}