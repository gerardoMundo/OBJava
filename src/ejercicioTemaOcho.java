public class ejercicioTemaOcho {

    public static void main(String[] args) {

        Persona Maestro = new Persona();

        Maestro.setEdad(40);
        System.out.println(Maestro.getEdad());

        Maestro.setNombre("Juan Osorio");
        System.out.println(Maestro.getNombre());

        Maestro.setTelefono(555976123);
        System.out.println(Maestro.getTelefono());


    }

    static class Persona {
        // encapsulamiento de propiedades del objeto;
        private int edad;
        private String nombre;
        private int telefono;

        //funcion setter: define la propiedad privada mediente el atributo public
        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        //funcion getter
        public int getEdad() {
            return this.edad;
        }

        public String getNombre() {
            return this.nombre;
        }

        public int getTelefono() {
            return this.telefono;
        }
    }
}
