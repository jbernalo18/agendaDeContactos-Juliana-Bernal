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
            if (entradaUsuario.hasNextInt()) {
                respuesta = entradaUsuario.nextInt();
                entradaUsuario.nextLine(); // consume el salto pendiente
            } else {
                entradaUsuario.nextLine(); //descarta lo que escribo
                System.out.println("Opcion invalida, intenta de nuevo.");
                continue; // salta el switch y vuelve a mostrar el menu
            }

            switch (respuesta){
                case 1:
                    System.out.println("Ingrese el nombre: ");
                    String nombre = entradaUsuario.nextLine();
                    System.out.println("Ingrese el telefono: ");
                    String telefono = entradaUsuario.nextLine();
                    System.out.println("Ingrese el email: ");
                    String email = entradaUsuario.nextLine();
                    Contacto contactoCreado = new Contacto(nombre,telefono,email);
                    agenda1.agregarContacto(contactoCreado);
                    break;

                case 2:
                    System.out.println("Ingrese el nombre: ");
                    String nombreCont = entradaUsuario.nextLine();
                    Contacto contactoBuscado = agenda1.buscarContacto(nombreCont);
                    if(contactoBuscado != null){
                        System.out.println(contactoBuscado);
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el contacto a eliminar: ");
                    String nombreContEliminar = entradaUsuario.nextLine();
                    agenda1.eliminarContacto(nombreContEliminar);
                    break;

                case 4:
                    agenda1.listarContactos();
                    break;

                case 5:
                    agenda1.listarHistorial();
                    break;

                case 6:
                    System.out.println("Ingrese el nombre del grupo: ");
                    String nombreGrupo = entradaUsuario.nextLine();
                    agenda1.agregarGrupo(nombreGrupo);
                    break;

                case 7:
                    System.out.println("Ingrese el nombre del contacto: ");
                    String nombreContGrupo = entradaUsuario.nextLine();
                    System.out.println("Ingrese el nombre del grupo: ");
                    String grupoDestino = entradaUsuario.nextLine();
                    agenda1.agregarContactoAGrupo(nombreContGrupo, grupoDestino);
                    break;

                case 8:
                    agenda1.listarGrupos();
                    break;

                case 9:
                    System.out.println("Ingrese el nombre del grupo: ");
                    String grupoMostrar = entradaUsuario.nextLine();
                    agenda1.mostrarContactosPorGrupo(grupoMostrar);
                    break;

                case 10:
                    System.out.println("Saliendo de la agenda...");
                    break;

                default:
                    System.out.println("Opcion invalida, intenta de nuevo.");

            }
        }

        entradaUsuario.close();
    }


}
