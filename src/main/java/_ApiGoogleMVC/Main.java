package _ApiGoogleMVC;
import controller.ScholarController;
import model.ScholarModel;
import view.ScholarView;
import java.util.Scanner;
public class Main {

	    public static void main(String[] args) {
	    	Scanner consulta = new Scanner(System.in);
	        // Crear instancias del modelo, la vista y el controlador
	        ScholarModel modelo = new ScholarModel();
	        ScholarView vista = new ScholarView();
	        ScholarController controlador = new ScholarController(modelo, vista);

	        // Realizar una consulta de ejemplo
	        System.out.println("Escribe lo que estas buscando");
	        String nombreAutor = consulta.next() ;
	        controlador.buscarAutor(nombreAutor);
	   consulta.close();
	    }
	}

