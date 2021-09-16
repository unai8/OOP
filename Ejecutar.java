import java.util.Scanner;
import java.util.ArrayList;
public class Ejecutar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList();
        ArrayList<Profesor> profesores = new ArrayList();


        int elegir;


        int cantPrimeroSegundo;
        double porcentajeAprobados;
        String TutorMasAsignaturas;
        char repetir='N';

        do{
            System.out.println("\n 1.- Crear un alumno \n 2.- Crear un profesor \n 3.- Calcular cantidad de alumnos matriculados en primero y segundo \n 4.- Ver porcentaje de alumnos aprobados \n 5.- Obtener el profesor con más asignaturas y que ademas sea tutor");
            elegir=sc.nextInt();
            switch(elegir){

                case 1:
                    crear_alumno(alumnos);
                    System.out.println();
                    System.out.println("ALUMNO CREADO");
                    break;
                case 2:
                    crear_profesor(profesores);
                    System.out.println();
                    System.out.println("PROFESOR CREADO");
                    break;
                case 3:

                    cantPrimeroSegundo=CalculaPrimerSegundoCurso(alumnos);
                    System.out.println("Hay "+cantPrimeroSegundo+" de alumnos matriculados en primero y segundo");
                    break;
                case 4:
                    porcentajeAprobados=PorcentajeAprobadosPrimeroySegundo(alumnos);
                    System.out.println("Hay un porcentaje de "+porcentajeAprobados+"/100 alumnos aprobados");
                    break;
                case 5:
                    TutorMasAsignaturas=MasAsignaturasYTutor(profesores);
                    System.out.println("El profesor que mas asignaturas tiene es "+TutorMasAsignaturas);
                    break;
                default:


            }
            System.out.println("¿Mostrar lista de nuevo? (S=si y N=no)");
            repetir=sc.next().charAt(0);
        }while(repetir=='S' || repetir=='s');

    }


    public static void crear_alumno(ArrayList <Alumno> alumnos){
        Alumno alumno =new Alumno();
        alumno.Alta();
        alumnos.add(alumno);
    }

    public static void crear_profesor(ArrayList <Profesor> profesores){
        Profesor profesor =new Profesor();
        profesor.Alta();
        profesores.add(profesor);
    }

    public static int CalculaPrimerSegundoCurso(ArrayList <Alumno> alumnos){
        int cantcurso=0;
        for(int i=0;i<alumnos.size();i++){
            if(alumnos.get(i).getCurso()==1 || alumnos.get(i).getCurso()==2){
                cantcurso=cantcurso+1;
            }
        }
        return cantcurso;
    }

    public static double PorcentajeAprobadosPrimeroySegundo(ArrayList <Alumno> alumnos){
        double suma=0;
        double porcentaje;
        for(int i=0;i<alumnos.size();i++){
            if(alumnos.get(i).getNota()>=5 && alumnos.get(i).getCurso()==1 || alumnos.get(i).getCurso()==2){
                suma=suma+1;
            }
        }
        porcentaje= (suma*100)/(alumnos.size());
        return porcentaje;
    }


    public static String MasAsignaturasYTutor(ArrayList <Profesor> profesores){
        int cantidad=0;
        String nombre="Desconocido";
        for(int i=0;i<profesores.size();i++){
            if(profesores.get(i).isEsTutor()==true){
                if(profesores.get(i).getCantidadAsignaturas()>cantidad){
                    cantidad=profesores.get(i).getCantidadAsignaturas();
                }
            }
        }

        for(int i=0;i<profesores.size();i++){
            if(profesores.get(i).getCantidadAsignaturas()==cantidad){
                nombre=profesores.get(i).getNombre()+" "+profesores.get(i).getApellido();
            }
        }
        return nombre;
    }
}