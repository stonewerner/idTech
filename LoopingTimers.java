package loopingtimers;
import processing.core.PApplet;

public class LoopingTimers extends PApplet
{
    public int startTime;
    public int timer;
    public int count;
    public int colorState = 0;
    public int sizeState = 0;

    public static void main(String[] args) {

        PApplet.main("loopingtimers.LoopingTimers");
    }



    //2D array with (x, y) locations of the points of the cat.
    public int[][] catPoints = {{10, 10}, {12, 12}, {14, 14}, {15, 18},
            {18, 22}, {21, 27}, {21, 32}, {24, 28}, {23, 24}, {23, 20},
            {25, 18}, {28, 18}, {27, 20}, {25, 21}, {25, 25}, {25, 30},
            {21, 34}, {13, 34}, {10, 34}, {11, 32}, {14, 33}, {11, 30},
            {11, 28}, {10, 30}, {9, 34}, {7, 33}, {8, 33}, {8, 30}, {7, 27},
            {7, 24}, {8, 21}, {9, 18}, {7, 17}, {6, 16}, {7, 13}, {9, 12},
            {10, 10}};

    public void settings() {
        size(1100, 900);
    }

    public void setup() {
        background(255, 255, 255);
        startTime = millis();
        count = catPoints.length -1;

        for(int i=0; i<catPoints.length; i++){
            catPoints[i][0]*=10;
            catPoints[i][1]*=10;
        }

    }

    public void draw() {
        timer = millis() - startTime;


        if (timer>500 && count > 0){
            line(catPoints[count][0],catPoints[count][1], catPoints[count-1][0], catPoints[count-1][1]);
            count--;
            System.out.println("1/2 a second passed");
            startTime=millis();
        }

    }
    public void keyReleased(){
        if (key==' '){
            if (colorState<2){
                colorState++;
            }
            else{
                colorState=0;
            }
            if (colorState==0){
                stroke(0,0,0);
            }
            if (colorState==1){
                stroke(255,0,0);
            }
            if (colorState==2){
                stroke(0,0,255);
            }

        }
        if (key=='b'){
            if (sizeState<1){
                sizeState++;
            }
            else{
                sizeState=0;
            }
            if (sizeState==0){
                for(int i=0; i<catPoints.length; i++){
                    catPoints[i][0]*=2;
                    catPoints[i][1]*=2;
                }
            }
            if (sizeState==1){
                for(int i=0; i<catPoints.length; i++){
                    catPoints[i][0]*=2;
                    catPoints[i][1]*=2;
                }
            }
        }
    }

}