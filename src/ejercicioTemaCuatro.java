public class ejercicioTemaCuatro {

    public static void main(String[] args) {

        int numeroIf = -1;
        int numeroWhile = 0;
        int numeroDoWhile = 0;
        var estacion = "Invierno";


        if(numeroIf > 0) {
            System.out.println(numeroIf + " " + "es positivo!");
        } else if (numeroIf < 0) {
            System.out.println(numeroIf + " " + "es negativo!");
        } else if (numeroIf == 0) {
            System.out.println(numeroIf + " " + "es cero!");
        }

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        do {
            numeroDoWhile++;
            System.out.println(numeroWhile);
        } while (numeroDoWhile > 3);

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        switch (estacion) {
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es primavera");
                break;
            case "Otronio":
                System.out.println("Es primavera");
                break;
            case "Invierno":
                System.out.println("Es primavera");
                break;
            default: System.out.println("Ninguna estacion coincide");
        }

    }
}
