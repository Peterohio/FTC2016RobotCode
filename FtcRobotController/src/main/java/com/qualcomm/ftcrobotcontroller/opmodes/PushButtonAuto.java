package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 * Created by Peter on 10/8/2015.
 */
 abstract public class PushButtonAuto extends LinearOpMode
{
    public void runOpMode()
    {
        moveStraightLineDist(48.0f, .75f, isForward = true)
        spinOnCenter(90.0f, .5f, isLeft = true)
        moveStraightLineDist(48.0f, .75f, isForward = true)
        spinOnCenter(90f, .5f, isRight = false)
        moveStraightLineDist(24.0f, .75f, isForward = true)
        spinOnCenter(90.0f, .5f, isLeft = true)
        moveStraightLineDist(24.0f, .75f, isForward = true)
        senseColor()
        if (//parameter for red and team color is red)
            {
                    //poke button
            }
        if (//parameter for blue team color is red)
                {
                        //poke other button
                }
        if (//parameter for blue and team color is blue)
                {
                        //poke button
                }
        if (//parameter for red team color is blue)
                {
                        //poke other button
                }
    }
}
