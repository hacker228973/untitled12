public class Duck implements Flyable,Swimmable,Runnable{
    @Override
    public void fly() {
        System.out.println("Летит");
    }

    @Override
    public void run() {
        System.out.println("Бежит");
    }

    @Override
    public void swimm() {
        System.out.println("Плывет");
    }
}