package Actividades.Actividad8.controlador;

import Actividades.Actividad8.modelo.AlumnoDAO;
import Actividades.Actividad8.modelo.AsignaturaDAO;
import Actividades.Actividad8.modelo.Curso_EscolarDAO;
import Actividades.Actividad8.modelo.MatriculaDAO;
import Actividades.Actividad8.modelo.ProfesorDAO;
import Actividades.Actividad8.vista.MatriculaView;

public class MatriculaController {
    private AlumnoDAO alumnodao;
    private AsignaturaDAO asignaturadao;
    private Curso_EscolarDAO cursoescolar;
    private ProfesorDAO profesordao;
    private MatriculaDAO matriculadao;
    private MatriculaView matriculaview;

    public MatriculaController(){
        alumnodao = new AlumnoDAO();
        asignaturadao = new AsignaturaDAO();
        cursoescolar = new Curso_EscolarDAO();
        profesordao = new ProfesorDAO();
        matriculadao = new MatriculaDAO();
        matriculaview = new MatriculaView();
    }

    public void iniciar() {
        int opcion;
        try{
            do {
                opcion = matriculaview.mostrarMenu();
                switch (opcion) {
                    case 1: matriculaview.mostrarProfesor(profesordao.listar());
                        matriculaview.mostrarMensaje("Listando el contenido de Profesor..."); break;
                    case 2: profesordao.insertar(matriculaview.pedirNuevoProfesor());
                        matriculaview.mostrarMensaje("Añadiendo profesor..."); break;
                    case 3: profesordao.actualizar(matriculaview.pedirProfesorActualizar());
                        matriculaview.mostrarMensaje("Actualizando profesor..."); break; 
                    case 4: profesordao.eliminar(matriculaview.pedirIdEliminar());
                        matriculaview.mostrarMensaje("Borrando profesor..."); break;
                    case 5: asignaturadao.insertar(matriculaview.pedirNuevaAsignatura());
                        matriculaview.mostrarMensaje("Añadiendo asignatura..."); break; 
                    case 6: alumnodao.insertar(matriculaview.pedirNuevoAlumno());
                        matriculaview.mostrarMensaje("Añadiendo alumno..."); break;
                    case 7: alumnodao.insertar(matriculaview.pedirNuevoAlumno());
                        matriculaview.mostrarMensaje("Añadiendo alumno..."); break;
                    case 0: matriculaview.mostrarMensaje("Saliendo..."); break;
                    default: matriculaview.mostrarMensaje("Opción incorrecta"); break;
                }
            } while (opcion != 0);
        }catch(Exception e){
            System.err.println(e.getStackTrace());
        }
    }
}
