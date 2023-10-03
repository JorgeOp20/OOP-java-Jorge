package es.netmind.maquinacafe;

import es.netmind.maquinacafe.modelos.tazacafe.Corto;
import es.netmind.maquinacafe.modelos.tazacafe.Largo;
import es.netmind.maquinacafe.modelos.tazacafe.TazaCafe;

public class Main {

    public static void main(String[] args) {
        System.out.println("MAQUINA CAFÉ");

        System.out.println("TAZA CAFE");

        System.out.println("TAZAS CAFES: lista");

        TazaCafe[] tazas = {
                new TazaCafe(1, 100, "Cafes Unidos", false),
                new Corto(2, 50, "CU", false, 20),
                new Largo(3, 150, "CU", false, 40)
        };

        for (int i = 0; i < tazas.length; i++) {
            System.out.println(tazas[i]);
            // si tazas[i] es de tipo Corto
            // entonces usar prepararTaza(20)
            // si no, usar prepararTaza()
            tazas[i].prepararTaza();
            tazas[i].servirTaza();
        }

    }

}