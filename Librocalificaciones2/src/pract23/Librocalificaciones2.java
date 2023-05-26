
package pract23;
import java.util.Scanner;

public class Librocalificaciones2 {
 
    private String nombreDelcurso;
  public   Librocalificaciones2(String nombreDelcurso){
      this.nombreDelcurso = nombreDelcurso;    
    }
  public void establecerNombredelCurso(String nombreDelcurso){
      this.nombreDelcurso=nombreDelcurso;     
  }
  public String obtenerNombreDelCurso(){
      return nombreDelcurso;
  }
  public void mostrarMensaje(){
      System.out.println("Bienvenido a " + obtenerNombreDelCurso()+",primero introduce la cantidad de calificaciones");
  }
  public void determinarPromedioclase(){
    Scanner cal=new Scanner (System.in);
    double Promedio;
    int contador = 0;
    int total = 0;
   
    while(contador<=10){
    System.out.print("Cual es la caificacion #"+contador+": ");
    int calif=cal.nextInt();
    total=total+calif;
    contador=contador+1;
    }
    if (contador!=0)
    {
      Promedio=total/contador;
      System.out.println("Tu promedio es"+Promedio);
      }
    else {
        System.out.println("No se introdujo nada");
    }
  }
}
