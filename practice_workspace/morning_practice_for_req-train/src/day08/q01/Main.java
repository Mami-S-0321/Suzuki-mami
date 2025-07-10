//問題 

//パッケージ名 day8.q1
//クラス名1 Magic.java 魔法使いクラス(実装済み。配布クラス)
//クラス名2 Sorcerer.java 魔導士クラス
//クラス名3 Main.java オブジェクト生成し、プログラムを実行するクラス

//あなたは瓶点堂エンタープライズのエンジニアです。あるゲームの魔法使い(Magicクラス)の強化職を実装する仕事を先輩から頼まれました。
//先輩「魔導士クラス（Sorcererクラス）を作ってね。攻撃するときに追加ダメージが与えられるとかよくね？」
//以下の条件を満たすクラスを作成しなさい。

//※「+」はpublic、「-」はprivate、「__」はstaticメンバを表す
//【Magicクラス(実装済み)】
//	・フィールド
//		- name:String
//	・コンストラクタ
//		+ Magic(name:String)  
//			・フィールドnameに引数の値を代入する
//	・メソッド
//		+ attack(mp:int):戻り値の型 void 
//			・(name + "の攻撃！！")と表示
//			・乱数（0-mpの間）+10の数値のダメージを与える
//【Sorcererクラス】
//	→Magicクラスを継承する
//	・コンストラクタ（Eclipseの機能を用いて生成してもよい）
//		+ Sorcerer(name:String)
//			・super(name)を呼び出す
//	・メソッド
//		+ attack(mp:int):戻り値の型 void 
//			→Magic#attack(mp:int)をオーバーライドする（Eclipseの機能を用いて生成してもよい）
//			・super.attack(mp)を呼び出す
// 			・(mp*0.5)した数値を追加ダメージとして与える
//【Mainクラス】
//	・メソッド
//		+ __main(args:String[]):戻り値の型 void 
//			・MagicクラスとSorcererクラスを生成する。（コンストラクタ引数に任意の名前を与える。)
//			・それぞれのオブジェクトのattackメソッドを呼び出す。（引数にmp:任意の整数を与える。）

//【出力例】
//魔法使いの攻撃！！
//相手に18のダメージ！！
//魔導士の攻撃！！
//相手に32のダメージ！！
//追加で15のダメージを与えた。

package day08.q01;

class Main {

	public static void main(String[] args) {

		/*Magicクラスの生成、利用*/
		Magic magic = new Magic("魔法使い");

		int magicMp = 10;

		magic.attack(magicMp);

		/*ここから記入*/

	}

}
