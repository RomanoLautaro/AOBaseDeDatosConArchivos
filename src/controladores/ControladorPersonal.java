/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import frame.Personal;
import static frame.Personal.jTableEmpleados;
import frame.VerEmpleado;
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lauta
 */
public class ControladorPersonal {

    public static void cargarTablaArchivo() {
        int contador = 0; // cuenta la cantidad de datos que se ingresan a la tabla
            
        DefaultTableModel modelo = (DefaultTableModel) Personal.jTableEmpleados.getModel();
        modelo.setNumRows(0);
        //leee archivo
        try {
            BufferedReader bf = new BufferedReader(new FileReader("empleados/AOM BASE DE DATOS RRHH.csv"));
            String bfRead;
            String d = null;
            while ((bfRead = bf.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(bfRead, ";");

                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    if (contador >= 3 && contador <= 14){
                        x.addElement(dato.nextToken());
                    }else{
                        dato.nextToken();
                    }
                    
                    contador++;
                }
                modelo.addRow(x);
                contador = 0;
            }

        } catch (IOException e) {
            System.err.println("No se encontro archivo");
        }

    }

    public void verEmpleadosArchivos() {
        VerEmpleado vistaVerEmpleado = new VerEmpleado();
        vistaVerEmpleado.setVisible(true);

        DefaultTableModel table = (DefaultTableModel) Personal.jTableEmpleados.getModel();
        int row = Personal.jTableEmpleados.getSelectedRow();
        String Legajo = (String) Personal.jTableEmpleados.getValueAt(row, 2);

        //Ver Empleado desde la base de datos
        try {
            BufferedReader bf = new BufferedReader(new FileReader("empleados/AOM BASE DE DATOS RRHH.csv"));
            String bfRead;
            String d = null;
            while ((bfRead = bf.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(bfRead, ";");

                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                if (Legajo.equals(x.get(5).toString())) {
                    VerEmpleado.Etiqueta1.setText((String) x.get(0));
                    VerEmpleado.Etiqueta2.setText((String) x.get(1));
                    VerEmpleado.Etiqueta3.setText((String) x.get(2));
                    VerEmpleado.Etiqueta4.setText((String) x.get(3));
                    VerEmpleado.Etiqueta5.setText((String) x.get(4));
                    VerEmpleado.Etiqueta6.setText((String) x.get(5));
                    VerEmpleado.Etiqueta7.setText((String) x.get(6));
                    VerEmpleado.Etiqueta8.setText((String) x.get(7));
                    VerEmpleado.Etiqueta9.setText((String) x.get(8));
                    VerEmpleado.Etiqueta10.setText((String) x.get(9));
                    VerEmpleado.Etiqueta11.setText((String) x.get(10));
                    VerEmpleado.Etiqueta12.setText((String) x.get(11));
                    VerEmpleado.Etiqueta13.setText((String) x.get(12));
                    VerEmpleado.Etiqueta14.setText((String) x.get(13));
                    VerEmpleado.Etiqueta15.setText((String) x.get(14));
                    VerEmpleado.Etiqueta16.setText((String) x.get(15));
                    VerEmpleado.Etiqueta17.setText((String) x.get(16));
                    VerEmpleado.Etiqueta18.setText((String) x.get(17));
                    VerEmpleado.Etiqueta19.setText((String) x.get(18));
                    VerEmpleado.Etiqueta20.setText((String) x.get(33));
                    VerEmpleado.Etiqueta21.setText((String) x.get(34));
                    VerEmpleado.Etiqueta22.setText((String) x.get(35));
                    VerEmpleado.Etiqueta23.setText((String) x.get(36));
                    VerEmpleado.Etiqueta24.setText((String) x.get(39));
                }

            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void cargarTablaBusquedaArchivo(String Date) {
        try {

            DefaultTableModel modelo = (DefaultTableModel) jTableEmpleados.getModel();
            modelo.setNumRows(0);

            BufferedReader bf = new BufferedReader(new FileReader("empleados/empleados.txt"));
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(bfRead, "|");

                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                //convertirn en mayuscula el dato recibido
                String date = Date.toUpperCase();
                
                String datoUno = x.get(0).toString().toUpperCase();
                
                if (x.get(0).toString().toUpperCase().indexOf(date) >= 0 || x.get(1).toString().toUpperCase().indexOf(date) >= 0 || x.get(2).toString().toUpperCase().indexOf(date) >= 0
                        || x.get(3).toString().toUpperCase().indexOf(date) >= 0 || x.get(4).toString().toUpperCase().indexOf(date) >= 0) {
                    modelo.addRow(x);
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
