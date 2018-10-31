public class Person implements Jump, Move {
    @Override
    public void jump() {
        System.out.print("Jump");
    }

    @Override
    public void move() {
        System.out.print("Move");
    }

    @Override
    public int qwe() {
        return 0;
    }

    @Override
    public void doSomething() {
        System.out.print("do something");
    }
}
