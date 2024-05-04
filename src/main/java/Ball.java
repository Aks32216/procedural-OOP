public class Ball {
    private int xPosition;
    private int yPosition;
    private int speedRate;
    private int diameter;

    public Ball(int xPosition,int yPosition,int speedRate,int diameter){
        this.xPosition=xPosition;
        this.yPosition=yPosition;
        this.speedRate=speedRate;
        this.diameter=diameter;
    }


    public int getSpeedRate() {
        return speedRate;
    }

    public int getYPosition() {
        return yPosition;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getXPosition() { return xPosition; }

    public void updateSpeed(){ this.xPosition=getSpeedRate()+getXPosition(); }
}
