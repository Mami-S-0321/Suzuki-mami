package jp.co.sss.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.sss.jdbc.db.DBManager;
import jp.co.sss.jdbc.dto.Book;
import jp.co.sss.jdbc.dto.BookGenre;

/**
 * BookテーブルにCRUD処理をおこなうクラス
 * @author teacher
 *
 */
public class BookDao {

	/**
	 * 全件検索用のメソッド
	 * @return DBに検索をかけて取得したデータ
	 */
	public static List<Book> selectAll() {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		// DBから帰ってくる複数のレコード情報を保持するためにBook型のListを用意する
		List<Book> bookList = new ArrayList<Book>();

		try {
			// DBと接続を行い、接続情報をconnectionに代入
			connection = DBManager.getConnection();
			// 文字列でSQLを作成し、prepareStatement()でSQL文に変換
			// preparedStatementにSQL文を代入
			preparedStatement = connection
					.prepareStatement("SELECT book_id,book_name,release_date,sel_price,g.genre_name "
							+ "FROM book b INNER JOIN book_genre g ON b.genre_id=g.genre_id");

			// executeQuery()→SQL文を実行
			resultSet = preparedStatement.executeQuery();

			// 検索結果を繰り返し、1行ずつ取得する
			while (resultSet.next()) {
				// DBの1レコードの情報を１つずつフィールドに格納するために用意
				Book book = new Book();
				book.setBookId(resultSet.getInt("book_id"));
				book.setBookName(resultSet.getString("book_name"));
				book.setReleaseDate(resultSet.getDate("release_date"));
				book.setSelPrice(resultSet.getInt("sel_price"));
				// ジャンル情報はジャンル用のjavaBeansにセット
				BookGenre genre = new BookGenre();
				genre.setGenreName(resultSet.getString("genre_name"));
				// ジャンル名が格納されたgenreクラスをbookの中にセット
				book.setGenre(genre);

				// 検索結果を格納したJavaBeans(Bookクラス)をListに詰める
				bookList.add(book);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

			// DBと接続が終わったら必ず切断する
		} finally {
			DBManager.close(resultSet);
			DBManager.close(preparedStatement);
			DBManager.close(connection);
		}
		return bookList;

	}

	/**
	 * 登録用のメソッド
	 * @param bookName 		書籍名
	 * @param releaseDate	発売日
	 * @param price			価格
	 * @param genreId		ジャンルID
	 */
	public static void insertBook(String bookName, Date releaseDate, int price, int genreId) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			// DBと接続を行い、接続情報をconnectionに代入
			connection = DBManager.getConnection();
			// 文字列でSQLを作成する。
			String sql = "INSERT INTO book VALUES(book_id_seq.NEXTVAL,?,?,?,?)";

			// prepareStatement()でSQL文に変換
			preparedStatement = connection.prepareStatement(sql);

			// ?の位置に任意の値をバインドする。
			preparedStatement.setString(1, bookName);
			preparedStatement.setDate(2, releaseDate);
			preparedStatement.setInt(3, price);
			preparedStatement.setInt(4, genreId);

			// executeUpdate()→SQL文を実行(登録、更新、削除の時にしか使用しない)
			preparedStatement.executeUpdate();

			System.out.println("書籍の登録が終わりました。");

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("何らかのエラーにより、書籍登録が正常に終了しませんでした。");
			System.out.println("もう一度初めからやり直してください。");

			e.printStackTrace();

			// DBと接続が終わったら必ず切断する
		} finally {
			DBManager.close(preparedStatement);
			DBManager.close(connection);
		}
	}

	/**
	 * 更新用のメソッド
	 * @param bookName    書籍名
	 * @param releaseDate 発売日
	 * @param price       価格
	 * @param genreId     ジャンルID
	 * @param bookId      書籍ID
	 */
	public static void updateBook(String bookName, Date releaseDate, int price, int genreId, int bookId) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			// DBと接続を行い、接続情報をconnectionに代入
			connection = DBManager.getConnection();
			// 文字列でSQLを作成する。
			String sql = "UPDATE book SET book_name=?,release_date=?,sel_price=?,genre_id=? WHERE book_id=?";

			// prepareStatement()でSQL文に変換
			preparedStatement = connection.prepareStatement(sql);

			// ?の位置に任意の値をバインドする。
			preparedStatement.setString(1, bookName);
			preparedStatement.setDate(2, releaseDate);
			preparedStatement.setInt(3, price);
			preparedStatement.setInt(4, genreId);
			preparedStatement.setInt(5, bookId);

			// executeUpdate()→SQL文を実行(登録、更新、削除の時にしか使用しない)
			preparedStatement.executeUpdate();

			System.out.println("書籍情報の更新が終わりました。");

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("何らかのエラーにより、書籍更新が正常に終了しませんでした。");
			System.out.println("もう一度初めからやり直してください。");

			e.printStackTrace();

			// DBと接続が終わったら必ず切断する
		} finally {
			DBManager.close(preparedStatement);
			DBManager.close(connection);
		}
	}

	/**
	 * 削除用のメソッド
	 * @param bookId	書籍ID
	 */
	public static void deleteBook(int bookId) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			// DBと接続を行い、接続情報をconnectionに代入
			connection = DBManager.getConnection();
			// 文字列でSQLを作成する。
			String sql = "DELETE FROM book WHERE book_id=?";

			// prepareStatement()でSQL文に変換
			preparedStatement = connection.prepareStatement(sql);

			// ?の位置に任意の値をバインドする。
			preparedStatement.setInt(1, bookId);

			// executeUpdate()→SQL文を実行(登録、更新、削除の時にしか使用しない)
			preparedStatement.executeUpdate();

			System.out.println("書籍情報の削除が終わりました。");

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("何らかのエラーにより、書籍削除が正常に終了しませんでした。");
			System.out.println("もう一度初めからやり直してください。");

			e.printStackTrace();

			// DBと接続が終わったら必ず切断する
		} finally {
			DBManager.close(preparedStatement);
			DBManager.close(connection);
		}
	}
}
