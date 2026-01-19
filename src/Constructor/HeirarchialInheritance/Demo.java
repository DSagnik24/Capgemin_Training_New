package Constructor.HeirarchialInheritance;

public class Demo {
    public static void main(String[] args) {

        WhiteTiger wh = new WhiteTiger();
        wh.whiteColor();
        wh.walk();

        Tiger tg = new Tiger();
        tg.roar();
        tg.walk();

        Animal_New an = new Animal_New();
        an.walk();
    }
}
