//NOT DONE---MOVING TO GLOB ATTACK

package menus;
import processing.core.PApplet;

public class Menus extends PApplet {

    public int winner = -1;
    public int score = 0;
    public int highScore = 0;

    enum GameState{
        START,
        RUNNING,
        OVER
    }
    static GameState currentState;

    public static void main(String[] args) {
        PApplet.main("menus.Menus");
    }

    public void settings(){
        size(500,500);
    }

    public void setup(){
        currentState = GameState.START;
    }


    public void draw(){
        background(255);
        switch (currentState){
            case START:
                drawStart();
                break;
            case RUNNING:
                drawRunning();
                break;
            case OVER:
                drawGameOver();
                break;
        }
    }

    public void mousePressed(){
        if (currentState == GameState.START){
            if (mouseX > (width / 2 - 50) && mouseX < (width / 2 + 50) && mouseY > height / 2 +25 && mouseY < (height / 2 +100)) {

                System.out.println("YES");
                currentState = GameState.RUNNING;

            }

        }
        if (currentState == GameState.RUNNING){
            if (mouseX > (width / 2 - 50) && mouseX < (width / 2 + 50) && mouseY > height / 2 + 25 && mouseY < (height / 2 + 100)) {

                currentState = GameState.START;

            }
        }


    }

    void drawStart() {
        fill(232, 248, 253);
        noStroke();
        rect(width / 2 - 125, height / 2 - 100, 250, 200);
        fill(20, 185, 235); // 255
        textAlign(CENTER);
        text("Welcome!\nClick the mouse to generate a\n random number and winner.", width / 2, height / 2 - 20);
        //START BUTTON
        fill(255,255,0);
        noStroke();
        rect(width/2 -50, height/2 +25, 100,75);
        textAlign(CENTER);
        fill(0,0,0);
        text("Click to Start", width / 2, height / 2 +50);

    }
    void drawRunning(){
        fill(217, 255, 179);
        noStroke();
        rect(width / 2 - 200, height / 2 - 100, 400, 200);
        fill(20, 185, 235); // 255
        textAlign(CENTER);
        text("Game on!", width / 2, height / 2 - 30);
        textAlign(RIGHT);
        text("Click to generate a winner!", width / 2, height / 2 - 10);
        textAlign(LEFT);
        text("Try to break the high score!\nCurrent high score: " + highScore, width / 2, height / 2 + 5);
    }
    void drawGameOver() {
        fill(255, 190, 190);
        noStroke();
        rect(width / 2 - 125, height / 2 - 80, 250, 160);
        fill(255, 100, 100); // 255
        textAlign(CENTER);
        text("Game Over!", width / 2, height / 2 - 50);
        if (winner == 0) {
            text("Player 1 wins!", width / 2, height / 2 - 30);
        } else if (winner == 1) {
            text("Player 2 Wins", width / 2, height / 2 - 30);
        } else if (winner == 2) {
            text("Draw", width / 2, height / 2 - 30);
        }
        text("High Score " + highScore, width / 2, height / 2 - 10);
        //MAIN MENU BUTTON
        fill(0,255,255);
        noStroke();
        rect(width/2 -50, height/2 +25, 100,75);
        textAlign(CENTER);
        fill(0,0,0);
        text("MAIN MENU", width / 2, height / 2 +50);
        //RESTART BUTTON
        fill(0,255,255);
        noStroke();
        rect(width/2 -50, height/2 -50, 100,75);
        textAlign(CENTER);
        fill(0,0,0);
        text("RESTART", width / 2, height / 2 -25);
    }

}
