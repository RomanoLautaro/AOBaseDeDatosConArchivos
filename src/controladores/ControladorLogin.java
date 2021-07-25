package controladores;

import frame.CargarEmpleado;
import frame.Login;
import frame.Prog1;
import frame.Register;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

public class ControladorLogin {
    public static Boolean loginArchivo() {
        boolean iniciosesion = true;
        //esperar medio segundo
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        String user = Login.jTextUser.getText();
        char[] pass = Login.jPasswordField1.getPassword();
        String password = String.valueOf(pass);

        if (verificarUsuarioYContraseñaArchivo(user, password) || iniciosesion) {
            Prog1 vista = new Prog1();
            vista.setVisible(true);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "usuario o contraseña incorrecto, intente nuevamente...");
            return false;
        }
    }

    public static boolean verificarUsuarioYContraseñaArchivo(String usuario, String contraseña) {

        try {
            BufferedReader bf = new BufferedReader(new FileReader("Usuarios/user.txt"));
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(bfRead, "|");

                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                if (x.get(0).toString().equals(usuario) && x.get(1).toString().equals(contraseña)) {
                    return true;
                }

            }
        } catch (IOException e) {
            return false;

        }
        return false;
    }
    public void registrarArchivo(){
        String user= Register.jTextUser.getText();
        char[] pass= Register.jPasswordField1.getPassword();
        
        String password = String.valueOf(pass);
        
        Register.jTextUser.setText("");
        Register.jPasswordField1.setText("");

        
        try{
            FileWriter fw = new FileWriter("Usuarios/user.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(user);
            pw.println("|"+password);
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
