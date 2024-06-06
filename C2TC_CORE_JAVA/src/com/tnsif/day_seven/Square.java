package com.tnsif.day_seven;

public  class Square extends Shape{
	
	float side;

	public Square() {
		side= 2.0f;
	}
	public Square(float side) {
		super();
		this.side = side;
	}


	@Override
	void CalcArea() {
		// TODO Auto-generated method stub
		super.area = side*side;
	}

}
