package Actividades.Tarea.vista;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import Actividades.Tarea.modelo.Alumno;
import Actividades.Tarea.modelo.Diseña_Practica;
import Actividades.Tarea.modelo.Examen_Teorico;
import Actividades.Tarea.modelo.Hace_Examen;
import Actividades.Tarea.modelo.Practica;
import Actividades.Tarea.modelo.Profesor;
import Actividades.Tarea.modelo.Realiza_Practica;

public class EvaluacionView {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ EVALUACIÓN ---");
        System.out.println("-- OPCIONES CON PROFESOR --");
        System.out.println("------------------------------");
        System.out.println("1. Listar profesor");
        System.out.println("2. Insertar profesor");                 
        System.out.println("3. Actualizar profesor");
        System.out.println("4. Eliminar profesor");
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("-- OPCIONES CON PRACTICA --");
        System.out.println("------------------------------");
        System.out.println("5. Insertar Practica");
        System.out.println("6. Listar Prácticas");
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("-- OPCIONES CON ALUMNO --");
        System.out.println("------------------------------");
        System.out.println("7. Insertar Alumno");
        System.out.println("8. Listar alumnos");
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("-- OPCIONES CON EXAMEN --");
        System.out.println("------------------------------");
        System.out.println("9. Insertar Examen");
        System.out.println("10. Listar Exámenes");
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("-- OPCIONES CON REALIZA_PRACTICA --");
        System.out.println("------------------------------");;
        System.out.println("11. Insertar Realiza Practica");
        System.out.println("12. Listar Realiza Practicas");
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("-- OPCIONES CON HACE_EXAMEN --");
        System.out.println("------------------------------");
        System.out.println("13. Insertar Hace Examen");
        System.out.println("14. Listar Hace Examen");
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("-- OPCIONES CON DISEÑA_PRACTICA --");
        System.out.println("------------------------------");
        System.out.println("15. Insertar Diseña Practica");
        System.out.println("16. Listar Diseña Examen");
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarProfesor(List<Profesor> profesores) {
        System.out.println("\nLISTADO:");
        for (Profesor p : profesores) {
            System.out.println(p.getId() + " - " + p.getNif() + " - " + p.getNombre() + " - " +
                    p.getApellido1() + " - " + p.getApellido2()
                );
        }
    }

    public Profesor pedirNuevoProfesor() {
        sc.nextLine();
        System.out.print("ID: : ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("NIF: ");
        String nif=sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido 1: ");
        String apellido1 = sc.nextLine();
        System.out.print("Apellido 2: ");
        String apellido2 = sc.nextLine();
        return new Profesor(id, nif ,nombre, apellido1, apellido2);
    }

    public Profesor pedirProfesorActualizar() {
        System.out.print("ID a modificar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();
        return new Profesor(id, nombre);
    }

    public int pedirIdEliminar() {
        System.out.print("ID a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    public Practica pedirNuevaPractica() {
        System.out.print("Id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Dificultad: ");
        String dificultad = sc.nextLine();
        return new Practica(id, titulo, dificultad);
    }

    public void mostrarPractica(List<Practica> practicas) {
        System.out.println("\nLISTADO:");
        for (Practica p : practicas) {
            System.out.println(p.getId() + " - " + p.getTitulo() + " - " + p.getDificultad()
                );
        }
    }

    public Alumno pedirNuevoAlumno() {
        sc.nextLine();
        System.out.print("Id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("NIF: ");
        String nif = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido 1: ");
        String apellido1 = sc.nextLine();
        System.out.print("Apellido 2: ");
        String apellido2 = sc.nextLine();
        System.out.print("Grupo: ");
        String grupo = sc.nextLine();

        return new Alumno(id, nif, nombre, apellido1, apellido2, grupo);
    }
    public void mostrarAlumnos(List<Alumno> alumnos) {
        System.out.println("\nLISTADO:");
        for (Alumno a : alumnos) {
            System.out.println(a.getId() + " - " + a.getNif() + " - " + a.getNombre() + " - " +
                    a.getApellido1() + " - " + a.getApellido2() + " - " + a.getGrupo()
                );
        }
    }

    public Examen_Teorico pedirNuevoExamen() {
        System.out.print("Id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Numero de preguntas: ");
        int num_preguntas = sc.nextInt();
        sc.nextLine();
        System.out.print("Fecha: ");
        Date fecha = Date.valueOf(sc.nextLine());
        System.out.print("Id del profesor: ");
        int id_profesor = sc.nextInt();

        return new Examen_Teorico(id, titulo, num_preguntas, fecha, id_profesor);
    }

    public void mostrarExamenes(List<Examen_Teorico> examenes) {
        System.out.println("\nLISTADO:");
        for (Examen_Teorico et : examenes) {
            System.out.println(et.getId() + " - " + et.getTitulo() + " - " + et.getNum_preguntas() + " - " +
                    et.getId_profesor()
                );
        }
    }

    public Hace_Examen pedirNuevoHaceExamen() {
        System.out.print("Id del alumno: ");
        int id_alumno=sc.nextInt();
        sc.nextLine();
        System.out.print("Id del examen ");
        int id_practica=sc.nextInt();
        sc.nextLine();
        System.out.print("Nota: ");
        double nota = sc.nextDouble();

        return new Hace_Examen(id_alumno, id_practica, nota);
    }

    public void mostrarHaceExamen(List<Hace_Examen> hace_examenes) {
        System.out.println("\nLISTADO:");
        for (Hace_Examen he : hace_examenes) {
            System.out.println(he.getId_alumno() + " - " + he.getId_examen()
                        + " - " + he.getNota());
            }
        }

        public Realiza_Practica pedirNuevoRealizaPractica() {
        System.out.print("Id del alumno: ");
        int id_alumno=sc.nextInt();
        sc.nextLine();
        System.out.print("Id de la practica ");
        int id_practica=sc.nextInt();
        sc.nextLine();
        System.out.print("Fecha: ");
        Date fecha = Date.valueOf(sc.nextLine());
        System.out.print("Nota: ");
        double nota = sc.nextDouble();

        return new Realiza_Practica(id_alumno, id_practica, fecha, nota);
    }

    public void mostrarRealizaPracticas(List<Realiza_Practica> realiza_practicas) {
        System.out.println("\nLISTADO:");
        for (Realiza_Practica rp : realiza_practicas) {
            System.out.println(rp.getId_alumno() + " - " + rp.getId_practico()+ " - " + rp.getFecha()
                        + " - " + rp.getNota());
            }
        }

        public Diseña_Practica pedirNuevoDiseñaPractica() {
        System.out.print("Id del profesor: ");
        int id_alumno=sc.nextInt();
        sc.nextLine();
        System.out.print("Id de la practica ");
        int id_practica=sc.nextInt();
        sc.nextLine();
        System.out.print("Fecha: ");
        Date fecha = Date.valueOf(sc.nextLine());

        return new Diseña_Practica(id_alumno, id_practica, fecha);
    }

    public void mostrarDiseñaPracticas(List<Diseña_Practica> diseña_practicas) {
        System.out.println("\nLISTADO:");
        for (Diseña_Practica dp : diseña_practicas) {
            System.out.println(dp.getId_profesor() + " - " + dp.getId_practica()+ " - " + dp.getFecha());
            }
        }
    }
    
