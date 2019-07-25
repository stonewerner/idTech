package imagetest;
import processing.core.PApplet;
import processing.core.PImage;

public class ImageTest extends PApplet {

    PImage duck;
    PImage bg;

    public static void main(String[] args) {
        PApplet.main("imagetest.ImageTest");
    }
    public void settings(){
        size(500,500);
    }
    public void setup(){
        duck = loadImage("Images/Duck.png");
        bg = loadImage("Images/Sky.png");
        //duck.filter(POSTERIZE, 150);

    }
    public void draw(){
        background(bg);
        duck.resize(300,0);
        //tint(20,200,200,150);
        image(duck,0,200);


    }

}
