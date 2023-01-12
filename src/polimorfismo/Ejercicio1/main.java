package polimorfismo.Ejercicio1;

public class main {
    public static void main(String[] args) {
        Animal a;
        a = new Lion();
        a.speak();
        a = new Bird();
        a.speak();
        ((Bird)a).fly(); //Para que pueda volar se debe de hacer esto invocando el metodo fly
        //Con este Bird lo que hacemos es explicar al compilador que a es un pajaro y pueda volar

        Flyable lorito;
        lorito = new Bird();
        lorito.fly();

        Animal leonBengala;
        leonBengala = new Lion();
        leonBengala.speak();
    }
}
