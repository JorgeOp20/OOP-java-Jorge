package es.netmind.maquinacafe.modelos;

public class Empleado {
    private String nombre;
    private int ID;
    private String email;
    private String puesto;

    public Empleado(String nombre, int ID, String email, String puesto) {
        this.nombre = nombre;
        this.ID = ID;
        this.email = email;
        this.puesto = puesto;
    }

    public boolean validar() {
        boolean valido = false;

        if (nombre == null) return valido;
        else if (nombre.length() < 4) return valido;
        else if (email == null) return valido;
        else if (email.indexOf("@") < 0) return valido;
        else valido = true;

        return valido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "es.netmind.maquinacafe.modelos.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", ID=" + ID +
                ", email='" + email + '\'' +
                ", puesto='" + puesto + '\'' +
                '}';
    }
}
