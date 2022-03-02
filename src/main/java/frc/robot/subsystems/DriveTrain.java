// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;


import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// _BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
    import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveTrain extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // _BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private WPI_TalonFX leftMotor1;
private WPI_TalonFX leftMotor2;
private WPI_TalonFX leftMotor3;
private MotorControllerGroup left_MotorControler_Group;
private WPI_TalonFX rightMotor1;
private WPI_TalonFX rightMotor2;
private WPI_TalonFX rightMotor3;
private MotorControllerGroup right_MotorControler_Group;
private DifferentialDrive differentialDrive1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private DoubleSolenoid drive_Shift;
    final int kUnitsPerRevolution = 2048;
    final double kGear_Low = 12.857;
    final double kGear_High = 4.4;
    final double kWheel_Diameter = 6.0;



    //hello2
    /**
    *
    */
    public DriveTrain() {
       


       // SmartDashboard.putNumber("Turn Trim", .7);
        // _BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
//leftMotor1 = new WPI_TalonFX(1);
 
    /* Factory default hardware to prevent unexpected behavior */
//leftMotor1.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
//leftMotor1.setInverted(false);
//leftMotor1.setNeutralMode(NeutralMode.Coast);

        /* Set the peak and nominal outputs */
//leftMotor1.configNominalOutputForward(0, 30);
//leftMotor1.configNominalOutputReverse(0, 30);
//leftMotor1.configPeakOutputForward(1, 30);
//leftMotor1.configPeakOutputReverse(-1, 30);
        


leftMotor2 = new WPI_TalonFX(2);
 
    /* Factory default hardware to prevent unexpected behavior */
leftMotor2.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
leftMotor2.setInverted(false);
leftMotor2.setNeutralMode(NeutralMode.Coast);

        /* Set the peak and nominal outputs */
leftMotor2.configNominalOutputForward(0, 30);
leftMotor2.configNominalOutputReverse(0, 30);
leftMotor2.configPeakOutputForward(1, 30);
leftMotor2.configPeakOutputReverse(-1, 30);
        


leftMotor3 = new WPI_TalonFX(3);
 
    /* Factory default hardware to prevent unexpected behavior */
leftMotor3.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
leftMotor3.setInverted(false);
leftMotor3.setNeutralMode(NeutralMode.Coast);

        /* Set the peak and nominal outputs */
leftMotor3.configNominalOutputForward(0, 30);
leftMotor3.configNominalOutputReverse(0, 30);
leftMotor3.configPeakOutputForward(1, 30);
leftMotor3.configPeakOutputReverse(-1, 30);
        


left_MotorControler_Group = new MotorControllerGroup(leftMotor2 , leftMotor3 );
 addChild("Left_MotorControler_Group",left_MotorControler_Group);
 

rightMotor1 = new WPI_TalonFX(4);
 
    /* Factory default hardware to prevent unexpected behavior */
rightMotor1.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
rightMotor1.setInverted(true);
rightMotor1.setNeutralMode(NeutralMode.Coast);

        /* Set the peak and nominal outputs */
rightMotor1.configNominalOutputForward(0, 30);
rightMotor1.configNominalOutputReverse(0, 30);
rightMotor1.configPeakOutputForward(1, 30);
rightMotor1.configPeakOutputReverse(-1, 30);

rightMotor1.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);
        


rightMotor2 = new WPI_TalonFX(5);
 
    /* Factory default hardware to prevent unexpected behavior */
rightMotor2.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
rightMotor2.setInverted(true);
rightMotor2.setNeutralMode(NeutralMode.Coast);

        /* Set the peak and nominal outputs */
rightMotor2.configNominalOutputForward(0, 30);
rightMotor2.configNominalOutputReverse(0, 30);
rightMotor2.configPeakOutputForward(1, 30);
rightMotor2.configPeakOutputReverse(-1, 30);
        


//rightMotor3 = new WPI_TalonFX(6);
 
    /* Factory default hardware to prevent unexpected behavior */
//rightMotor3.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
//rightMotor3.setInverted(true);
//rightMotor3.setNeutralMode(NeutralMode.Coast);

        /* Set the peak and nominal outputs */
//rightMotor3.configNominalOutputForward(0, 30);
//rightMotor3.configNominalOutputReverse(0, 30);
//rightMotor3.configPeakOutputForward(1, 30);
//rightMotor3.configPeakOutputReverse(-1, 30);
        


right_MotorControler_Group = new MotorControllerGroup(rightMotor1, rightMotor2  );
 addChild("Right_MotorControler_Group",right_MotorControler_Group);
 

differentialDrive1 = new DifferentialDrive(left_MotorControler_Group, right_MotorControler_Group);
 addChild("Differential Drive 1",differentialDrive1);
 differentialDrive1.setSafetyEnabled(true);
differentialDrive1.setExpiration(0.1);
differentialDrive1.setMaxOutput(1.0);

drive_Shift = new DoubleSolenoid(20, PneumaticsModuleType.REVPH, 0, 1);
 addChild("Drive_Shift", drive_Shift);
 


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    drive_Shift.set(Value.kForward);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
        SmartDashboard.putNumber("Right Encoder Rotations", my_getRight_Motor_Rotation_Value());
        SmartDashboard.putNumber("Right Encoder Inches", my_get_Distance_Inch());
        differentialDrive1.feed();

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void my_DriveArcade(double xSpeed, double zRotation){
            differentialDrive1.arcadeDrive(xSpeed, zRotation);
    }
    //Main
    //add Encoder
    //supper Code
    //Test
    public void my_ShiftHigh(boolean shiftHigh){
        if(shiftHigh){
            drive_Shift.set(Value.kForward);
        }else{
            drive_Shift.set(Value.kReverse);
        }
    }

    private double my_getRight_Motor_Rotation_Value(){
        return rightMotor1.getSelectedSensorPosition(0) / kUnitsPerRevolution; 
    }

    public void my_resetRightEncoder(){
        rightMotor1.setSelectedSensorPosition(0);
    }

    public double my_get_Distance_Inch(){
        if(get_Shifter_Low()){
            return (my_getRight_Motor_Rotation_Value()/kGear_Low)*(kWheel_Diameter * Math.PI);
        }else{
            return (my_getRight_Motor_Rotation_Value()/kGear_High)*(kWheel_Diameter * Math.PI);
        }
    }

    private boolean get_Shifter_Low(){
        if(drive_Shift.get() == Value.kForward){
            return  false; 
        }else{
            return true;
        }
    }

}

