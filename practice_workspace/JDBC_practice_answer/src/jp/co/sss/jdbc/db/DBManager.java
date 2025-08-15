package jp.co.sss.jdbc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * DBと接続、切断をおこなうクラス
 * @author teacher
 *
 */
public class DBManager {
	/** ドライバクラス名 */
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	/** 接続する DB の URL */
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	/** DB 接続するためのユーザ名 */
	private static final String USER_NAME = "OraclePracticeUser";
	/** DB 接続するためのパスワード */
	private static final String PASSWORD = "systemsss";

	/**
	 * DB と接続する
	 *
	 * @return DB コネクション
	 * @throws ClassNotFoundException ドライバクラスが見つからなかった場合
	 * @throws SQLException           DB 接続に失敗した場合
	 */
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		// JDBC ドライバクラスを JVM に登録
		Class.forName(DRIVER);
		// DB に接続
		Connection conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		return conn;

	}

	/**
	 * DB との接続を切断する
	 *
	 * @param connection DB との接続情報
	 */
	public static void close(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * PreparedStatement をクローズする
	 *
	 * @param preparedStatement ステートメント情報
	 */
	public static void close(PreparedStatement preparedStatement) {
		if (preparedStatement != null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ResultSet をクローズする
	 *
	 * @param resultSet SQL 検索結果
	 */
	public static void close(ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
