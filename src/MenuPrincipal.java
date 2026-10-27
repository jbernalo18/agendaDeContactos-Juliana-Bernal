import java.util.*;
public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        int respuesta = 0;
        Agenda agenda1 = new Agenda();
        while (respuesta != 10) {
          System.out.println("=== AGENDA DE CONTACTOS ===\n" +
                  "1. Agregar contacto\n" +
                  "2. Buscar contacto\n" +
                  "3. Eliminar contacto\n" +
                  "4. Listar contactos (orden alfabetico)\n" +
                  "5. Listar historial (orden de insercion)\n" +
                  "6. Agregar grupo\n" +
                  "7. Agregar contacto a grupo\n" +
                  "8. Listar grupos\n" +
                  "9. Mostrar contactos por grupo\n" +
                  "10. Salir\n" +
                  "==========================\n" +
                  "Elige una opcion:");
          respuesta=entradaUsuario.nextInt();

          switch (respuesta){
              case 1:
                  break;

              case 2:
                  break;

              case 3:
                  break;

              case 4:
                  break;

              case 5:
                  break;

              case 6:
                  break;

              case 7:
                  break;

              case 8:
                  break;

              case 9:
                  break;

              case 10:
                  break;

              default:
                  System.out.println("Opcion invalida, intenta de nuevo.");

          }
      }

      entradaUsuario.close();
    }


}
