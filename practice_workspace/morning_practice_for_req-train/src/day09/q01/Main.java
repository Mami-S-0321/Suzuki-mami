//問題

//プレイヤー同士で対戦できるじゃんけんプログラムがある。
//これをコンピュータと対戦できるようにしたい
//以下の条件に従って解答しなさい。
//パッケージ名 day9.q1
//クラス名1 Playable.java プレイアブルインタフェース(既存クラス)
//クラス名2 HumanPlayer.java 人間プレイヤークラス（既存クラス）
//クラス名3 JankenBattle.java じゃんけんバトルクラス（既存クラス）
//クラス名4 SampleMain.java サンプル：オブジェクト生成し、プログラムを実行するクラス（既存クラス）
//クラス名4 ComPlayer.java オブジェクト生成し、プログラムを実行するクラス（新規作成）
//クラス名5 Main.java オブジェクト生成し、プログラムを実行するクラス（要修正）

//※「+」はpublic、「-」はprivate、「__」はstaticメンバを表す
//【ComPlayerクラス】
//	・Playableインタフェースを実装する
//	・メソッド
//		+ doJanken():戻り値の型 int throws IOException
//			・Math.random()を用い、0-2の値を取得する
//			・"コンピュータはxxxを選んだ"と出力する
//			・取得した値をreturnする

//【Mainクラス】
//※SampleMainを参考に人間とコンピュータとで対戦できるようにする
//	・メソッド
//		+ __main(args:String[]):戻り値の型 void 
//			・HumanPlayer型のオブジェクトを生成する。
//			・ComPlayer型のオブジェクトを生成する。
//			・二つのオブジェクトをJankenBattle.doBattle()の引数に設定する
//			・戻り値がHumanPlayerオブジェクトであれば人間の勝ち、そうでなければコンピュータの勝ちを表示する

//【出力例】
//じゃんけんを開始します
//suzukiさん、じゃんけんの手を選んで下さい
//	0	グー
//	1	チョキ
//	2	パー
//input number[0-2]? >>0
//コンピュータはグーを選んだ
//あいこです

package day09.q01;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// ここに記述

	}

}
