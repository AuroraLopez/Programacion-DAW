package Actividades.Actividad8.controlador;

import Actividades.Actividad8.modelo.AlumnoDAO;
import Actividades.Actividad8.vista.AlumnoView;

public class AlumnoController {
    private AlumnoDAO alumnodao;
    private AlumnoView alumnoview;

    public AlumnoController(){
        alumnodao = new AlumnoDAO();
        alumnoview = new AlumnoView();
    }

    public void iniciar() {
        int opcion;
        try{
            do {
                opcion = alumnoview.mostrarMenu();
                switch (opcion) {
                    case 1: alumnodao.insertar(alumnoview.pedirNuevoAlumno());
                        alumnoview.mostrarMensaje("Añadiendo alumno..."); break;
                    case 2: alumnoview.mostrarAlumnos(alumnodao.listar());
                        alumnoview.mostrarMensaje("Listando alumnos...");
                    case 0: alumnoview.mostrarMensaje("Saliendo..."); break;
                    default: alumnoview.mostrarMensaje("Opción incorrecta"); break;
                }
            } while (opcion != 0);
        }catch(Exception e){
            System.err.println(e.getStackTrace());
        }
    }
}
