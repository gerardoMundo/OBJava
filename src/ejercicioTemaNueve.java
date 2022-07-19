public class ejercicioTemaNueve {

    public static void main(String[] args) {
        Cliente nuevoCliente = new Cliente();
        Trabajador nuevoTrabajador = new Trabajador();

        nuevoCliente.setDatos(34, "Genaro", 55596785, (float) 18456.76);
        System.out.println(nuevoCliente.getDatosEdad());
        System.out.println(nuevoCliente.getDatosNombre());
        System.out.println(nuevoCliente.getDatosTelefono());
        System.out.println(nuevoCliente.getDatosCredito());

        nuevoTrabajador.setDatos(45, "Francisco", 555967130, (float) 11234.76);
        System.out.println(nuevoTrabajador.getDatosEdad());
        System.out.println(nuevoTrabajador.getDatosNombre());
        System.out.println(nuevoTrabajador.getDatosTelefono());
        System.out.println(nuevoTrabajador.getDatosSalario());



    }

    public static class Persona {
        int edad;
        String nombre;
        int telefono;

    }

     static class Cliente extends Persona {
        float credito;

        public void setDatos(int edad, String nombre, int telefono, float credito) {
            this.edad = edad;
            this.nombre = nombre;
            this.telefono = telefono;
            this.credito = credito;
        }

        public int getDatosEdad() {
            return this.edad;
        }
         public String getDatosNombre() {
             return this.nombre;
         }
         public int getDatosTelefono() {
             return this.telefono;
         }

         public float getDatosCredito() {
             return this.credito;
         }
    }
    static class Trabajador extends Persona {
        float salario;

        public void setDatos(int edad, String nombre, int telefono, float salario) {
            this.edad = edad;
            this.nombre = nombre;
            this.telefono = telefono;
            this.salario = salario;
        }

        public int getDatosEdad() {
            return this.edad;
        }
        public String getDatosNombre() {
            return this.nombre;
        }
        public int getDatosTelefono() {
            return this.telefono;
        }

        public float getDatosSalario() {
            return this.salario;
        }
    }
}
