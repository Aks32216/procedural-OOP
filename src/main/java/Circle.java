public class Circle {
    private int id;
    private int height;
    private int speed;
    private int diameter;

    public Circle(int id,int height,int speed,int diameter){
        this.id=id;
        this.height=id*height;
        this.speed=speed;
        this.diameter=diameter;
    }

    public int getId(){
        return id;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHeight() {
        return height;
    }

    public int getDiameter() {
        return diameter;
    }

    public void updateSpeed(){
        this.speed= getSpeed() + getId();
    }
}
