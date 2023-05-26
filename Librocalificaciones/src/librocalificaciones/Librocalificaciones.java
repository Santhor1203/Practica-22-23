package Librocalificaciones;
import java.util.Scanner;

public class Librocalificaciones {
 
    private String nombreDelcurso;
  public   Librocalificaciones(String nombreDelcurso){
      this.nombreDelcurso = nombreDelcurso;    
    }
  public void establecerNombredelCurso(String nombreDelcurso){
      this.nombreDelcurso=nombreDelcurso;     
  }
  public String obtenerNombreDelCurso(){
      return nombreDelcurso;
  }
  public void mostrarMensaje(){
      System.out.println("Bienvenido a " + obtenerNombreDelCurso()+", introduce tus diez calificaciones");
  }
  public void determinarPromedioclase(){
    Scanner cal=new Scanner (System.in);
    double Promedio;
    int contador = 1;
    int total = 0;
   
    while(contador<=10){
    System.out.print("Cual es la caificacion #"+contador+": ");
    int calif=cal.nextInt();
    total=total+calif;
    contador=contador+1;
    }
    Promedio=total/10;
    System.out.print("Tu promedio es"+Promedio);
  }
}
