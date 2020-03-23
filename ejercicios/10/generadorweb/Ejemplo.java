package generadorweb;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejemplo {
	  public static void main (String[]args) {
		  
			try {

				 String cad = "VISITA MI BLOG";
			       
				 FileWriter filewriter = null;
				 PrintWriter printw = null;
				       
				     filewriter = new FileWriter("ejemplo.html");//declarar el archivo
				     printw = new PrintWriter(filewriter);//declarar un impresor
				           
				     printw.println("<html>");
				     printw.println("<head><title>by Eduardo</title></head>");    
				     //si queremos escribir una comilla " en el
				     //archivo uzamos la diagonal invertida \"
				     printw.println("<body bgcolor=\"#99CC99\">");
				    
				     //si quisieramos escribir una cadena que vide de una lista o
				     //de una variable lo concatenamos
				     printw.println("<center><h1><font color=\"navy\">"+cad+"</font></h1></center>");
				     printw.println("<center><h4><font color=\"purple\">www.losiej.blogspot.com</font></h4></center>");
				    
				     //podemos añadir imagenes con codigo html
				     printw.println("<center><img src=\"img/www.losiej.blogspot.com.png\" width=\"200\" height=\"150\"></center>");
				    
				     printw.println("</body>");
				     printw.println("</html>");
				           
				     //no devemos olvidar cerrar el archivo para que su lectura sea correcta
				     printw.close();//cerramos el archivo
				           
				     System.out.println("Generado exitosamente");//si todo sale bien mostramos un mensaje de guardado exitoso

			} catch(FileNotFoundException f){
			  System.out.println("No se puede encontrar alguno de los ficheros");
					
			} catch (IOException ioe) {
			  System.out.println("Existen problemas de lectura y/o escritura en algún fichero");
			}
		  }
}
