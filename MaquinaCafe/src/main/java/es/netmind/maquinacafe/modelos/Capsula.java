package es.netmind.maquinacafe.modelos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class Capsula {
    private int identificador;
    private String marca;
    private String tipoCafe;
    private Empleado empleado;
    private double precio;
    private boolean estado; // consumido o no

    public Capsula() {
    }

    public Capsula(int identificador, String marca, String tipoCafe, Empleado empleado) {
        this.identificador = identificador;
        this.marca = marca;
        this.calcularPrecio();
        this.tipoCafe = tipoCafe;
        setEmpleado(empleado);
    }

    public void asociarMarca(String unaMarca) {
        this.marca = unaMarca;
        this.calcularPrecio();
    }

    private double auxCalcPrecio(String procedencia){
        // proceso de calculo complejo, como aceder a otra API, BBDD, usar fractales...
        if(procedencia.equals("América")) return 1.5;
        else return 2;
    }

    private  double auxCalcPrecio2(){
        //
        return 0;
    }

    public double calcularPrecio() {
        if (this.marca == "Nescafé") this.precio = 3;
        else this.precio = this.auxCalcPrecio("Asia");

        return  this.precio;
    }

    boolean consumir(){
        this.estado=true;
        return this.estado;
    }

    boolean consumir(int flag){
        // hacer algo con el flag
        this.estado=true;
        return this.estado;
    }


    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setTipoCafe(String tipoCafe) {
        this.tipoCafe = tipoCafe;
    }

    public void setEmpleado(Empleado empleado) {
        boolean valido = empleado.validar();
        System.out.println("El empleado es valido: "+valido);
        if(valido) this.empleado = empleado;
    }

}
