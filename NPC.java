package npc;
import processing.core.PApplet;
import processing.core.PFont;

public class NPC extends PApplet{

    PFont font;
    PFont playerFont;
    int textY;
    String typing = "";
    String name = "";

    public static void main(String[] args) {
        PApplet.main("npc.NPC");
        //String[] fontList = PFont.list();
        //printArray(fontList);
    }

    public void settings(){
        size(800,500);
    }

    public void setup(){
        font = createFont("Arial Black",16, true);
        playerFont = createFont("Lucida Bright", 16, true);
    }

//////////----------------------------------------------------------------------
    public void draw(){
        background(255,255,255);
        textY = 1;
        drawNPCText("Hello, what is your name?");
        drawNPCText("Press Enter when done.");
        drawPlayerText(typing);
        if (name!= ""){
            drawNPCText("Hello " + name + " ! Welcome!");
        }

    }

    public void drawNPCText(String text){
        textFont(font, 38);
        fill(5,200,255);
        text(text, 15, 50+(textY*40));
        textY +=1;

    }

    public void drawPlayerText(String text){
        textFont(playerFont, 38);
        fill(255,15,200);
        text(text, 315, 50+(textY*40));
        textY +=1;

    }
////////////////----------------------------------------------------------------------------

    public void keyPressed(){
        if (key=='\n'){
            name = typing;
        }
        else{
            typing = typing + key;
        }
    }
}
