package org.nowireless.miscmath;

import org.nowireless.miscmath.annotations.Radian;

/**
 * Represents an 2d Vector that is composed of X and Y components.
 * The X and Y of this vector can not be changed, hence Immutable.
 * @author nowireless
 *
 */
public class ImmutableVector implements Vector {
	
	private final double x;
	private final double y;
	
	public ImmutableVector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public double getX() {
		return x;
	}

	@Override

	public double getY() {
		return y;
	}
	
	@Override
	public double getMagnitude() {
		return Math.sqrt((x*x) + (y*y));
	}
	
	@Override
	@Radian
	public double getAngle() {
		return Math.atan2(y, x);
	}

	@Override
	public void reset() {
		throw new UnsupportedOperationException("Can not reset a Immutable Vector");
	}

	@Override
	public void add(Vector vector) {
		throw new UnsupportedOperationException("Can not add to a Immutable Vector");
	}

	@Override
	public void subtract(Vector vector) {
		throw new UnsupportedOperationException("Can not subtract from a Immutable vector");
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
		return new ImmutableVector(x, y);
	}
	
	public static Vector valueOf(Vector vector) {
		return new ImmutableVector(vector.getX(), vector.getY());
	}

}
