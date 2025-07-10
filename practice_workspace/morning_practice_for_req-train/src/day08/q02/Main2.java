//追加問題

//パッケージ名 day8.q2
//クラス名1 Magic.java 魔法使いクラス(要修正)
//クラス名2 Sorcerer.java 魔導士クラス（要修正）
//クラス名3 Monster.java モンスタークラス（新規作成）
//クラス名4 Main2.java オブジェクト生成し、プログラムを実行するクラス

//day8.q1で実装した内容を改修し、モンスターにダメージを与え倒せるようにする。
//以下の条件に従って実装しなさい。なお修正内容のみ記載する
//
//※「+」はpublic、「-」はprivate、「__」はstaticメンバを表す
//【Monsterクラス】
//	・フィールド
//		- name:String
//		- hp:int

//	・コンストラクタ
//		+ 	public Monster(name:String, hp:int) {
//			・フィールドに引数の値を代入する
//			・(name + "が現れた！！")と表示
//			・toString()を表示

//	・メソッド
//		+ 各フィールドのsetter,getter(Eclipseの機能を用いて生成してもよい)
//		+ toString()をオーバーライドする（Eclipseの機能を用いて生成すること）

//【Magicクラス(要修正)】
//	・メソッド
//		+ attack(mp:int,monster:Monster):戻り値の型 void 
//			・(name + "の攻撃！！")と表示
//			・モンスターに乱数（0-mpの間）+10の数値のダメージを与える（"モンスター名に・・・のダメージ!!"と表示）
//			・モンスターのhpにダメージを減算した後の数値をsetする

//【Sorcererクラス(要修正)】
//	・メソッド
//		+ attack(int mp):戻り値の型 void 
//			→Magic#attack(mp:int,monster:Monster)をオーバーライドする（Eclipseの機能を用いて生成してもよい）
//			・super.attack(mp,monster)を呼び出す
// 			・(mp*0.5)した数値を追加ダメージとして与える("追加で・・・のダメージ!!"と表示)
// 			・モンスターのhpに追加ダメージを減算した後の数値をsetする

//【Mainクラス】
//	・メソッド
//		+ __main(args:String[]):戻り値の型 void 
//			・MagicクラスとSorcererクラスを生成する。（コンストラクタ引数に任意の名前を与える。)
//			・Monsterクラスを生成する。（引数に任意の名前と整数＝HPを入力）
//			・攻撃ターンをカウントする合計用変数を宣言。
//			・while文を記述する
//					条件：monster.getHp()>=0
//					ブロック内にMagicクラスとSorcererクラスのattackメソッドを呼び出す。（引数に任意の整数＝魔力とmonsterを入力。）
//					ターン数をインクリメント
//			・ループから抜けた後、"〇ターン目でmonster名を倒した！！"を出力。

//【出力例】
//スライムが現れた！！
//Monster [name=スライム, hp=10000]
//1ターン目の攻撃！！
//
//魔法使いの攻撃！！
//スライムに10のダメージ！！
//
//魔導士の攻撃！！
//スライムに21のダメージ！！
//追加で15のダメージを与えた。
//・・・
//171ターン目でスライムを倒した!!

package day08.q02;

import day08.q01.Magic;

public class Main2 {

	public static void main(String[] args) throws InterruptedException {
		Magic magic = new Magic("魔法使い");// 名前を引数に入力
		/*ここから記入*/

	}

}
