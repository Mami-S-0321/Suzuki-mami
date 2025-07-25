//	・Playableインタフェースを実装する
//	・メソッド
//		+ doJanken():戻り値の型 int throws IOException
//			・Math.random()を用い、0-2の値を取得する
//			・"コンピュータはxxxを選んだ"と出力する
//			・取得した値をreturnする


package day09.q01;

import java.io.IOException;

public class ComPlayer implements Playable{
	@Override
	public int doJanken() throws IOException{
		int d = (int)(Math.random()*2);
		System.out.println("コンピュータはxxxを選んだ");
		return d;
	}




	}
