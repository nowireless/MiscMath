package org.nowireless.miscmath;

public class RunningVector implements Vector {

	private double x;
	private double y;

	public RunningVector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public RunningVector() {
		this(0,0);
	}
	
	@Override
	public double getX() {
		return this.x;
	}

	@Override
	public double getY() {
		return this.y;
	}

	@Override
	public double getMagnitude() {
		return Math.sqrt((x*x) + (y*y));
	}

	@Override
	public double getAngle() {
		return Math.atan2(y, x);
	}

	@Override
	public void reset() {
		this.x = 0;
		this.y = 0;
	}

	@Override
	public void add(Vector vector) {
		this.x += vector.getX();
		this.y += vector.getY();
	}

	@Override
	public void subtract(Vector vector) {
		this.x -= vector.getX();
		this.y -= vector.getY();
	}

}
