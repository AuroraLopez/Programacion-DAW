package Actividades.Tarea.controlador;

import Actividades.Tarea.modelo.AlumnoDAO;
import Actividades.Tarea.modelo.Diseña_PracticaDAO;
import Actividades.Tarea.modelo.Examen_TeoricoDAO;
import Actividades.Tarea.modelo.Hace_ExamenDAO;
import Actividades.Tarea.modelo.PracticaDAO;
import Actividades.Tarea.modelo.ProfesorDAO;
import Actividades.Tarea.modelo.Realiza_PracticaDAO;
import Actividades.Tarea.vista.EvaluacionView;

public class EvaluacionController {
    private AlumnoDAO alumnodao;
    private PracticaDAO practicadao;
    private Examen_TeoricoDAO examenteoricodao;
    private ProfesorDAO profesordao;
    private Hace_ExamenDAO haceexamendao;
    private Realiza_PracticaDAO realizapracticadao;
    private Diseña_PracticaDAO diseñapracticadao;
    private EvaluacionView evaluacionview;

    public EvaluacionController(){
        alumnodao = new AlumnoDAO();
        practicadao = new PracticaDAO();
        examenteoricodao = new Examen_TeoricoDAO();
        profesordao = new ProfesorDAO();
        haceexamendao = new Hace_ExamenDAO();
        realizapracticadao = new Realiza_PracticaDAO();
        diseñapracticadao = new Diseña_PracticaDAO();
        evaluacionview = new EvaluacionView();
    }

    public void iniciar() {
        int opcion;
        try{
            do {
                opcion = evaluacionview.mostrarMenu();
                switch (opcion) {
                    case 1: evaluacionview.mostrarProfesor(profesordao.listar());
                        evaluacionview.mostrarMensaje("Listando el contenido de Profesor..."); break;
                    case 2: profesordao.insertar(evaluacionview.pedirNuevoProfesor());
                        evaluacionview.mostrarMensaje("Añadiendo profesor..."); break;
                    case 3: profesordao.actualizar(evaluacionview.pedirProfesorActualizar());
                        evaluacionview.mostrarMensaje("Actualizando profesor..."); break; 
                    case 4: profesordao.eliminar(evaluacionview.pedirIdEliminar());
                        evaluacionview.mostrarMensaje("Borrando profesor..."); break;
                    case 5: practicadao.insertar(evaluacionview.pedirNuevaPractica());
                        evaluacionview.mostrarMensaje("Añadiendo practica..."); break; 
                    case 6: alumnodao.insertar(evaluacionview.pedirNuevoAlumno());
                        evaluacionview.mostrarMensaje("Añadiendo alumno..."); break;
                    // case 7: alumnodao.insertar(evaluacionview.pedirNuevoAlumno());
                    //     evaluacionview.mostrarMensaje("Añadiendo alumno..."); break;
                    case 0: evaluacionview.mostrarMensaje("Saliendo..."); break;
                    default: evaluacionview.mostrarMensaje("Opción incorrecta"); break;
                }
            } while (opcion != 0);
        }catch(Exception e){
            System.err.println(e.getStackTrace());
        }
}
}
