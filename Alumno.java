import java.util.Scanner;

/**
 *
 * @author aunai
 */

public class Alumno extends Persona{
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private String apellido;
    private int telefono;
    private String DNI;
    private int curso;
    private double nota;

    public Alumno(){
        super();
        this.curso=0;
        this.nota=0;
    }
    public Alumno(String nom, String ape, int tel, String D, int cur, double not){
        super(nom,ape,tel,D);
        this.curso=cur;
        this.nota=not;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    public void Alta(){
        System.out.println("Ponga el nombre del alumno: ");
        nombre=sc.nextLine();
        System.out.println("Ponga el apellido del alumno: ");
        apellido=sc.nextLine();
        System.out.println("Ponga el telefono del alumno: ");
        telefono=sc.nextInt();
        sc.nextLine();
        System.out.println("Ponga el DNI del alumno: ");
        DNI=sc.nextLine();
        System.out.println("Ponga el curso del alumno: ");
        curso=sc.nextInt();
        System.out.println("Ponga la nota del alumno: ");
        nota=sc.nextDouble();
    }

    public String Mostrar() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                ", DNI='" + DNI + '\'' +
                ", curso=" + curso +
                ", nota=" + nota +
                '}';
    }
}
