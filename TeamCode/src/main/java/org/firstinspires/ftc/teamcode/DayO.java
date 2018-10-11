package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name="DayO", group="DayO")
public class DayO extends OpMode {

    private DcMotor leftMotor = null;
    private DcMotor rightMotor = null;

    public void init() {
        leftMotor = hardwareMap.dcMotor.get("leftMotor");
        rightMotor = hardwareMap.dcMotor.get("rightMotor");
        leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);


        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }

    public void start() {
        // Run once when driver hits "PLAY".
        // Robot start-of-match code goes here.
    }

    public void loop() {
        double left = gamepad1.left_stick_y;
        double right = gamepad1.right_stick_y;

        leftMotor.setPower(left);
        rightMotor.setPower(right);
    }




    public void stop() {
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
}
