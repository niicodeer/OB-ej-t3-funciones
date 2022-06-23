
public class funcionSuma{
    public static void main(String[] args) {
        int resultado = 0;
        resultado = suma(10,10, 15);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();

        System.out.println("Número de puertas de miCoche: " + miCoche.puertas);

    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche{
    public int puertas = 4;
    public void incrementarPuertas() {
        this.puertas++;
    }
} 
