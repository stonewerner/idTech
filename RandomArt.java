package randomart;
import processing.core.PApplet;

public class RandomArt extends PApplet{

    float xPos;
    float yPos;

    float r;
    float g;
    float b;
    float a;

    float diameter;

    float startTime;
    float timer;

    public static void main(String[] args) {
        PApplet.main("randomart.RandomArt");
    }

    public void settings(){
        size(450, 450);
    }

    public void setup(){
        background(255);
        startTime = millis();
    }
    public void draw(){
        timer = millis() - startTime;
        if (timer>1000){
            drawCircle();
            startTime = millis();
        }
    }

    public void drawCircle(){
        xPos = random(width);
        yPos = random(height);
        r = random(255);
        g = random(255);
        b = random(255);
        a = random(255);
        diameter = random(100)+50;

        noStroke();
        fill(r,g,b,a);
        ellipse(xPos, yPos, diameter, diameter);
    }
}
