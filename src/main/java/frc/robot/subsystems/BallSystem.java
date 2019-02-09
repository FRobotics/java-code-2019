package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import frc.robot.subsystems.base.Motor;

public class BallSystem {
    private Motor motor;
    private DoubleSolenoid arms;
    private DoubleSolenoid puncher;


    public void init(Motor motor, DoubleSolenoid arms, DoubleSolenoid puncher) {
        this.motor = motor;
        this.arms = arms;
        this.puncher = puncher;
    }

    public void pickupBall() {
        motor.setSpeed(-1);
    }

    public void releaseBall() {
        motor.setSpeed(1);
    }

    public void stopBallMotor() {
        motor.setSpeed(0);
    }

    public void armsDown() {
        arms.set(Value.kForward);
    }

    public void raiseArms() {
        arms.set(Value.kReverse);
    }

    public void punchBall() {
        puncher.set(Value.kForward);
    }

    public void retractPuncher() {
        puncher.set(Value.kReverse);
    }

    public void reset() {
        raiseArms();
        stopBallMotor();
        retractPuncher();
    }
}