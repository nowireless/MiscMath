package org.nowireless.miscmath;

/**
 * Helper for calculating Integrals on the fly.
 * @author nowireless
 *
 */
public class Integration {
	
	private double integral = 0;
	private double last = 0;
	
	/**
	 * Resets the internal state.
	 */
	public void reset() {
		integral = 0;
		last = 0;
	}
	
	/**
	 * Gets the current calculated integral.
	 * @return The current integral
	 */
	public double getIntegral() {
		return integral;
	}
	
	/**
	 * Add a new value to the current integral.
	 * @param value The value to add.
	 * @param step The delta X from the last sample's x point
	 */
	public void integrate(double value, double step) {
		integral += ((last + value) / 2) * step;
	}
}
