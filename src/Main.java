public class Main {
    public static void main(String[] args) {
         class Persona {
            private String nombre;
            private String telefono;
            private int edad;

            public void setEdad(int edad) {
                this.edad = edad;
            }
             public void setNombre(String nombre) {
                 this.nombre = nombre;
             }
             public void setTelefono(String telefono) {
                 this.telefono = telefono;
             }

             public int getEdad() {
                return this.edad;
             }
             public String getNombre() {
                 return this.nombre;
             }
             public String getTelefono() {
                 return this.telefono;
             }

        }

        Persona Persona1 = new Persona();

         Persona1.setEdad(20);
         Persona1.setNombre("Pedro");
         Persona1.setTelefono("12238739");

         System.out.println(Persona1.getEdad());
         System.out.println(Persona1.getNombre());
         System.out.println(Persona1.getTelefono());


}
}