package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by subash on 9/15/15.
 */
public class TestTank extends LinearOpMode
{

    DcMotor bottomLeftMotor;
    DcMotor bottomRightMotor;





    @Override
    public void runOpMode() throws InterruptedException
    {
        bottomLeftMotor = hardwareMap.dcMotor.get("leftBottom");
        bottomRightMotor= hardwareMap.dcMotor.get("rightBottom");
        bottomLeftMotor.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();
        bottomLeftMotor.setPower(1.0);
        bottomRightMotor.setPower(1.0);
        sleep(3000);
        bottomLeftMotor.setPower(0.0);
        bottomRightMotor.setPower(0.0);
    }

}
