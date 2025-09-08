package jp.co.sss.practice.p04.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.practice.p04.q02.form.FavoriteForm;

@Controller
public class Practice0402Controller {


	// Practice4-02 Formクラス利用版入力画面表示用
	@RequestMapping("/favorite/input")
	public String showFavoriteInputPage() {
		return "practice04/02/favorite_input";
	}

	// Practice4-02 Formクラスを利用したパラメータ取得
	@RequestMapping(path = "/favorite/result", method = RequestMethod.POST)
	public String postFavoriteResult(FavoriteForm favoriteForm) {
		System.out.println("==パラメータを受け取りました");
		System.out.println("==果物 : " + favoriteForm.getFruit());
		System.out.println("==スナック : " + favoriteForm.getSnack());
		System.out.println("==スイーツ : " + favoriteForm.getSweet());
		System.out.println("==おかず : " + favoriteForm.getSidedish());

		return "practice04/02/favorite_result";
	}

}
