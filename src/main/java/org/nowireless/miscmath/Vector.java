package org.nowireless.miscmath;

import org.nowireless.miscmath.annotations.Radian;

/**
 * Represents an 2d Vector that is composed of X and Y components.
 * @author nowireless
 *
 */
public interface Vector {
	
	/**
	 * Get the current X position.
	 * @return The x position
	 */
	public double getX();
	
	/**
	 * Get the current Y position.
	 * @return The Y position
	 */
	public double getY();
	
	/**
	 * Calculates the magnitude of the vector.
	 * @return The magnitude
	 */
	public double getMagnitude();

	/**
	 * Calculates the the angle of the vector.
	 * @return The angle
	 */
	@Radian
	public double getAngle();
	
	/**
	 * Resets the vector
	 */
	public void reset();
	
	/**
	 * Adds the provided vector to this one.
	 * @param vector THe vector to add by
	 */
	public void add(Vector vector);
	
	/**
	 * Subtracts the provided vector from this one.
	 * @param vector The vector to subtract by
	 */
	public void subtract(Vector vector);
}
