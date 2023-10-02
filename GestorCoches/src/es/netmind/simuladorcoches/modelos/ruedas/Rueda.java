package es.netmind.simuladorcoches.modelos.ruedas;

public class Rueda {

    private Long diametro;

    public Rueda(Long diametro) {
        this.diametro = diametro;
    }


    public Long getDiametro() {
        return diametro;
    }

    public void setDiametro(Long diametro) {
        this.diametro = diametro;
    }
}
