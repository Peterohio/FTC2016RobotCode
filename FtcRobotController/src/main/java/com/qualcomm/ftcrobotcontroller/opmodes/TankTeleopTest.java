package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by FTC6150 on 9/22/2015.
 */
public class TankTeleopTest extends OpMode
{
    //public Gamepad player1;
    //public Gamepad player2;

    public DcMotor  rightBottomMotor;
    public DcMotor leftBottomMotor;

    private final float DEADZONE = 0.01f;
    @Override
    public void init()
    {
        //player1 = gamepad1;
        //player2 = gamepad2;
        gamepad1.setJoystickDeadzone(DEADZONE);
        gamepad2.setJoystickDeadzone(DEADZONE);
        rightBottomMotor = hardwareMap.dcMotor.get("rightBottom");
        leftBottomMotor = hardwareMap.dcMotor.get("leftBottom");
        leftBottomMotor.setDirection(DcMotor.Direction.FORWARD);
        rightBottomMotor.setDirection(DcMotor.Direction.REVERSE);

    }

    @Override
    public void loop()
    {
        leftBottomMotor.setPower(gamepad1.right_stick_y);
        rightBottomMotor.setPower(gamepad1.left_stick_y);
        telemetry.addData("leftBottomMotor", leftBottomMotor.getPower());
        telemetry.addData("rightBottomMotor", rightBottomMotor.getPower());
    }

    @Override
    public void stop()
    {
        leftBottomMotor.setPower(0.0);
        rightBottomMotor.setPower(0.0);
    }


}
