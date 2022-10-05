public class Main {
    public static void main(String[] args) {
        int numeroIf = -1;
        if (numeroIf > 0) {
            System.out.println("POSITIVO");
        } else if (numeroIf < 0) {
            System.out.println("NEGATIVO");
        }else {
            System.out.println("CERO");
        }

        int numeroWhile = 0;

        while(numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        do {
            System.out.println(numeroWhile);
        }while(numeroWhile == 5);


        /*for (int numeroFor = 0; numeroFor >= 0; numeroFor++) {
            numeroFor ++;
            System.out.println("Numero FOR " + numeroFor);
        }*/

        String estacion = "Invierno";

        switch(estacion) {
            case "Verano":
                System.out.println("Verano");
                break;
                case "Invierno":
                    System.out.println("Invierno");
                    break;
            case "Otoño":
                System.out.println("Otoño");
                break;
            case "Primavera":
                System.out.println("Primavera");
            default:
                System.out.println("No valida");
        }
}
}