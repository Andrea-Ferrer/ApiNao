package controller;

import model.ScholarModel;
import view.ScholarView;

public class ScholarController {
    private ScholarModel modelo;
    private ScholarView vista;

    public ScholarController(ScholarModel modelo, ScholarView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void buscarAutor(String nombreAutor) {
        String resultado = modelo.consultarAutor(nombreAutor);
        vista.mostrarResultado(resultado);
    }
}
