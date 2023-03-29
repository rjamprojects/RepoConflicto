package org.japo.java.libraries;

public final class UtilesFecha {

    private UtilesFecha() {
    }

    public static final int calcularDiasMes(int mes, int any) {
        // Dias Calculados
        int dias;

        // Discriminación
        if (mes == 1 || mes == 3 || mes == 5
                || mes == 7 || mes == 8 || mes == 10
                || mes == 12) {
            dias = 31;
        } else if (mes == 4 || mes == 6
                || mes == 9 || mes == 11) {
            dias = 30;
        } else if (mes == 2
                && (any % 400 == 0
                || any % 100 != 0 && any % 4 == 0)) {
            dias = 29;
        } else if (mes == 2) {
            dias = 28;
        } else {
            dias = 0;
        }

        // Retorno
        return dias;
    }

}
