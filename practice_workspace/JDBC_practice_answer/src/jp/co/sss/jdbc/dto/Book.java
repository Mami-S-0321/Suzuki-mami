package jp.co.sss.jdbc.dto;

import java.util.Date;

/**
 * Bookテーブルから検索して取得したデータを一時的に保存するJavaBeans
 * 
 * @author teacher
 *
 */
public class Book {
//フィールド
	private int bookId;
	private String bookName;
	private Date releaseDate;
	private int selPrice;
	private BookGenre genre;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getSelPrice() {
		return selPrice;
	}

	public void setSelPrice(int selPrice) {
		this.selPrice = selPrice;
	}

	public BookGenre getGenre() {
		return genre;
	}

	public void setGenre(BookGenre genre) {
		this.genre = genre;
	}

	
}
