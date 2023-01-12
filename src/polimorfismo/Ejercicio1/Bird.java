package polimorfismo.Ejercicio1;

public class Bird extends Animal implements Flyable{
    @Override
    public void fly() {}
    @Override
    void speak() {
        System.out.println("PIPIPIPIPIPIPIPIPI");
    }
}
