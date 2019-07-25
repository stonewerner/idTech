package firefly;
import processing.core.PApplet;

public class Firefly extends PApplet {

    float xPos;
    float yPos;
    float speed;
    float r;
    float g;
    float b;

    public static void main(String[] args) {
        PApplet.main("firefly.Firefly");
    }

    public void settings(){
        size(450,450);
    }

    public void setup(){
        xPos = width/2;
        yPos = height/2;
        speed = 2;
        r = 10;
        g = 200;
        b = 255;

    }

    public void draw(){
        background(255);
        drawFireFly();
        shake();
        changeLight();
    }

    public void drawFireFly(){
        noStroke();
        //RIGHT WING
        fill(10,255,20);
        triangle(xPos+20, yPos+50, xPos+120, yPos+50, xPos, yPos+80);
        //LEFT WING
        fill(10,255,20);
        triangle(xPos+20, yPos+50, xPos-120, yPos+50, xPos, yPos+80);
        //ASS LIGHT
        fill(r,g,b,150);
        ellipse(xPos, yPos+100, 25,25);
        //BODY
        fill(24,56,47);
        ellipse(xPos, yPos+45, 45, 100);
        //HEAD
        fill(10,200,255);
        ellipse(xPos, yPos, 50, 50);

    }
    void shake(){
        xPos =xPos + random(-1,1)*speed;
        yPos =yPos + random(-1,1)*speed;
        xPos = constrain(xPos, 50, width-50);
        yPos = constrain(yPos, 0, height-100);
    }
    void changeLight(){
        r = random(120)+135;
        g = random(120)+135;
        b = random(120)+135;
    }

}
