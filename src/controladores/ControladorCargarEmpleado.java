package controladores;

import frame.BuscarImagen;
import frame.CargarEmpleado;
import java.awt.Image;
import java.io.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ControladorCargarEmpleado {

    
    public static void guardarEmpeladoArchivoConFoto(){
        String nombre= CargarEmpleado.jTextFieldNombre.getText();
        String apellido= CargarEmpleado.jTextFieldApellido.getText();
        String areaDeTrabajo= CargarEmpleado.jTextFieldAreaDeTrabajo.getText();
        String dni= CargarEmpleado.jTextFieldDni1.getText();
        String legajo= CargarEmpleado.jTextFieldLegajo.getText();
        String observacion = CargarEmpleado.jTextAreaObservacion.getText();
        
        
        CargarEmpleado.jTextFieldApellido.setText("");
        CargarEmpleado.jTextFieldNombre.setText("");
        CargarEmpleado.jTextFieldAreaDeTrabajo.setText("");
        CargarEmpleado.jTextAreaObservacion.setText("");
        CargarEmpleado.jTextFieldLegajo.setText("");
        CargarEmpleado.jTextFieldDni1.setText("");
        
        //Guardar La foto
        String url=cargarimg();
        try{
            FileWriter fw = new FileWriter("empleados/empleados.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(nombre);
            pw.print("|"+apellido);
            pw.print("|"+dni);
            pw.print("|"+areaDeTrabajo);
            pw.print("|"+legajo);
            pw.print("|"+observacion);
            pw.println("|"+url);
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    
    public static void guardarEmpeladoArchivoSinFoto(){
        String nombre= CargarEmpleado.jTextFieldNombre.getText();
        String apellido= CargarEmpleado.jTextFieldApellido.getText();
        String areaDeTrabajo= CargarEmpleado.jTextFieldAreaDeTrabajo.getText();
        String dni= CargarEmpleado.jTextFieldDni1.getText();
        String legajo= CargarEmpleado.jTextFieldLegajo.getText();
        String observacion = CargarEmpleado.jTextAreaObservacion.getText();
        
        
        CargarEmpleado.jTextFieldApellido.setText("");
        CargarEmpleado.jTextFieldNombre.setText("");
        CargarEmpleado.jTextFieldAreaDeTrabajo.setText("");
        CargarEmpleado.jTextAreaObservacion.setText("");
        CargarEmpleado.jTextFieldLegajo.setText("");
        CargarEmpleado.jTextFieldDni1.setText("");
        
        //Guardar La foto
        String url="noimg";
        try{
            FileWriter fw = new FileWriter("empleados/empleados.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(nombre);
            pw.print("|"+apellido);
            pw.print("|"+dni);
            pw.print("|"+areaDeTrabajo);
            pw.print("|"+legajo);
            pw.print("|"+observacion);
            pw.println("|"+url);
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    
    
    public static String cargarimg(){
        File archivo = null;
        //CargarEmpleado cargarempleado = new CargarEmpleado();
        
        int resultado;
        BuscarImagen buscador = new BuscarImagen();    
    
        FileNameExtensionFilter formato = new FileNameExtensionFilter("JPG y PNG","jpg","png");
    
        BuscarImagen.jFileChooser2.setFileFilter(formato);
        resultado= BuscarImagen.jFileChooser2.showOpenDialog(null);
    
        if(JFileChooser.APPROVE_OPTION == resultado){
            archivo = BuscarImagen.jFileChooser2.getSelectedFile();
        
            try {
                ImageIcon imgicon = new ImageIcon(archivo.toString());
                Icon icono = new ImageIcon(imgicon.getImage().getScaledInstance(CargarEmpleado.jLabelImg.getWidth(), CargarEmpleado.jLabelImg.getHeight(), Image.SCALE_DEFAULT));
                
                CargarEmpleado.jLabelImg.setIcon(icono);
                return archivo.toString();
            } catch (Exception e) {
                System.out.println("ERROR: "+e);
            }
        }
        return "noimg";
    }
    
    
}
