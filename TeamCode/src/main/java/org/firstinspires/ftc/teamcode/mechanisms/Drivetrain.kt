package org.firstinspires.ftc.teamcode.mechanisms



import dev.nextftc.hardware.RobotController

import dev.nextftc.hardware.actuators.NextMotor
import dev.nextftc.robot.Mechanism
import org.firstinspires.ftc.teamcode.data.Config

class Drivetrain : Mechanism {
    val frontLeft = NextMotor(RobotController.controlHub, Config.frontLeftMotor)
    val frontRight: NextMotor = NextMotor(RobotController.controlHub, Config.frontRightMotor)
    val backLeft: NextMotor = NextMotor(RobotController.controlHub, Config.backLeftMotor)
    val backRight: NextMotor = NextMotor(RobotController.controlHub, Config.backRightMotor)


    init {
        frontRight.direction = NextMotor.Direction.REVERSE
        backRight.direction = NextMotor.Direction.REVERSE
    }
}