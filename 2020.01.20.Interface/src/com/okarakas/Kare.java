package com.okarakas;

public class Kare implements GeometrikSekil{

	private double kenar;

	public double getKenar() {
		return kenar;
	}

	public void setKenar(double kenar) {
		this.kenar = kenar;
	}

	public Kare(double kenar) {
		super();
		this.kenar = kenar;
	}

	@Override
	public double alan() {
		return kenar*kenar;
	}

	@Override
	public double cevre() {
		return 4*kenar;
	}
	
/*	public double alan() {
		return kenar*kenar;
	}
	
	public double cevre() {
		return 4*kenar;
	}
*/	
}
