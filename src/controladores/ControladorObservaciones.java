
package controladores;

import frame.Observaciones;
import frame.Personal;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class ControladorObservaciones {
    public void verObservacionesEmpleadosArchivos() {
        Observaciones vistaObservaciones = new Observaciones();
        vistaObservaciones.setVisible(true);

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
                    Observaciones.jTAObservaciones.setText(x.get(37).toString());
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
