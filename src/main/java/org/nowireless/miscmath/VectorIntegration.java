package org.nowireless.miscmath;

public class VectorIntegration {
	
	private final Integration x = new Integration();
	private final Integration y = new Integration();
	
	public void reset() {
		this.x.reset();
		this.y.reset();
	}
	
	public Integration getX() {
		return this.x;
	}
	
	public Integration getY() {
		return this.y;
	}
	
	public Vector getIntegral() {
		return new ImmutableVector(x.getIntegral(), y.getIntegral());
	}
	
	public void integrate(Vector vector, double step) {
		this.x.integrate(vector.getX(), step);
		this.y.integrate(vector.getY(), step);
	}
	
}
