//問題
//すごろくゲームをします。
//以下の条件を満たすよう作成しなさい。
//
//Diceクラス
//　doDiceメソッドを定義する。（引数なし、戻り値　int型）
//　・Math.Random()を用いてさいころの目を乱数で生成する。（教科書を参考にしてよい。）
//　・さいころの目をreturnする。
//Playerクラス
//　　フィールド　nameを定義（型は自分で考えること）
//　　コンストラクタを定義する。
//  		・nameに引数値を代入する。
//    メソッド　
//    	・rollDice()メソッドを定義する（引数なし、戻り値void）
//    		Diceオブジェクトを生成する。
//    		diceオブジェクトのdoDiceメソッドを呼び出す
//    		"サイコロの目は〇だった。"と表示
//
//   	・rollDice()メソッドをオーバーロードする（引数int型、戻り値void）
//    		Diceオブジェクトを生成する。
//    		合計用の変数を定義する
//    		for文（引数の数値分、繰り返す）
//    			diceオブジェクトのdoDiceメソッドを呼び出す
//    			"サイコロの目は〇だった。"と表示
//    			doDiceメソッドの戻り値を合計用変数に加算
//    		"合計〇進めるぞ！"と表示
//Sugorokuクラス
//　メインメソッド内に以下の処理を記述する。
//　・Player型のオブジェクトを生成する。
//　・コンソール上に
//>１　サイコロを振る
//>２　急行カード（サイコロ2個）
//>３　特急カード（サイコロ3個）
//と表示し、番号選択させる。
//　・１ならば　rollDiceメソッドを呼び出す
//　・２か３ならばrollDiceメソッド（引数に選択番号）を呼び出す
//　・上記以外ならば"不正な値です"と表示する

//【出力例①】
//プレイヤーの名前はママタロ社長です。
//行動を選択して下さい
//>１　サイコロを振る
//>２　急行カード（サイコロ2個）
//>３　特急カード（サイコロ3個）
//　>３
//サイコロを3個、振れるぞ！
//サイコロの目は5だった。
//サイコロの目は5だった。
//サイコロの目は3だった。
//合計13進めるぞ！

//【出力例②】
//プレイヤーの名前はママタロ社長です。
//行動を選択して下さい
//>１　サイコロを振る
//>２　急行カード（サイコロ2個）
//>３　特急カード（サイコロ3個）
//　>４
//不正な値です

package other.sugoroku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sugoroku {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Player mamataro = new Player("ママタロ社長");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("行動を選択して下さい\n>１　サイコロを振る\n>２　急行カード（サイコロ2個）\n>３　特急カード（サイコロ3個）");
		System.out.print(">");

		int choiceNum = Integer.parseInt(br.readLine());
		if (choiceNum == 1) {
			mamataro.rollDice();
		} else if (choiceNum >= 2 && 3 >= choiceNum) {
			mamataro.rollDice(choiceNum);
		} else {
			System.out.println("不正な値です");

		}

	}
}
