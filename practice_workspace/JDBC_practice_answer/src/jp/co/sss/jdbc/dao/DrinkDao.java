package jp.co.sss.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.sss.jdbc.db.DBManager;
import jp.co.sss.jdbc.dto.Drink;
import jp.co.sss.jdbc.dto.Genre;

/**
 * DrinkテーブルにCRUD処理を行うクラス 
 * @author teacher
 *
 */
public class DrinkDao {
	/**
	 * 飲料名検索
	 * @return DBに検索をかけて取得したデータ
	 */
	public static List<Drink> findByName(String drinkName) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		// DBから帰ってくる複数のレコード情報を保持するためにBook型のListを用意する
		List<Drink> drinkList = new ArrayList<Drink>();

		try {
			// DBと接続を行い、接続情報をconnectionに代入
			connection = DBManager.getConnection();
			// 文字列でSQLを作成
			String sql="SELECT drink_name,release_date,sel_price,g.genre_name \n"
							+ "FROM drink d INNER JOIN drink_genre g \n"
							+ "ON d.genre_id=g.genre_id\n"
							+ "WHERE drink_name LIKE ?";
			
			//prepareStatement()でSQL文に変換
			preparedStatement = connection.prepareStatement(sql);
			
			//?の位置に任意の値をバインドする。
			//完全一致の検索にするため%%は無しにする。
			preparedStatement.setString(1,drinkName);

			// executeQuery()→SQL文を実行
			resultSet = preparedStatement.executeQuery();

			// 検索結果を繰り返し、1行ずつ取得する
			while (resultSet.next()) {
				// DBの1レコードの情報を１つずつフィールドに格納するために用意
				Drink drink = new Drink();
				drink.setDrinkName(resultSet.getString("drink_name"));
				drink.setReleaseDate(resultSet.getDate("release_date"));
				drink.setSelPrice(resultSet.getInt("sel_price"));
				// ジャンル情報はジャンル用のjavaBeansにセット
				Genre genre = new Genre();
				genre.setGenreName(resultSet.getString("genre_name"));
				// ジャンル名が格納されたgenreクラスをbookの中にセット
				drink.setGenre(genre);

				// 検索結果を格納したJavaBeans(Bookクラス)をListに詰める
				drinkList.add(drink);
			}

		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		
			//DBと接続が終わったら必ず切断する
		}finally {
			DBManager.close(resultSet);
			DBManager.close(preparedStatement);
			DBManager.close(connection);
		}
		return drinkList;

	}
	
	/**
	 * 名前と価格で検索を行うメソッド
	 * @param drinkName　飲料名
	 * @param price　価格
	 * @return　DBに検索をかけて取得したデータ
	 */
	public static List<Drink> findByNameAndPrice(String drinkName,int price) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		// DBから帰ってくる複数のレコード情報を保持するためにBook型のListを用意する
		List<Drink> drinkList = new ArrayList<Drink>();

		try {
			// DBと接続を行い、接続情報をconnectionに代入
			connection = DBManager.getConnection();
			// 文字列でSQLを作成
			String sql="SELECT drink_name,release_date,sel_price,g.genre_name \n"
							+ "FROM drink d INNER JOIN drink_genre g \n"
							+ "ON d.genre_id=g.genre_id\n"
							+ "WHERE drink_name LIKE ? AND sel_price >=?";
			
			//prepareStatement()でSQL文に変換
			preparedStatement = connection.prepareStatement(sql);
			
			//?の位置に任意の値をバインドする。
			preparedStatement.setString(1,"%"+drinkName+"%");
			preparedStatement.setInt(2,price);

			// executeQuery()→SQL文を実行
			resultSet = preparedStatement.executeQuery();

			// 検索結果を繰り返し、1行ずつ取得する
			while (resultSet.next()) {
				// DBの1レコードの情報を１つずつフィールドに格納するために用意
				Drink drink = new Drink();
				drink.setDrinkName(resultSet.getString("drink_name"));
				drink.setReleaseDate(resultSet.getDate("release_date"));
				drink.setSelPrice(resultSet.getInt("sel_price"));
				// ジャンル情報はジャンル用のjavaBeansにセット
				Genre genre = new Genre();
				genre.setGenreName(resultSet.getString("genre_name"));
				// ジャンル名が格納されたgenreクラスをbookの中にセット
				drink.setGenre(genre);

				// 検索結果を格納したJavaBeans(Bookクラス)をListに詰める
				drinkList.add(drink);
			}

		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		
			//DBと接続が終わったら必ず切断する
		}finally {
			DBManager.close(resultSet);
			DBManager.close(preparedStatement);
			DBManager.close(connection);
		}
		return drinkList;

	}
		
	
	/**
	 * 価格更新用のメソッド
	 * @param rowPrice　変更する前の最低価格
	 * @param highPrice　変更する目の最高価格
	 * @param newPrice　変更後の価格
	 */
	public static void updateDrinkPrice(int rowPrice,int highPrice,int newPrice) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			// DBと接続を行い、接続情報をconnectionに代入
			connection = DBManager.getConnection();
			// 文字列でSQLを作成
			String sql="UPDATE drink SET sel_price=? \n"
					+ "WHERE sel_price BETWEEN ? AND ?";
			
			//prepareStatement()でSQL文に変換
			preparedStatement = connection.prepareStatement(sql);
			
			//?の位置に任意の値をバインドする。
			preparedStatement.setInt(1,newPrice);
			preparedStatement.setInt(2,rowPrice);
			preparedStatement.setInt(3,highPrice);

			// executeUpdate()→SQL文を実行
			preparedStatement.executeUpdate();


		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("システムエラーにより、価格変更ができませんでした。");
			System.out.println("もう一度やり直してください。");
			
			e.printStackTrace();
		
			//DBと接続が終わったら必ず切断する
		}finally {

			DBManager.close(preparedStatement);
			DBManager.close(connection);
		}

	}
	
	
	/**
	 * 削除用メソッド
	 * @param releasedate　日付
	 */
	public static void deleteDrink(Date releasedate) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			// DBと接続を行い、接続情報をconnectionに代入
			connection = DBManager.getConnection();
			// 文字列でSQLを作成
			String sql="DELETE FROM drink\n"
					+ "WHERE release_date=?";
			
			//prepareStatement()でSQL文に変換
			preparedStatement = connection.prepareStatement(sql);
			
			//?の位置に任意の値をバインドする。
			preparedStatement.setDate(1,releasedate);

			// executeUpdate()→SQL文を実行
			preparedStatement.executeUpdate();


		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("システムエラーにより、削除ができませんでした。");
			System.out.println("もう一度やり直してください。");
			
			e.printStackTrace();
		
			//DBと接続が終わったら必ず切断する
		}finally {

			DBManager.close(preparedStatement);
			DBManager.close(connection);
		}

	}
	
}
