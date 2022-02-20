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

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX; import com.ctre.phoenix.motorcontrol.NeutralMode;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


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
    //hello2
    /**
    *
    */
    public DriveTrain() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
leftMotor1 = new WPI_TalonFX(1);
 
    /* Factory default hardware to prevent unexpected behavior */
leftMotor1.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
leftMotor1.setInverted(false);
leftMotor1.setNeutralMode(NeutralMode.Coast);

        /* Set the peak and nominal outputs */
leftMotor1.configNominalOutputForward(0, 30);
leftMotor1.configNominalOutputReverse(0, 30);
leftMotor1.configPeakOutputForward(1, 30);
leftMotor1.configPeakOutputReverse(-1, 30);
        


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
        


left_MotorControler_Group = new MotorControllerGroup(leftMotor1, leftMotor2 , leftMotor3 );
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
        


rightMotor3 = new WPI_TalonFX(6);
 
    /* Factory default hardware to prevent unexpected behavior */
rightMotor3.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
rightMotor3.setInverted(true);
rightMotor3.setNeutralMode(NeutralMode.Coast);

        /* Set the peak and nominal outputs */
rightMotor3.configNominalOutputForward(0, 30);
rightMotor3.configNominalOutputReverse(0, 30);
rightMotor3.configPeakOutputForward(1, 30);
rightMotor3.configPeakOutputReverse(-1, 30);
        


right_MotorControler_Group = new MotorControllerGroup(rightMotor1, rightMotor2  );
 addChild("Right_MotorControler_Group",right_MotorControler_Group);
 

differentialDrive1 = new DifferentialDrive(left_MotorControler_Group, right_MotorControler_Group);
 addChild("Differential Drive 1",differentialDrive1);
 differentialDrive1.setSafetyEnabled(true);
differentialDrive1.setExpiration(0.1);
differentialDrive1.setMaxOutput(1.0);



    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

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

}

