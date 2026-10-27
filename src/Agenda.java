import java.util.*;

public class Agenda {
    //estructiras de datos
    Map<String, Contacto> mapaContactos = new TreeMap<>();
    Set<String> setGrupos= new TreeSet<>();
    Map<String,Set<String>> mapaGrupos= new TreeMap<>();
    List<Contacto> listaContactos= new ArrayList<>();


    //metodos
    public void agregarContacto(Contacto c){
        if(mapaContactos.containsKey(c.getNombre())){
            System.out.println("Error: Ya existe un contacto con el nombre: "+c.getNombre());
            return;
        }else {
            mapaContactos.put(c.getNombre(),c);
            listaContactos.add(c);
            System.out.println("Contacto agregado: "+c.getNombre());
        }
    }

    public Contacto buscarContacto(String nombre){
        if(!mapaContactos.containsKey(nombre)){
            System.out.println("Error: No existe un contacto con este nombre: "+nombre);
            return null;
        }else {
            return mapaContactos.get(nombre);
        }
    }

    public boolean eliminarContacto(String nombre){
        if(!mapaContactos.containsKey(nombre)){
            System.out.println("Error: No existe un contacto con este nombre: "+nombre);
            return false;
        }
            Contacto contactoBorrar =mapaContactos.get(nombre);
            listaContactos.remove(contactoBorrar);
            mapaContactos.remove(nombre);

            for (Set<String> grupo:mapaGrupos.values()) {
                grupo.remove(nombre);

             }
            System.out.println("Contacto eliminado: "+nombre);
            return true;
    }

    public void listarContactos(){
    for (Contacto contacto :mapaContactos.values()){
        System.out.println(contacto);
     }
    }

    public void listarHistorial(){
        for (Contacto contacto :listaContactos){
            System.out.println(contacto);
        }
    }

    public void agregarGrupo(String nombreGrupo){
        if(setGrupos.contains(nombreGrupo)){
            System.out.println("Error: El grupo "+nombreGrupo+" ya existe");
            return;
        }else{
            setGrupos.add(nombreGrupo);
            mapaGrupos.put(nombreGrupo, new TreeSet<>());
            System.out.println("Grupo "+nombreGrupo+" creado");
        }
    }

    public void agregarContactoAGrupo(String nombreContacto, String nombreGrupo){
        if(!mapaContactos.containsKey(nombreContacto)){
            System.out.println("Error: El contacto " +nombreContacto+ " no existe");
            return;
        }
        if (!mapaGrupos.containsKey(nombreGrupo)){
            System.out.println("Error: El grupo " +nombreGrupo+ " no existe");
            return;
        }
            mapaGrupos.get(nombreGrupo).add(nombreContacto);
        System.out.println("Contacto agregado al grupo: "+nombreGrupo);
    }


    public void listarGrupos(){
        for (String grupo:setGrupos){
            System.out.println(grupo);
        }
    }

    public void mostrarContactosPorGrupo(String nombreGrupo){
        if(!mapaGrupos.containsKey(nombreGrupo)){
            System.out.println("Error: El nombre de grupo " +nombreGrupo+ " no existe");
            return;
        }
        Set<String> nombresContactos = mapaGrupos.get(nombreGrupo);
        if(nombresContactos.isEmpty()){
            System.out.println("El grupo " + nombreGrupo + " no tiene contactos");
            return;
        }
        System.out.println("Contactos en el grupo: " + nombreGrupo);
        for (String nombre : nombresContactos) {
            System.out.println("- "+mapaContactos.get(nombre));
        }
    }




}


