package org.nowireless.miscmath;

import org.nowireless.miscmath.annotations.Radian;

/**
 * Represents an 2d Vector that is composed of X and Y components.
 * @author nowireless
 *
 */
public class Vector {
	
	private final double x;
	private final double y;
	
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	/**
	 * Calculates the magnitude of the vector.
	 * @return The magnitude
	 */
	public double getMagnitude() {
		return (x*x) + (y*y);
	}
	
	/**
	 * Calculates the the angle of the vector.
	 * @return The angle
	 */
	@Radian
	public double getAngle() {
		return Math.atan2(y, x);
	}
	
	/**
	 * Creates a vector with the given values.
	 * @param magnitude The magnitude of the vector to be.
	 * @param angle	The angle of the vector to be.
	 * @return The vector
	 */
	public static Vector valueOf(double magnitude, @Radian double angle) {
		double x = Math.sin(angle) * magnitude;
		double y = Math.cos(angle) * magnitude;
		return new Vector(x, y);
	}
}
