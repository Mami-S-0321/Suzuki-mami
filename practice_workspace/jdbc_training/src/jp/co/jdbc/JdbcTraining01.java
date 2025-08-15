package jp.co.jdbc;

import java.sql.Connection;

public class JdbcTraining01 {

	public static void main(String[] args) {
		 Connection connection = null;
	        try {
	            // DBに接続
	            connection = DBManager.getConnection();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // DBとの接続を切断
	            DBManager.close(connection);
	        }
	        
	        
	    }


}
