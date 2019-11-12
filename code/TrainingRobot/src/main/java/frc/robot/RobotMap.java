/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    static WPI_TalonSRX talon1;
    static WPI_TalonSRX talon2;
    static WPI_TalonSRX talon3;
    static WPI_VictorSPX victor1;
    static WPI_VictorSPX victor2;
    static WPI_VictorSPX victor3;
    static DoubleSolenoid ds;

    static {
        talon1 = new WPI_TalonSRX(1);
        talon2 = new WPI_TalonSRX(4);
        talon3 = new WPI_TalonSRX(7);
        victor1 = new WPI_VictorSPX(2);
        victor2 = new WPI_VictorSPX(3);
        victor3 = new WPI_VictorSPX(5);
        ds = new DoubleSolenoid(1, 3);
    }
}
