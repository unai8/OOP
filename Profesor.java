import java.util.Scanner;

public class Profesor extends Persona{
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private String apellido;
    private int telefono;
    private String DNI;
    private boolean esTutor;
    private int cantidadAsignaturas;

    public Profesor(){
        super();
        this.esTutor=false;
        this.cantidadAsignaturas=0;
    }

    public Profesor(String nom, String ape, int tel, String D){
        super(nom,ape,tel,D);
        this.esTutor=false;
        this.cantidadAsignaturas=0;
    }

    public Profesor(String nom, String ape, int tel, String D, boolean esTu, int cantAsig){
        super(nom,ape,tel,D);
        this.esTutor=esTu;
        this.cantidadAsignaturas=cantAsig;
    }

    public boolean isEsTutor() {
        return esTutor;
    }

    public void setEsTutor(boolean esTutor) {
        this.esTutor = esTutor;
    }

    public int getCantidadAsignaturas() {
        return cantidadAsignaturas;
    }

    public void setCantidadAsignaturas(int cantidadAsignaturas) {
        this.cantidadAsignaturas = cantidadAsignaturas;
    }
    public void Alta(){
        System.out.println("Ponga el nombre del pofesor: ");
        nombre=sc.nextLine();
        System.out.println("Ponga el apellido del pofesor: ");
        apellido=sc.nextLine();
        System.out.println("Ponga el telefono del pofesor: ");
        telefono=sc.nextInt();
        sc.nextLine();
        System.out.println("Ponga el DNI del pofesor: ");
        DNI=sc.nextLine();
        do {
            System.out.println("El profesor es tutor (true o false): ");
            esTutor = sc.nextBoolean();
        }while(esTutor!=true && esTutor!=false);
        System.out.println("Cantidad de asignaturas que enseña: ");
        cantidadAsignaturas=sc.nextInt();
    }


    public String Mostrar() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                ", DNI='" + DNI + '\'' +
                ", esTutor=" + esTutor +
                ", cantidadAsignaturas=" + cantidadAsignaturas +
                '}';
    }
}
