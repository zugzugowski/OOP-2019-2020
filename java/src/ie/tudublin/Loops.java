package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	//PFont f;

	int i, j;
	float diameter = 10;
	float opacity = 255;
	float ellipseSize = 20;
	float squareSize = 25;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		
	}

	public void loops1()
	{
		stroke(255);
		int numLines = (int) (30 * (mouseX / (float) width)) ;
		float gap = width / (float) numLines;
		for(int i = 0 ; i <= numLines ; i ++)
		{
			float x = i * gap;
			line(x, 0, width - x, height);
			line(0, x, width, height -x);
		}
	}

	float offset = 0;

	public void loops2()
	{
		int numCircles  = (int) (20 * (mouseX / (float) width)) ;
		
		float w = width / (float) numCircles;
		float radius = w / 2.0f;
		colorMode(HSB);
		float cGap = 255 / (float) (numCircles * numCircles);
		noStroke();

		for(int j = 0 ; j < numCircles ; j ++)
		{		
			for(int i = 0 ; i < numCircles ; i ++)
			{
				float x = radius + (i * w);
				float y = radius + (j * w);
				float c = (cGap * i * j + offset) % 255; 
				fill(c, 255, 255);
				ellipse(x, y, w, w);
			}
		}
		offset += mouseY / 250.0f;
	}

	public void loops3()
	{
		float gap = width * 0.1f;
		float halfGap = gap / 2.0f;
		colorMode(RGB);
		stroke(0, 255, 0);
		textAlign(CENTER, CENTER);
		for(int i = -5 ; i <=5 ; i ++)
		{
			float x = map(i, -5, 5, gap, width -gap);	
			//System.out.println(x);			
			line(x, gap, x, height - gap);
			line(gap, x, width - gap, x);
			fill(255);
			text(i, x, halfGap);
			text(i, halfGap, x);
			
		}
	}



	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}
	
	public void loop4()
	{
		background(100);
		float gap = width * 0.1f;
		float halfGap = gap / 2;
		
		for(int i = 0; i < 5; i++)
		{
			float y = map(i, 0, 5, 50, 8);
			float x = map(i, 0, 5, 100, 15);
			float z = map(i, 0, 5, 0, 125);
			// System.out.println(x);
			// System.out.println(y);
			// System.out.println(z);
			rect(gap + z, halfGap + z, (gap * 8) - (z * 2), halfGap);
		}
	}

	public void loops5()
	{
		
		float gap = width * 0.1f;
		float halfGap = gap * 2;
		float halfScreen = width * 0.5f;
		colorMode(HSB);
		float opacity = 255;

		for( i = 0; i < 25; i++)
		{	
			for(int j = 0; j < 25; j++)
			{
				float x = map(i, 0, 25, 0, 255);
				float colors = (x + mouseX) % 255;
				float posX = map(i, 0, 25, 0, 500);
				float posY = map(j, 0, 25, 0, 500);		
				// System.out.println(x);
				// System.out.println(y);
				// System.out.println(z);
				noStroke();
				fill(colors, 255, 255);
				ellipse((ellipseSize/2) + posX, (ellipseSize/2) + posY, ellipseSize, ellipseSize);
			}
		}

		
	}

	public void loops6()
	{
		float gap = width * 0.1f;
		float halfGap = gap * 2;
		float halfScreen = width * 0.5f;
		colorMode(HSB);
		float opacity = 255;
		float z = 0;

		for(int i = 0; i < 25; i++)
		{
			for(int j = 0; j < 25; j++)
			{
				float x = map(z, 0, 1, 0, 200);
				//System.out.println(x);
				//System.out.println(z);
				float posX = map(i, 0, 25, 0, 500);
				float posY = map(j, 0, 25, 0, 500);	
				noStroke();
				fill(180, 255, x);
				rect(posX, posY, squareSize, squareSize);
				z++;
				z = z % 2;
			}
		}
	}

	public void draw()
	{	
		background(0);		
		colorMode(HSB);
		//loops1();

		//loops2();

		//loops3();
		//loop4();
		//loops5();
		loops6();
	}

	public void shape4()
	{
		noStroke();
		for(i = 0; i <= 250; i += 50)
		{
			fill(255, i, 0);
			ellipse(30 + i, 50, 50, 50);
			if(i == 250)
			{
				for(j = 0; j <= 250; j += 50)
				{
					fill(0, 255, j);
					ellipse(30 + (i + j), 50, 50, 50);
				}
			}
		}
	}

	// public void shape5()
	// {
	// 	background(0);
		
		
		
	// 		for(i = 0; i <= 370; i += 40)
	// 		{
	// 			for(j = 0; j <= 370; j += 40)
	// 			{
	// 				stroke(0, 255, 0);
	// 				fill(0);
	// 				rect(55 + i, 60 + j, 40, 40);
	// 				fill(255);
	// 				text(x, 70 + i, 50);
	// 				text(x, 40, 85 + j);			
	// 			}	
	// 		}
			
		
			
	//}
		
		
		

	}
