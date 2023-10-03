package es.netmind.maquinacafe.modelos.tazacafe;

public class Largo extends TazaCafe{

    private int porcentaje_agua;

    public Largo(int id, double volumen, String fabricante, boolean lista, int porcentaje_agua) {
        super(id, volumen, fabricante, lista);
        this.porcentaje_agua = porcentaje_agua;
    }

    @Override
    public boolean prepararTaza() {
        System.out.println("Preparando taza café- con % de agua: " + this.porcentaje_agua);
        return true;
    }

    @Override
    public String toString() {
        return "Largo{" +
                "porcentaje_agua=" + porcentaje_agua +
                "} " + super.toString();
    }
}
