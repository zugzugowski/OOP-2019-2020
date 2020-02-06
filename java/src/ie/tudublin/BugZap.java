package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{	
    float playerX = 400;
    float playerY = 700;
    float playerWidth = 35;
    float i, y, j;

    
    

	public void settings()
	{
		size(800, 800);
	}

    public void setup() 
    {
        
    }

    void drawEnemy(float x, float y, float w, float h)
    {
        noStroke();
        fill(0);
        rect(x, y, w, h);
    }

    void drawPlayer(float x, float y, float w)
    {
        noStroke();
        fill(0);
        ellipse(x, y, w, 35);
    }

    void shot(float x1, float y1, float x2, float y2)
    {
        stroke(255, 0, 0);
        fill(255, 0, 0);
        strokeWeight(3);
        line(x1, y1, x2, y2);
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

    int x1, x2, x3, x4 = 0; // 4 bytes
    int x5 = 200;
    int bounce_back1, bounce_back2, bounce_back3, bounce_back4 = 0;
    
    float e1 = 1;
    float e2 = 201;
    float e3 = 401;
    float e4 = 601;
	
	public void draw()
	{	
        background(255);
        drawPlayer(this.playerX, this.playerY, this.playerWidth);
        if(x1 < 200 && bounce_back1 == 0)
        {
            drawEnemy(e1 + x1, 150, 30, 25);
            x1++;
            if(x1 == 200)
            {
                bounce_back1 = 1;
            }
        }
        if(x1 > 0 && bounce_back1 == 1)
        {
            drawEnemy(e1 + x1, 150, 30, 25);
            x1--;
            if(x1 == 0)
            {
                bounce_back1 = 0;
            }
        }

        if(x2 < 400 && bounce_back2 == 0)
        {
            drawEnemy(e2 + x2, 150, 30, 25);
            x2++;
            if(x2 == 400)
            {
                bounce_back2 = 1;
            }
        }
        if(x2 > 200 && bounce_back2 == 1)
        {
            drawEnemy(e2 + x2, 150, 30, 25);
            x2--;
            if(x2 == 200)
            {
                bounce_back2 = 0;
            }
        }

        if(x3 < 600 && bounce_back3 == 0)
        {
            drawEnemy(e3 + x3, 150, 30, 25);
            x3++;
            if(x3 == 600)
            {
                bounce_back3 = 1;
            }
        }
        if(x3 > 400 && bounce_back3 == 1)
        {
            drawEnemy(e3 + x3, 150, 30, 25);
            x3--;
            if(x3 == 400)
            {
                bounce_back3 = 0;
            }
        }

        if(x4 < 800 && bounce_back4 == 0)
        {
            drawEnemy(e4 + x4, 150, 30, 25);
            x4++;
            if(x4 == 800)
            {
                bounce_back4 = 1;
            }
        }
        if(x4 > 600 && bounce_back4 == 1)
        {
            drawEnemy(e4 + x4, 150, 30, 25);
            x4--;
            if(x4 == 600)
            {
                bounce_back4 = 0;
            }
        }
    }

    
    public void keyPressed()
    {
        if(keyCode == LEFT)
        {
            this.playerX = this.playerX - 3;
            if(this.playerX <= 0)
            {
                this.playerX = 10;
            }
            
        }
        if(keyCode == RIGHT)
        {
            this.playerX = this.playerX + 3;
            if(this.playerX >= 800)
            {
                this.playerX = 790;
            }
            
        }
        if(keyCode == ' ')
        {
            shot(this.playerX, this.playerY - 20, this.playerX, this.playerY - 700);
        }
    }
    
}