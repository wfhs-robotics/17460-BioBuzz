package org.firstinspires.ftc.teamcode.Mechanisms;

import com.pedropathing.ivy.Command;

import org.firstinspires.ftc.teamcode.Data.Config;

import dev.nextftc.hardware.RobotController;
import dev.nextftc.hardware.actuators.NextMotor;
import dev.nextftc.hardware.actuators.NextServo;
import dev.nextftc.robot.Mechanism;

public class DriveTrain implements Mechanism {
    public DriveTrain(){
        frontRight.setDirection(NextMotor.Direction.REVERSE);
        backRight.setDirection(NextMotor.Direction.REVERSE);
    }
    public final NextMotor frontLeft = new NextMotor(RobotController.controlHub(), Config.frontLeftMotor);
    public final NextMotor frontRight = new NextMotor(RobotController.expansionHub(), Config.frontRightMotor);
    public final NextMotor backLeft = new NextMotor(RobotController.controlHub(), Config.backLeftMotor);
    public final NextMotor backRight =  new NextMotor(RobotController.expansionHub(), Config.backRightMotor);

}