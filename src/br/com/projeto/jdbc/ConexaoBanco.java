package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBanco {
	
	public Connection getConnection() {
		
		try {
			
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bdvendas", "usuario","123");
			
		} catch (Exception erro) {
			throw new RuntimeException(erro);
		}
		
	}

}
