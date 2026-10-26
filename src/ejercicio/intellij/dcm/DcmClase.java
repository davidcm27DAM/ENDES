package ejercicio.intellij.dcm;

public class DcmClase {

    public static void main(String[] args) {
        // TODO: Investigar por que el atajo "maina" no otorga el acceso "public"
        String ide = "IntelliJ";
        // por convención la variable en minúscula
        System.out.println("Hola. " + ide);
        // TODO: Agregar más funcionalidades

        // Usamos 'var', una característica introducida en Java 10
        var mensaje = "¡Hola a todos!";
        var numero = 42;

        System.out.println(mensaje);
        System.out.println("El número es: " + numero);

    }
}
