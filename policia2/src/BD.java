

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JComboBox;

public class BD {
Connection conexion = null; //maneja la conexion
Statement  instruccion= null; //instruccion consulta
ResultSet conjuntoresultados = null; //maneja los resultados
JComboBox <delincuente> listadelincuentes;
	public BD() {
		// TODO Auto-generated constructor stub
		crearConexion();
	}
		public BD(JComboBox <delincuente>delincuentes){
			crearConexion();
			//nos permite que veamos el combobox
			this.listadelincuentes=delincuentes;
		}
		private void crearConexion(){
			try{
				Class.forName("com.mysql.jdbc.Driver");
				//establecer la conexion a la base de datos
				conexion=DriverManager.getConnection("");
			}catch( SQLException | ClassNotFoundException excepcionSql ){
				excepcionSql.printStackTrace();
			}//fin del catch
		}
		public void leerdelincuente () throws SQLException{
			//crear bojeto Statement para consultar la base de datos
			instruccion = (Statement) conexion.createStatement();
			//consulta la base de datos
			conjuntoresultados = instruccion.executeQuery("SELECT Dni,Nombre FROM policia");
			//mostrar por pantalla
			while (conjuntoresultados.next());
			{
System.out.println("Dni"+conjuntoresultados.getObject("Dni")+", Nombre"+conjuntoresultados.getObject("Nombre"));		

			delincuente D =new delincuente();
			listadelincuentes.addItem(D);
			
			}
			conjuntoresultados.close();
		}
		
		
		public void insertardelincuentes (String Dnidelincuente, String Nombredelincuente ,String Apellidosdelincuente, int Edaddelincuente, String Crimendelincuente, int Alturadelincuente){
	 //crea objeto Statment para consultar la base de datos
	 try{
		 instruccion=(Statement)conexion.createStatement();
	 }catch (SQLException e){
		 e.printStackTrace();
	 
 }
	 //insercion en base de datos
	 try{
		String sql= "INSERT INTO `fichapolicia`.`policia` ( Dni, Nombre, Edad, Crimen, Altura) VALUES ("
		
		+"'"+Dnidelincuente+"',"
		+"'"+Nombredelincuente+"',"
		//+"'"+Edad+"',"
		+"'"+Crimendelincuente+"');";
		//+"'"+Altura+"');";
		instruccion.executeUpdate(sql);
		
	 }catch ( SQLException e){
		 e.printStackTrace();
	 }
 }
}

 //comprueba la insercion
 
 //listadelincuentes.removeAllItems();
 //Leerdelincuentes(listadelincuentes);

