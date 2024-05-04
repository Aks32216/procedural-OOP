import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class Applet extends PApplet {
    public static final int WIDTH = 1800;
    public static final int HEIGHT = 1000;
    public static final int DIAMETER = 100;
    public int numberOfBalls = 4;
    Balls[] balls;

    public static void main(String[] args) {
        PApplet.main("Applet",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        balls=new Balls[numberOfBalls];
        for(int i=1;i<=numberOfBalls;++i){
            balls[i-1]=new Balls(0,i*(HEIGHT/5),i,DIAMETER);
        }
    }

    @Override
    public void draw() {
        for(Balls ball:balls){
            ellipse(ball.getXPosition(),ball.getYPosition(),ball.getDiameter(),ball.getDiameter());
            ball.updateSpeed();
        }
    }
}
