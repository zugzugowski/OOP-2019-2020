package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
	}

	/*
	public void draw() {
		background(0, 0, 255);
		stroke(255, 0, 0);
		fill(255, 255, 0);
		line(10, 10, 100, 100);		// x1, y1, x2, y2
		point(50, 50); // x, y
		ellipse(100, 200, 50, 150); // cx, cy, w, h
		fill(0, 255, 0);
		rect(50, 10, 100, 200); // tlx, tly, w, h
		triangle(10, 10, 100, 90, 200, 200); // vertices	
	}	
	*/

	int x = 0; // 4 bytes
	
	public void draw()
	{	
		// background(100, 0, 255);
		// noStroke();
		// //stroke(0, 0, 255);
		// line(10, 10, 100, 100); //x1, y1, x2, y2
		// point(50, 50); //x, y
		// fill(0, 255, 255);
		// ellipse(100, 200, 100, 50); // tx, ty, w, h
		// rect(70, 110, 90, 10); //tlx, tly, w, h
		// fill(255, 0, 100);
		// triangle(150, 90, 200, 100, 100, 250);

		background(255, 0, 0);
		noStroke();
		fill(255, 255, 0);
		ellipse(250, 300, 350, 350);
		fill(0, 100, 255);
		triangle(250, 50, 50, 450, 450, 450);
		fill(155);
		ellipse(250, 250, 190, 80);
		fill(0);
		ellipse(mouseX, mouseY, 50, 50);

		
	}
}
