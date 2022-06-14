package ss6_Ke_thua.Bai_tap.Lop_Point_va_MoveablePoint;

public class MovablePoint extends Point{
    private float xSpeed=0f;
    private float ySpeed=0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint move() {
        super.setX(super.getX()+xSpeed);
        super.setY(super.getY()+ySpeed);
        return this;
    }
    @Override
    public String toString() {
        return "MovablePoint{" +
//                " x= " + getX() +
//                " y= " + getY() +
                " xSpeed= " + xSpeed +
                " ySpeed= " + ySpeed +
                '}';
    }
}
