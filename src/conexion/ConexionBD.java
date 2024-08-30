
package conexion;

import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//driver de conexion
import java.sql.ResultSet;//resultado final de datos
import java.sql.ResultSetMetaData;//resultado de metadatos
import java.sql.SQLException;//Tratamiento de Errros de BD SQL
import java.sql.Statement;//Generador de sentencias SQL
import javax.swing.JOptionPane;//ventanas emergentes

public class ConexionBD {
    
    //clases de conexion y sus objetos
public Connection cn;//conexion a BD puente
public Statement stmt;//Generador de sentencias SQL
public ResultSet rs;//resultado final de datos recoje select
    public void  conectarBase(){ // inicia metodo a la base de datos
    try{ // estructura de control de tratamiento de errores try-catch
        Class.forName("com.mysql.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost/montage","root","");
        JOptionPane.showMessageDialog(null, "Conexion a BD OK\n\nMontage Mata");
        stmt=cn.createStatement();//genera sentencias SQL sobre objetos de base de datos
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error de base de datos 1 especial de BD: \n"+ ex);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error general de programacion 2 :"+ e);
    }
    }//termina metodo conectar
}
