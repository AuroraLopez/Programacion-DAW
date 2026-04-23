package Actividades.Actividad8.controlador;

import Actividades.Actividad8.modelo.AsignaturaDAO;
import Actividades.Actividad8.vista.AsignaturaView;

public class AsignaturaController {
    private AsignaturaDAO asignaturadao;
    private AsignaturaView asignaturaview;

    public AsignaturaController(){
        asignaturadao = new AsignaturaDAO();
        asignaturaview = new AsignaturaView();
    }

    public void iniciar() {
        int opcion;
        try{
            do {
                opcion = asignaturaview.mostrarMenu();
                switch (opcion) {
                    case 1: asignaturadao.insertar(asignaturaview.pedirNuevaAsignatura());
                        asignaturaview.mostrarMensaje("Añadiendo asignatura..."); break;
                    case 2: asignaturaview.mostrarAlumnos(asignaturadao.listar());
                        asignaturaview.mostrarMensaje("Listando asignaturas...");
                    case 0: asignaturaview.mostrarMensaje("Saliendo..."); break;
                    default: asignaturaview.mostrarMensaje("Opción incorrecta"); break;
                }
            } while (opcion != 0);
        }catch(Exception e){
            System.err.println(e.getStackTrace());
        }
    }
}
