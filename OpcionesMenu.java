import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OpcionesMenu {

    public static final String OPCION1 = "-afd";
    public static final String OPCION2 = "-afn";
    public static final String OPCION3 = "-check";
    public static final String OPCION4 = "-min";

    public static String mostrarAyuda(){
        return "OpcionesMenu.sh "+OPCION1+"|"+OPCION2+"|"+OPCION3+"|"+OPCION4;
    }

    public static void crearArchivo(String nombrearchivo , String texto){
        Path path = Paths.get(nombrearchivo);

        try {
            Files.write(path, texto.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
           System.err.println("Error al escribir el archivo: "+nombrearchivo+" "+e.getMessage());
        }
    }

    public static void main(String[] args) {

        if (args != null && args.length == 1) {

            String opcionSeleccionada = args[0];

            if (opcionSeleccionada.equals(OPCION1)) {

                System.out.println("Ejecutando " + OPCION1);

            } else if (opcionSeleccionada.equals(OPCION2)) {

                System.out.println("Ejecutando " + OPCION2);

                crearArchivo("C:/Work/LiliBashSample/miArchivo.txt", "Ejemplo de Archivo de texto para este programa!");


            } else if (opcionSeleccionada.equals(OPCION3)) {

                System.out.println("Ejecutando " + OPCION3);

            } else if (opcionSeleccionada.equals(OPCION4)) {

                System.out.println("Ejecutando " + OPCION4);

            } else {
                System.out.println("Opcion Invalida:");
                System.out.println(mostrarAyuda());
            }

        } else {
            System.out.println(mostrarAyuda());
        }

    }

}