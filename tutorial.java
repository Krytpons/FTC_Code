package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "tutorial")
public class tutorial extends OpMode {
    DcMotor motor_topRight;
    DcMotor motor_topLeft;
    DcMotor motor_botRight;
    DcMotor motor_botLeft;
    public Servo servo;
    @Override
    public void init() {
        motor_topRight = hardwareMap.get(DcMotor.class, "motor_topRight");
        motor_topLeft = hardwareMap.get(DcMotor.class, "motor_topLeft");
        motor_botRight = hardwareMap.get(DcMotor.class, "motor_botRight");
        motor_botLeft = hardwareMap.get(DcMotor.class, "motor_botLeft");

        servo = hardwareMap.get(Servo.class, "servo");

        telemetry.addData("hardware", "initialized");

    }

    @Override
    public void loop() {

        float leftX = gamepad1.left_stick_x;
        float leftY = gamepad1.left_stick_y;
        float RightX = gamepad1.right_stick_x;
        float RightY = gamepad1.left_stick_y;

        motor_topLeft.setPower(-leftY);
        motor_topRight.setPower(-leftY);
        motor_botLeft.setPower(leftY);
        motor_botRight.setPower(leftY);

        motor_topLeft.setPower(-leftX);
        motor_topRight.setPower(-leftX);
        motor_botLeft.setPower(-leftX);
        motor_botRight.setPower(-leftX);

        motor_topLeft.setPower(RightX);
        motor_topRight.setPower(-RightX);
        motor_botLeft.setPower(RightX);
        motor_botRight.setPower(-RightX);

        if(gamepad1.a){;
            servo.setPosition(0);
        }
        if(gamepad1.b){
            servo.setPosition(1);
        }


    }
}
