package org.example;


import org.eamsoft.orm.manager.CotizanteEntityManager;
import org.eamsoft.orm.modelo.Cotizante;

import java.util.List;
import java.util.Optional;

public class App
{
    public static void main( String[] args )
    {
        CotizanteEntityManager cotizanteManager = new CotizanteEntityManager();

        // Cargar y mostrar todos los cotizantes
        List<Cotizante> cotizantes = cotizanteManager.findAll();
        mostrarCotizantesEnTabla(cotizantes);
    }
    
    private static void mostrarCotizantesEnTabla(List<Cotizante> cotizantes) {
        // Encabezados de la tabla
        String formatoTabla = "| %-15s | %-10s | %-5s | %-15s |%n";

        // Línea superior de la tabla
        System.out.format("+-----------------+------------+-------+-----------------+%n");
        System.out.format("| Nombre          | Documento  | Edad  | SemanasCotizadas |%n");
        System.out.format("+-----------------+------------+-------+-----------------+%n");

        // Filas de la tabla con los datos de cada cotizante
        for (Cotizante cotizante : cotizantes) {
            System.out.format(formatoTabla,
                    cotizante.getNombre(),
                    cotizante.getDocumento(),
                    cotizante.getEdad(),
                    cotizante.getSemanasCotizadas());
        }

        // Línea inferior de la tabla
        System.out.format("+-----------------+------------+-------+-----------------+%n");
    }
}
