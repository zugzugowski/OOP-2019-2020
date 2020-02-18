package ie.tudublin;

import processing.core.PApplet;


public class Arrays extends PApplet
{	

	//float[] rainfall = new float[12];
	float[] rainfall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	float min, max, monthCount1, monthCount2 = 0;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		// for(int i = 0; i < rainfall.length; i++)
		// {
		// 	println(months[i] + "\t" + rainfall[i]);
		// }

		// for(float f:rainfall)
		// {
		// 	println(f);
		// }

		max = rainfall[0];
		min = rainfall[0];

		for(int i = 0; i < months.length; i++)
		{
			if(max < rainfall[i])
			{
				max = rainfall[i];
				monthCount1 = i;
			}

			if(min > rainfall[i])
			{
				min = rainfall[i];
				monthCount2 = i;
			}
		}

		println("The highest rainfall happened in " + months[(int)monthCount1] + " and was " + max);
		println("The lowest rainfall happened in " + months[(int)monthCount2] + " and was " + min);
	}

	

	float offset = 0;

	
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(255);		
		colorMode(HSB);	
		drawBarChart();
	}

	void drawBarChart()
	{
		noStroke();
		for(int i = 0; i < rainfall.length; i++)
		{
			fill(255 - (i * 40), (i * 10), (i * 40));
			rect((i * 30), 0, 30, rainfall[i]);
		}
		
	}
}
