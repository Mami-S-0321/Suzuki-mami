package jp.co.sss.jdbc.dto;

import java.util.Date;
/**
 * 飲料クラス
 * @author teacher
 *
 */
public class Drink {
	private int drinkId;
	private String drinkName;
	private Date releaseDate;
	private int selPrice;
	private Genre genre;

	public int getDrinkId() {
		return drinkId;
	}

	public void setDrinkId(int drinkId) {
		this.drinkId = drinkId;
	}

	public String getDrinkName() {
		return drinkName;
	}

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
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

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}



}
