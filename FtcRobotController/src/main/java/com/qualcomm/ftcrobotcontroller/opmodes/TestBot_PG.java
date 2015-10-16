package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Peter on 10/13/2015.
 */
public class TestBot_PG extends OpMode
{
    //public Gamepad player1;
    //public Gamepad player2;

    public DcMotor rightDriveMotor;
    public DcMotor leftDriveMotor;
    public DcMotor scooperBelt;

    private final float DEADZONE = 0.01f;
    @Override
    public void init()
    {
        //player1 = gamepad1;
        //player2 = gamepad2;
        gamepad1.setJoystickDeadzone(DEADZONE);
        gamepad2.setJoystickDeadzone(DEADZONE);
        rightDriveMotor = hardwareMap.dcMotor.get("rightMotor");
        leftDriveMotor = hardwareMap.dcMotor.get("leftMotor");
        scooperBelt = hardwareMap.dcMotor.get("grabber");
        rightDriveMotor.setDirection(DcMotor.Direction.FORWARD);
        leftDriveMotor.setDirection(DcMotor.Direction.REVERSE);

    }

    @Override
    public void loop() {
        leftDriveMotor.setPower(gamepad1.left_stick_y);
        rightDriveMotor.setPower(gamepad1.right_stick_y);

        telemetry.addData("leftBottomMotor", leftDriveMotor.getPower());
        telemetry.addData("rightBottomMotor", rightDriveMotor.getPower());
        if (gamepad1.right_bumper)
        {
            scooperBelt.setDirection(DcMotor.Direction.REVERSE);
            scooperBelt.setPower(0.5);
        }
        else if (gamepad1.left_bumper)
        {
            scooperBelt.setDirection(DcMotor.Direction.FORWARD);
            scooperBelt.setPower(0.5);
        }
        else
        {
            scooperBelt.setPower(0.0);
        }
    }
    public void stop()
    {
        leftDriveMotor.setPower(0.0);
        rightDriveMotor.setPower(0.0);
    }
}
