package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	//PFont f;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		
	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(255);		
		// stroke(255);
		// line(10, 10, 100, 10);
		// line(10, 20, 100, 20);
		// line(10, 30, 100, 30);
		// line(10, 40, 100, 40);

		// for(int y = 10 ; y <= 40 ; y += 10)
		// {
		// 	line(200, y, 300, y);
		// }

		// int yy = 10;
		// while(yy <= 40)
		// {
		// 	line(300, yy, 400, yy);
		// 	yy += 10;
		// }
		
		//shape1();
		//shape2();
		//shape3();
		//shape4();
		shape5();
	
	}

	int i = 0;
	int j = 0;

	public void shape1()
	{
		stroke(0);
		for(i = 0; i <= 500; i += 20)
		{
			line(i, 0, 500 - i, 500);
			line(0, i, 500, 500 - i);
		}
	}

	public void shape2()
	{
		stroke(0);
		fill(255);
		for(i = 0; i <= 500; i += 50)
		{
			ellipse(i, 40, 50, 50);
		}
	}

	public void shape3()
	{
		noStroke();
		for(i = 0; i <= 250; i += 50)
		{
			fill(255, i, 0);
			rect(i, 0, 50, 500);
			if(i == 250)
			{
				for(j = 0; j <= 250; j += 50)
				{
					fill(0, 255, j);
					rect(i + j, 0, 50, 500);
				}
			}
		}
		
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

	int x = -5;
	int z = 0;

	public void shape5()
	{
		background(0);
		
		
		
			for(i = 0; i <= 370; i += 40)
			{
				for(j = 0; j <= 370; j += 40)
				{
					stroke(0, 255, 0);
					fill(0);
					rect(55 + i, 60 + j, 40, 40);
					fill(255);
					text(x, 70 + i, 50);
					text(x, 40, 85 + j);			
				}	
			}
			
		
			
	}
		
		
		

	}
