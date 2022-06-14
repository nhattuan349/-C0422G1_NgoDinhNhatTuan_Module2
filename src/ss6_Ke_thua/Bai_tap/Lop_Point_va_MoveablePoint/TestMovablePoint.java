package ss6_Ke_thua.Bai_tap.Lop_Point_va_MoveablePoint;

public class TestMovablePoint {
    public static void haiThamSo(){
        MovablePoint movablePoint1 =new MovablePoint();

    }
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(4,6,8,9);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
        movablePoint.move();
        System.out.println(movablePoint);
        movablePoint.move();
        movablePoint.move();
        movablePoint.move();
        System.out.println(movablePoint);


        MovablePoint movablePointF = new MovablePoint();
        System.out.println(movablePointF);

        movablePointF = new MovablePoint(4,6);
        System.out.println(movablePointF);

        movablePointF = new MovablePoint(8,6,0,0);
        System.out.println(movablePointF);
    }

}
