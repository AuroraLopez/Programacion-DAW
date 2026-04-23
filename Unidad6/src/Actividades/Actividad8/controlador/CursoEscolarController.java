package Actividades.Actividad8.controlador;

import Actividades.Actividad8.modelo.Curso_EscolarDAO;
import Actividades.Actividad8.vista.CursoEscolarView;

public class CursoEscolarController {
    private Curso_EscolarDAO cursoescolardao;
    private CursoEscolarView cursoview;

    public CursoEscolarController(){
        cursoescolardao = new Curso_EscolarDAO();
        cursoview = new CursoEscolarView();
    }

    public void iniciar() {
        int opcion;
        try{
            do {
                opcion = cursoview.mostrarMenu();
                switch (opcion) {
                    case 1: cursoescolardao.insertar(cursoview.pedirNuevoCurso());
                        cursoview.mostrarMensaje("Añadiendo alumno..."); break;
                    case 2: cursoview.mostrarCursos(cursoescolardao.listar());
                        cursoview.mostrarMensaje("Listando alumnos...");
                    case 0: cursoview.mostrarMensaje("Saliendo..."); break;
                    default: cursoview.mostrarMensaje("Opción incorrecta"); break;
                }
            } while (opcion != 0);
        }catch(Exception e){
            System.err.println(e.getStackTrace());
        }
    }
}
