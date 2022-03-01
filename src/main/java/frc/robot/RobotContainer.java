// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: RobotContainer.

package frc.robot;

import frc.robot.commands.*;
import frc.robot.subsystems.*;
import frc.robot.util.XboxControllerAxisButton;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.*;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  private static RobotContainer m_robotContainer = new RobotContainer();

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
// The robot's subsystems
    public final SecondClimb m_secondClimb = new SecondClimb();
    public final DriveShift m_driveShift = new DriveShift();
    public final Climber m_climber = new Climber();
    public final Shooter m_shooter = new Shooter();
    public final Trigger m_trigger = new Trigger();
    public final Feeder m_feeder = new Feeder();
    public final Intake m_intake = new Intake();
    public final DriveTrain m_driveTrain = new DriveTrain();

// Joysticks
private final XboxController xboxCoDiver = new XboxController(1);
private final XboxController xboxDriver = new XboxController(0);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  
  // A chooser for autonomous commands
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  /**
  * The container for the robot.  Contains subsystems, OI devices, and commands.
  */
  private RobotContainer() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SMARTDASHBOARD
    // Smartdashboard Subsystems
    SmartDashboard.putData(m_driveShift);
    SmartDashboard.putData(m_climber);
    SmartDashboard.putData(m_shooter);
    SmartDashboard.putData(m_trigger);
    SmartDashboard.putData(m_feeder);
    SmartDashboard.putData(m_intake);
    SmartDashboard.putData(m_driveTrain);


    // SmartDashboard Buttons
    SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
    SmartDashboard.putData("Intake_Cargo_Run: intake_Value", new Intake_Cargo_Run(.7, m_intake));
    SmartDashboard.putData("Intake_Cargo_Run: eject_Value", new Intake_Cargo_Run(-.7, m_intake));
    SmartDashboard.putData("Feeder_Run: inbound", new Feeder_Run(.3, m_feeder));
    SmartDashboard.putData("Feeder_Run: eject", new Feeder_Run(-.3, m_feeder));
    SmartDashboard.putData("Trigger_Run: Trigger_Value", new Trigger_Run(1, m_trigger));
    SmartDashboard.putData("Trigger_Run: ReverseShoot_Value", new Trigger_Run(-1, m_trigger));
    SmartDashboard.putData("TopShooter_Run: Shoot_Value", new TopShooter_Run(.8, .7, m_shooter));
    SmartDashboard.putData("TopShooter_Run: ReverseShoot_Value", new TopShooter_Run(-1, -1, m_shooter));
    SmartDashboard.putData("Climber_Run: Climb_Value", new Climber_Run(1, m_climber));
    SmartDashboard.putData("Climber_Run: ReverseClimb_Value", new Climber_Run(-1, m_climber));
    SmartDashboard.putData("DriveShift_Actuate: high_gear", new DriveShift_Actuate(true, m_driveShift));
    SmartDashboard.putData("DriveShift_Actuate: low_gear", new DriveShift_Actuate(false, m_driveShift));
    SmartDashboard.putData("Intake_Actuate: Up", new Intake_Actuate(true, m_intake));
    SmartDashboard.putData("Intake_Actuate: Down", new Intake_Actuate(false, m_intake));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SMARTDASHBOARD
    // Configure the button bindings
    configureButtonBindings();

    // Configure default commands
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SUBSYSTEM_DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SUBSYSTEM_DEFAULT_COMMAND
    m_driveTrain.setDefaultCommand(new DriveWithJoysticks(() -> -xboxDriver.getRawAxis(1), () -> xboxDriver.getRawAxis(4), m_driveTrain ) );

    // Configure autonomous sendable chooser
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

    m_chooser.setDefaultOption("Autonomous Command", new AutonomousCommand());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

    SmartDashboard.putData("Auto Mode", m_chooser);
  }

  public static RobotContainer getInstance() {
    return m_robotContainer;
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    final XboxControllerAxisButton xbox_Axis_LT = new XboxControllerAxisButton(xboxCoDiver, XboxController.Axis.kLeftTrigger.value);        
    xbox_Axis_LT.whileHeld(new SecondClimbRun(-.5, m_secondClimb) ,true);
        //SmartDashboard.putData("Xbox_Axis_LT",new SecondClimbRun(-.5, m_secondClimb) );
    
    final XboxControllerAxisButton xbox_Axis_RT = new XboxControllerAxisButton(xboxCoDiver, XboxController.Axis.kRightTrigger.value);        
    xbox_Axis_RT.whileHeld(new SecondClimbRun(.5, m_secondClimb) ,true);
        //SmartDashboard.putData("Xbox_Axis_RT",new SecondClimbRun(.5, m_secondClimb) );
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=BUTTONS
// Create some buttons


final JoystickButton xboxBack = new JoystickButton(xboxCoDiver, XboxController.Button.kBack.value);        
xboxBack.whileHeld(new TopShooter_Run(.8, .7, m_shooter) ,true);
    SmartDashboard.putData("Xbox Back",new TopShooter_Run(.8, .7, m_shooter) );

final JoystickButton xbox_LeftBumper = new JoystickButton(xboxCoDiver, XboxController.Button.kLeftBumper.value);        
xbox_LeftBumper.whenPressed(new Intake_Actuate(false, m_intake) ,true);
    SmartDashboard.putData("Xbox_LeftBumper",new Intake_Actuate(false, m_intake) );

final JoystickButton xbox_RightBumper = new JoystickButton(xboxCoDiver, XboxController.Button.kRightBumper.value);        
xbox_RightBumper.whenPressed(new Intake_Actuate(true, m_intake) ,true);
    SmartDashboard.putData("Xbox_RightBumper",new Intake_Actuate(true, m_intake) );

final JoystickButton xbox_Button_B = new JoystickButton(xboxCoDiver, XboxController.Button.kB.value);        
xbox_Button_B.whileHeld(new Feeder_Run(-.3, m_feeder) ,true);
    SmartDashboard.putData("Xbox_Button_B",new Feeder_Run(-.3, m_feeder) );

final JoystickButton xbox_Button_A = new JoystickButton(xboxCoDiver, XboxController.Button.kA.value);        
xbox_Button_A.whileHeld(new Feeder_Run(.3, m_feeder) ,true);
    SmartDashboard.putData("Xbox_Button_A",new Feeder_Run(.3, m_feeder) );

final JoystickButton xboxButton_Y = new JoystickButton(xboxCoDiver, XboxController.Button.kY.value);        
xboxButton_Y.whileHeld(new Intake_Cargo_Run(.7, m_intake) ,true);
    SmartDashboard.putData("Xbox Button_Y",new Intake_Cargo_Run(.7, m_intake) );

final JoystickButton xboxButton_X = new JoystickButton(xboxCoDiver, XboxController.Button.kX.value);        
xboxButton_X.whileHeld(new Intake_Cargo_Run(-.7, m_intake) ,true);
    SmartDashboard.putData("Xbox Button_X",new Intake_Cargo_Run(-.7, m_intake) );

final JoystickButton driver_Start = new JoystickButton(xboxDriver, XboxController.Button.kStart.value);        
driver_Start.whenPressed(new DriveShift_Actuate(true, m_driveShift) ,true);
    SmartDashboard.putData("Driver_Start",new DriveShift_Actuate(true, m_driveShift) );

final JoystickButton driver_Back = new JoystickButton(xboxDriver, XboxController.Button.kBack.value);        
driver_Back.whenPressed(new DriveShift_Actuate(false, m_driveShift) ,true);
    SmartDashboard.putData("Driver_Back",new DriveShift_Actuate(false, m_driveShift) );

final JoystickButton driver_LeftBumper = new JoystickButton(xboxDriver, XboxController.Button.kLeftBumper.value);        
driver_LeftBumper.whileHeld(new Climber_Run(-1, m_climber) ,true);
    SmartDashboard.putData("Driver_LeftBumper",new Climber_Run(-1, m_climber) );

final JoystickButton driver_RightBumper = new JoystickButton(xboxDriver, XboxController.Button.kRightBumper.value);        
driver_RightBumper.whileHeld(new Climber_Run(1, m_climber) ,true);
    SmartDashboard.putData("Driver_RightBumper",new Climber_Run(1, m_climber) );

final JoystickButton driver_Button_B = new JoystickButton(xboxDriver, XboxController.Button.kB.value);        
driver_Button_B.whileHeld(new TopShooter_Run(-.79, -.79, m_shooter) ,true);
    SmartDashboard.putData("Driver_Button_B",new TopShooter_Run(-.79, -.79, m_shooter) );

final JoystickButton driver_Button_A = new JoystickButton(xboxDriver, XboxController.Button.kA.value);        
driver_Button_A.whileHeld(new TopShooter_Run(.85, .79, m_shooter) ,true);
    SmartDashboard.putData("Driver_Button_A",new TopShooter_Run(.85, .79, m_shooter) );

final JoystickButton driver_Button_Y = new JoystickButton(xboxDriver, XboxController.Button.kY.value);        
driver_Button_Y.whileHeld(new Trigger_Run(1, m_trigger) ,true);
    SmartDashboard.putData("Driver_Button_Y",new Trigger_Run(1, m_trigger) );



    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=BUTTONS
    final JoystickButton driver_Button_X = new JoystickButton(xboxDriver, XboxController.Button.kX.value);        
//driver_Button_X.whileHeld(new Trigger_Run(1, m_trigger) ,true);
driver_Button_X.whileHeld(new Feeder_Trigger_Run_FWD(m_feeder, m_trigger) ,true);
    SmartDashboard.putData("Driver_Button_X",new Trigger_Run(1, m_trigger) );
  }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
public XboxController getXboxDriver() {
      return xboxDriver;
    }

public XboxController getXboxCoDiver() {
      return xboxCoDiver;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
  */
  public Command getAutonomousCommand() {
    // The selected command will be run in autonomous
    return m_chooser.getSelected();
  }
  

}

