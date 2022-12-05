package model;

import java.sql.Connection;
import java.sql.DriverManager;

//DAO = Data Access Object
public class DAO {

//	*Connection Module*
//	Connection parameters
	private String driver = "com.mysql.cj.jdbc.Driver";  //https://youtu.be/A6YN8DoaARs?list=PLbEOwbQR9lqz9AnwhrrOLz9cz1-TxoiUg
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "1234";
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e){
			System.out.println(e);
			return null;
		}
	}
	//teste de conexão
//	public void testeConexao() {
//		try {
//			Connection con = conectar();
//			System.out.println(con);
//		} catch (Exception e) {
//			System.out.println(e);
//			
//		}
//	}
}
