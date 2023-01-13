package polimorfismo.Ejercicio2;

public class main {
    public static void main(String[] args) {
        Instrumento a;
        a = new Guitarra();
        a.tocar();
        a = new Tambor();
        a.tocar();

    }
}
