package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {

		Rectangle[] rt = new Rectangle[2];
		Circle[] cl = new Circle[2];
		
		cl[0] = new Circle(1, 2, 3);
		cl[1] = new Circle(3, 3, 4);
		
		rt[0] = new Rectangle(-1, -2, 5, 2);
		rt[1] = new Rectangle(-2, 5, 2, 8);
		
		cl[0].draw();
		cl[1].draw();
		
		rt[0].draw();
		rt[1].draw();
		
		
		
	}

}
