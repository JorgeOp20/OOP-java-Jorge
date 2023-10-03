package es.netmind.maquinacafe.modelos.tazacafe;

public class Corto extends TazaCafe {

    private int cantidadLeche;

    public Corto(int id, double volumen, String fabricante, boolean lista, int cantidadLeche) {
        super(id, volumen, fabricante, lista);
        this.cantidadLeche = cantidadLeche;
    }

    @Override
    public boolean prepararTaza() {

        System.out.println("Preparando taza café- con cantidad de leche: " + this.cantidadLeche + " para el volumen: " + super.volumen);
        return true;
    }

    public boolean prepararTaza(int cantidadLeche) {
        this.cantidadLeche = cantidadLeche;
        return this.prepararTaza();
    }

    public int getCantidadLeche() {
        return cantidadLeche;
    }

    public void setCantidadLeche(int cantidadLeche) {
        this.cantidadLeche = cantidadLeche;
    }

    @Override
    public String toString() {
        return "Corto{" +
                "cantidadLeche=" + cantidadLeche +
                "} " + super.toString();
    }
}
