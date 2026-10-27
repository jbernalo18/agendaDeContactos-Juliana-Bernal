public class Contacto {
    //atributos
    private String nombre;
    private String telefono;
    private String email;

    //constructor

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //sobreescuibimos el metodo ToString()
    @Override
    public String toString(){
        return "Nombre: " +nombre+ " | Teléfono: " +telefono+ " | Email: "+email;


    }



}
