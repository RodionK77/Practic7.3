
public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(5, 5, 10, 10);
        movablePoint.moveUp();
        movablePoint.moveLeft();
        System.out.println(movablePoint);
        MovableCircle movableCircle = new MovableCircle(5, 2, 4, 4, 12);
        MovableCircle mCCopy = movableCircle.copy();
        System.out.println("До копирования (одинаковы)");
        System.out.println(movableCircle);
        System.out.println(mCCopy);
        movableCircle.moveDown();
        movableCircle.moveRight();
        System.out.println("После копирования (разные)");
        System.out.println(movableCircle);
        System.out.println(mCCopy);
    }
}
