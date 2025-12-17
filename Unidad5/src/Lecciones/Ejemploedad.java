package Lecciones;

// Clase que usa la excepción
public class Ejemploedad {
    public void registrarUsuario(String nombre, int edad) throws EdadInvalidaException {
        if (edad < 18) {
            throw new EdadInvalidaException("La edad mínima para registrarse es 18.");
        }
        System.out.println("Usuario " + nombre + " registrado con éxito.");
    }

    // Definición de la excepción propia
    public class EdadInvalidaException extends Exception {
        public EdadInvalidaException(String mensaje) {
            super(mensaje);
        }
    }

    public static void main(String[] args) {
        Ejemploedad registro = new Ejemploedad();
        try {
            registro.registrarUsuario("Aurora", 22);
            registro.registrarUsuario("Ana", 16); // lanza excepción
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
