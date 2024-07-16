package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "tutorial")
public class tutorial extends OpMode {
    DcMotor motor_topRight;
    DcMotor motor_topLeft;
    DcMotor motor_botRight;
    DcMotor motor_botLeft;
    @Override
    public void init() {
        motor_topRight = hardwareMap.get(DcMotor.class, "motor_topRight");
        motor_topLeft = hardwareMap.get(DcMotor.class, "motor_topLeft");
        motor_botRight = hardwareMap.get(DcMotor.class, "motor_botRight");
        motor_botLeft = hardwareMap.get(DcMotor.class, "motor_botLeft");

        telemetry.addData("hardware", "initialized");



    }

    @Override
    public void loop() {

        float y = gamepad1.left_stick_y;
        float x = gamepad1.left_stick_x;
        if(gamepad1.left_stick_y < 0){
            motor_topRight.setPower(-y/2);
            motor_topLeft.setPower(y);
            motor_botRight.setPower(-y/2);
            motor_botLeft.setPower(y/2);
        }
        if(gamepad1.left_stick_y > 0){
            motor_topRight.setPower(-y/2);
            motor_topLeft.setPower(y);
            motor_botRight.setPower(-y/2);
            motor_botLeft.setPower(y/2);
        }
        if(gamepad1.left_stick_x > 0){
            motor_topRight.setPower(-x/2);
            motor_topLeft.setPower(-x);
            motor_botRight.setPower(-x/2);
            motor_botLeft.setPower(-x/2);
        }
        if(gamepad1.left_stick_x < 0){
            motor_topRight.setPower(-x/2);
            motor_topLeft.setPower(-x);
            motor_botRight.setPower(-x/2);
            motor_botLeft.setPower(-x/2);
        }
        motor_topRight.setPower(0);
        motor_topLeft.setPower(0);
        motor_botRight.setPower(0);
        motor_botLeft.setPower(0);



    }
}
