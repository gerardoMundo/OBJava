public class Main {
    public static void main(String[] args) {
        summary(20, 30, 60);
    }
    public static void summary(int a, int b, int c) {
       System.out.println(a + b + c);

       Coche miCoche = new Coche();
       miCoche.incrementarPuertas();
       System.out.println(miCoche.incrementarPuertas());
    }

    public static class Coche {
        public int puertas = 4;


        public int incrementarPuertas() {
            return puertas++;
        }
    }
}