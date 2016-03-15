/**
 *
 * @author Alejo Garcia Galan
 */

public class Lib {

    public void metodoAlumno1(){
        metodoAlumno2();
	System.out.println("modificado por alumno 1"); // alumno 1
    }

    public void metodoAlumno2(){
        metodo3();
	System.out.println("modificado por alumno 2"); // alumno 2
    }

    public void metodo3(){
	System.out.println("metodo 3");
    }

    public void metodoComunitario(){
        System.out.println("cambio en master y en metodo3");

	// modificaciones alumno 1
	System.out.println("Alumno 1 inserta esta sentencia");

	// modificaciones alumno 2
	System.out.println("Alumno 2 inserta esta sentencia")
    }
}
