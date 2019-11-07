/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSP;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Motors extends Subsystem {
  private WPI_TalonSRX talon1;
  private WPI_TalonSRX talon2;
  private WPI_TalonSRX talon3;
  private WPI_VictorSP victor1;
  private WPI_VictorSP victor2;
  private WPI_VictorSP victor3;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public Motors(WPI_TalonSRX talon1, WPI_TalonSRX talon2, WPI_TalonSRX talon3, WPI_VictorSP victor1, WPI_VictorSP victor2, WPI_VictorSP victor3) {
    this.talon1 = talon1;
    this.talon2 = talon2;
    this.talon3 = talon3;
    this.victor1 = victor1;
    this.victor2 = victor2;
    this.victor3 = victor3;
  }

  public void run(double speed) {
    talon1.set(speed);
    talon2.set(speed);
    talon3.set(speed);
    victor1.set(speed);
    victor2.set(speed);
    victor3.set(speed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
