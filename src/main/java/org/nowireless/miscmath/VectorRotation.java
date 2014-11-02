package org.nowireless.miscmath;

import org.nowireless.miscmath.annotations.Radian;

/**
 * Helps with {@link Vector} rotation.
 * @author nowireless
 *
 */
public class VectorRotation {
	
	/**
	 * Rotates the given {@link Vector} by the given angle.
	 * The angle on a unit circle would rise when going counter clock wise.
	 * @param vec The source vector
	 * @param angle The angle to rotate by
	 * @return The rotated vecotr
	 */
	public static Vector rotateCounterClockWise(Vector vec, @Radian double angle) {
		double xPrime = vec.getX() * Math.cos(angle) + vec.getY() * Math.sin(angle);
		double yPrime = vec.getX() * Math.sin(angle) + vec.getY() * Math.cos(angle);
		return new Vector(xPrime, yPrime);
	}
}
