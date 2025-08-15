package jp.co.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTraining05 {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	//必要なオブジェクトの呼び出し
    	Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
        	System.out.println("部署を新規登録します。、");
            // 登録する値を入力
            System.out.println("部署名を入力してください。");
            String dName = br.readLine();
            System.out.println("場所を入力してください。");
            String loc = br.readLine();

            // DBに接続
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "education", "systemsss");

            preparedStatement = connection.prepareStatement("INSERT INTO dept VALUES( dept_seq.nextval , ? , ? )");

            // 入力値をバインド
            preparedStatement.setString(1,dName);
            preparedStatement.setString(2,loc);

            // SQL文を実行
            int cnt = preparedStatement.executeUpdate();

            System.out.println("部署を登録しました。");
        } catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();

		} finally {

			if (preparedStatement != null) {

				try {

					preparedStatement.close();

				} catch (SQLException e) {

					e.printStackTrace();

				}

			}

			if (connection != null) {

				try {

					connection.close();

				} catch (SQLException e) {

					e.printStackTrace();

				}

			}

		}
    }


}
