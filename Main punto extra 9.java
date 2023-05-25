package org.example;

import org.example.controlador.ControladorLibro;
import org.example.modelo.Libro;
import org.example.pesistencia.ConexionSingleton;
import org.example.pesistencia.DemoLibroDB;
import org.example.pesistencia.LibrosDAO;
import org.example.vista.VentanaLibro;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        VentanaLibro ventanaLibro = new VentanaLibro("MVC Y JVC");
        ControladorLibro controler = new ControladorLibro(ventanaLibro);
    }
}