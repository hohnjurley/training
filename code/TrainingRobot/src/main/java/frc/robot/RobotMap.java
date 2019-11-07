/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    static WPI_TalonSRX talon;

    static {
        talon1 = new WPI_TalonSRX(0);
        talon2 = new WPI_TalonSRX(13);
        talon3 = new WPI_TalonSRX(15);
        victor1 = new WPI_VictorSP(1);
        victor2 = new WPI_VictorSP(2);
        victor3 = new WPI_VictorSP(14);
    }
}
