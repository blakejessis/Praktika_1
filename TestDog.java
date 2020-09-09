import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Шарик", 2);
        Dog d2 = new Dog("Полиграф Полиграфович", 7);
        Dog d3 = new Dog("Тотошка");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        System.out.println(d2);
        d2.intoHumanAge();
        System.out.println(d3);
        d3.intoHumanAge();
    }
}