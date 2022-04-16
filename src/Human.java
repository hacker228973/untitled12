public class Human implements Swimmable , Runnable   {

    @Override
    public void run() {
        System.out.println("Бежит");
    }

    @Override
    public void swimm() {
        System.out.println("Плывет");
    }
}
