import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class FourBalls extends PApplet {
    public static final int WIDTH = 1800;
    public static final int HEIGHT = 1000;
    public static final int DIAMETER = 100;
    List<Circle> balls;

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        Circle c1=new Circle(1,height/5,0, DIAMETER);
        Circle c2=new Circle(2,height/5,0,DIAMETER);
        Circle c3=new Circle(3,height/5,0,DIAMETER);
        Circle c4=new Circle(4,height/5,0,DIAMETER);

        balls=Arrays.asList(c1,c2,c3,c4);
    }

    @Override
    public void draw() {
        for(Circle ball:balls){
            ellipse(ball.getSpeed(),ball.getHeight(),ball.getDiameter(),ball.getDiameter());
            ball.updateSpeed();
        }
    }
}
