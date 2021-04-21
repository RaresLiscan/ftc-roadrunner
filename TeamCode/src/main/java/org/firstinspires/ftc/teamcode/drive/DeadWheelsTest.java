package org.firstinspires.ftc.teamcode.drive;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp(name="Test encodere")
public class DeadWheelsTest extends LinearOpMode {

    private DcMotorEx leftEncoder, rightEncoder, frontEncoder;

    @Override
    public void runOpMode() throws InterruptedException {
        leftEncoder = hardwareMap.get(DcMotorEx.class, "encoderStanga");
        rightEncoder = hardwareMap.get(DcMotorEx.class, "encoderDreapta");
        frontEncoder = hardwareMap.get(DcMotorEx.class, "motorShooter");

        waitForStart();

        while (opModeIsActive()) {
            telemetry.addData("Left Encoder: ", leftEncoder.getCurrentPosition());
            telemetry.addData("Right Encoder: ", rightEncoder.getCurrentPosition());
            telemetry.addData("Front Encoder: ", frontEncoder.getCurrentPosition());
            telemetry.update();
        }
    }
}
