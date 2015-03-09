/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 * @author bertoa
 * @YrenEIvan
 */
public class GitAux {
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
		System.out.println("modificado por alumno 1"); // alumno 1
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
	System.out.println("modificado por alumno 2"); // alumno 2
    }
    
    public void metodoComunitario(){
	//comentario incluido para pruebas
        System.out.println("Aqui escribimos todos");

	// modificado metodocomunitario por alumno2
	// modificaciones alumno 1

	System.out.println("Alumno 1 y 2 inserta esta sentencia");

    }
	
	public void testGitAux(){
		// metodo rama developer
		System.out.println("Metodo de developer");
	}

 }

