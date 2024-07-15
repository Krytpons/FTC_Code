package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "motor1")
public class Driver_Controls extends OpMode {

    DcMotor motor1;
    DcMotor motor2;
    DcMotor motor3;
    DcMotor motor4;

    @Override
    public void init() {
        motor1 = hardwareMap.dcMotor.get("motor_topLeft");
         motor2 = hardwareMap.dcMotor.get("motor_topRight");
         motor3 = hardwareMap.dcMotor.get("motor_botLeft");
         motor4 = hardwareMap.dcMotor.get("motor_botRight");

    }

    @Override
    public void loop() {

        motor1.setPower(-gamepad1.left_stick_y);
        motor2.setPower(gamepad1.left_stick_y);
        motor3.setPower(-gamepad1.left_stick_y);
        motor4.setPower(gamepad1.left_stick_y);

        motor1.setPower(gamepad1.right_stick_x);
        motor2.setPower(gamepad1.right_stick_x);
        motor3.setPower(gamepad1.right_stick_x);
        motor4.setPower(gamepad1.right_stick_x);
    }


}


