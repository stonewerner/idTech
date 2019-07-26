import processing.core.PApplet;

public class StatesGame extends PApplet {

    public static void main(String[] args) {
        PApplet.main("StatesGame");
    }

    enum GameState {
        MENU,
        RUNNING,
        WINSCREEN,
        GAMEOVER
    }

    static GameState currentState;

    public void setup() {
        currentState = GameState.MENU;
    }

    public void settings() {
        size(800,800);
    }

    public void draw() {

        switch(currentState){
            case MENU:
                drawMenu();
                break;
            case RUNNING:
                drawRunning();
                break;
            case WINSCREEN:
                drawWinScreen();
                break;
            case GAMEOVER:
                drawGameOver();
                break;
        }

    }

    public void mousePressed(){
        if( currentState == GameState.MENU && mouseX > 190 && mouseX < 610 && mouseY > 40 && mouseY < 140){
            currentState = GameState.RUNNING;
        }

        if( currentState == GameState.RUNNING && mouseX>190 && mouseX<610 && mouseY>180 && mouseY<280){
            currentState = GameState.WINSCREEN;
        }
        if( currentState == GameState.RUNNING && mouseX>190 && mouseX<610 && mouseY>460 && mouseY<560){
            currentState = GameState.GAMEOVER;
        }
        if( currentState == GameState.WINSCREEN && mouseX>190 && mouseX<610 && mouseY>300 && mouseY<400){
            currentState = GameState.MENU;
        }
        if( currentState == GameState.GAMEOVER && mouseX>190 && mouseX<610 && mouseY>180 && mouseY<380){
            currentState = GameState.MENU;
        }
    }

    public void drawMenu(){
        clear();
        background(0,0,0);
        fill(0,149,185);
        rect(150,15, 500,700);
        //PLAY GAME BUTTON
        fill(255,255,255);
        rect(190,40,420,100);
        fill(0,0,0);
        textSize(20);
        text("Play Game", 200, 90);
    }

    public void drawRunning(){
        clear();
        background(0,0,0);
        fill(147,112,219);
        rect(150,15, 500,700);
        //WIN BUTTON
        fill(0,255,0);
        rect(190,180,420,100);
        fill(0,0,0);
        textSize(20);
        text("WIN?", 200, 230);
        //LOSE BUTTON
        fill(255,0,0);
        rect(190,460,420,100);
        fill(0,0,0);
        textSize(20);
        text("LOSE?", 200, 510);
    }

    public void drawWinScreen(){
        clear();
        background(0,0,0);
        fill(0,0,255);
        rect(150,15, 500,700);
        //GG BUTTON
        fill(0,255,0);
        rect(190,40,420,100);
        fill(0,0,0);
        textSize(20);
        text("YOU WON", 200, 90);
        //MENU BUTTON
        fill(255,255,255);
        rect(190,300,420,100);
        fill(0,0,0);
        textSize(20);
        text("MAIN MENU", 200, 350);

    }

    public void drawGameOver(){
        clear();
        background(0,0,0);
        fill(139,69,19);
        rect(150,15, 500,700);
        //GAME OVER BUTTON
        fill(245,222,179);
        rect(190,555,420,100);
        fill(0,0,0);
        textSize(20);
        text("GAME OVER", 200, 605);
        //MENU BUTTON
        fill(255,255,255);
        rect(190,180,420,100);
        fill(0,0,0);
        textSize(20);
        text("MAIN MENU", 200, 230);
    }
}