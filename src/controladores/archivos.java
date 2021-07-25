
package controladores;

import java.io.*;

public class archivos {
    
    public String leerTxt(String direccion){ //direccion del archivo
        
        String texto = "";
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                //haz el ciclo, mientras bfRead tiene datos
                temp = temp + bfRead; //guardado el texto del archivo
            }
            
            texto = temp;
            
        }catch(IOException e){ 
            System.err.println("No se encontro archivo");
        }
        
        return texto;
        
    }
    
}
