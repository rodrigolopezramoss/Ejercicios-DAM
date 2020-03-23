package generadorweb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class GeneradorWebCurriculum {
  public static void main (String[]args) {
	  /*Para que funcione correctamente
	   * cada campo debe situarse
	   * en lineas distintas
	   * (Hay subido un fichero como ejemplo)
	   */
	try {
      
	  String linea;
	
	  FileWriter filewriter = null;
	  PrintWriter printw = null;
	
	  BufferedReader br1 = new BufferedReader(new FileReader("cv.txt"));
	  BufferedReader br2 = new BufferedReader(new FileReader("cv.txt"));
	
	  filewriter = new FileWriter("curriculum.html");//declarar el archivo
	  printw = new PrintWriter(filewriter);//declarar el impresor
	    
	  linea = br1.readLine();
	  
	  //Aqui empieza el head
	  printw.println("<html>");
	  printw.println("<head><meta charset=\"UTF-8\"><title>" + (linea +"\n") +"</title></head>"); 
	  //Aqui acaba el head
	  
	  //Aqui empieza el body
	  printw.println("<body>");
	  linea = br2.readLine();
	  printw.println("<center><h1><font color=\"navy\">"+ linea +"</font></h1></center>");
	  printw.println("<center><p>");
	    
	  //Campo de contacto
	  br2.readLine();
	  linea = br2.readLine();
	  printw.println("Teléfono de contacto: " + linea + "<br>");
	  br2.readLine();
	    
	  linea = br2.readLine();
	  printw.println("Correo de contacto: " + linea + "<br><br>");
	  br2.readLine();
	  
	  //Campo de formación
	  printw.println("<h2>Formación profesional:</h2>");
	  do {
	    linea = br2.readLine();
		if(linea != null) {
		  printw.println(linea + "<br>");
		  if (linea.isEmpty()) {
		    break;
		  }
	    }
	  } while(linea != null);
	  
	  //Campo de experiencia
	  printw.println("<h2>Experiencia laboral:</h2>");
	  do {
	    linea = br2.readLine();
	    if(linea != null) {
		  printw.println(linea + "<br>");
		  if (linea.isEmpty()) {
		    break;
		  }
		}
	  } while(linea != null);
	    
	  printw.println("</p></center>");
	  printw.println("</body>");
	  //Aqui acaba el body
	  
	  printw.println("</html>");
	
	  br1.close();
	  br2.close();
	  printw.close();
	  System.out.println("Generado exitosamente");
	} catch(FileNotFoundException f){
	  System.out.println("No se puede encontrar alguno de los ficheros");
			
	} catch (IOException ioe) {
	  System.out.println("Existen problemas de lectura y/o escritura en algún fichero");
	}
  }
}
