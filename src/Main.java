public static int suma (int a, int b, int c) {
        return a + b + c
        }

public static void main {
        suma(a: 10, b:20, c:30)
        Coche miCoche = new Coche()
        miCoche.aumentarPuertas()
        System.out.println(miCoche.puertas)
        }

class Coche {
    public int puertas = 4;
    public void aumentarPuertas() {
        this.puertas ++
    }
}