package frc.robot.subsystems.BallDrop;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import frc.util.MarinersController.MarinersController;
import frc.util.MarinersController.MarinersSparkBase;
import frc.util.MarinersController.MarinersTalonFX;
import frc.util.MarinersController.MarinersController.ControllerLocation;

public class BallDropIOReal implements BallDropIO{
 private final VictorSPX wheelMotor;
  
 private final MarinersController armMotor;

 public BallDropIOReal()
 {
    this.wheelMotor = configureWheelMotor();
    this.armMotor = configureArmMotor();
 }
private MarinersController configureArmMotor(){
        MarinersSparkBase motor;
        motor = new MarinersSparkBase("Arm Motor", ControllerLocation.RIO, BallDropConstants.ArmMotor.MOTOR_ID, BallDropConstants.ArmMotor.IS_BRUSHLESS, BallDropConstants.ArmMotor.MOTOR_TYPE, BallDropConstants.ArmMotor.ANGLE_PID,);

        motor.enableSoftLimits(BallDropConstants.ArmMotor.SOFT_MINIMUM, BallDropConstants.ArmMotor.SOFT_MAXIMUM);

        motor.setMotorInverted(BallDropConstants.ArmMotor.IS_INVERTED);
        motor.setMotorIdleMode(true);

        // motor.setCurrentLimits(60, 70);

        return motor;
    }
    @Override
    public void SetVoltageWheel(double voltage) {
        // TODO Auto-generated method stubc
        throw new UnsupportedOperationException("Unimplemented method 'SetVoltageWheel'");
    }

    @Override
    public void ResetMotorEncoder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'resetMotorEncoder'");
    }

    @Override
    public double GetAngle()
    {
        throw new UnsupportedOperationException("Unimplemented method 'GetAngle'");
    }

    @Override
    public void SetAngle(double angle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'SetAngle'");
    }

    @Override
    public void Update(BallDroppingInputs inputs) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Update'");
    }

}
