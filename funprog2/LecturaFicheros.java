

import java.io.*;
import java.util.*;

/**
 * Clase para la lectura de ficheros clientes 
 
 *
 */
public class LecturaFicheros {
	public static void main(String []args) throws IOException{
		
		leerClientes("d://Clientes.txt");
		
	}

   
  /**
   * Metodo para leer los clientes de un fichero 
   * @param cadena ruta del fichero
   * @return matriz de clientes leidos
   * @throws IOException
   */
  public static void leerClientes (String cadena)throws IOException{
	
    File f=new File(cadena);
    Scanner nombre_f = new Scanner (f);
    while (nombre_f.hasNext()){
      String no=nombre_f.next();
      String dni=nombre_f.next();
      long tar= nombre_f.nextLong();
      int identificador=nombre_f.nextInt(); 
      boolean joven=nombre_f.nextBoolean();
      System.out.println(no+" "+dni+" "+tar+" "+" "+identificador+" "+joven);
      if (joven){
        int nc=nombre_f.nextInt();
       System.out.println(nc);
      }
       	
      
    }
    nombre_f.close();
    
  }  
}