public class DcmMain {

    public static void main(String[] args) {

        if (args.length == 0 || args[0].isBlank()) {

            System.out.println("Uso: java -jar alumno.jar \"Nombre Apellidos\"");

            return;

        }

        String alumno = String.join(" ", args);

        System.out.println("Hola " + alumno + " !!!!");

    }
}
