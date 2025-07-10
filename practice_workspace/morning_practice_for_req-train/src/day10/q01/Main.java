//問題
//４ケタ整数の暗証番号を入力してアカウント情報を表示したい
//また不正な入力には独自例外をつかって対処する

//以下の条件に従って解答しなさい。
//パッケージ名 day10.q1
//クラス名1 Account.java アカウントクラス(既存クラス)
//クラス名2 IllegalInputException.java 独自例外クラス（新規作成）
//クラス名3 ConsoleReader.java コンソール入力クラス（既存クラス）
//クラス名4 Main.java オブジェクト生成し、プログラムを実行するクラス（要修正）

//※「+」はpublic、「-」はprivate、「__」はstaticメンバを表す
//【IllegalInputExceptionクラス】
//	・Exceptionクラスを継承する
//	・コンストラクタ（Eclipseの自動生成機能を用いてもよい）
//		+ IllegalInputException()
//			・処理なし
//		+ IllegalInputException(message:String)
//			・super(message)
//【ConsoleReaderクラス】
//	※既存クラスを修正すること
//	・メソッド（修正箇所のみ記載）
//		+ inputPIN():戻り値の型 int throws IOException,IllegalInputException
//			※コメントの場所に以下を追記
//			・if[4桁の数字以外の入力値の場合]
//				・throw new IllegalInputException("不正な入力:" + 入力値)
//			ヒント：条件は正規表現をつかって記述すること（P135参照）
//【Mainクラス】
//	・メソッド
//		+ __main(args:String[]):戻り値の型 void 
//			・Account型のオブジェクトを生成する。
//			・ConsoleReader型のオブジェクトを生成する。
//			・暗証番号入力用の変数を宣言。
//			・tryブロック
//				・consoleReader#inputPIN()を呼び出し、変数に代入
//				・if[Account#getPin()==入力値]
//					・"認証しました"と出力
//					・Account#showAccount()を呼び出す
//				・else
//					・"暗証番号が違います"と出力
//			・catchブロック[IOException | IllegalInputException]
//				・e.printStackTrace()

//【出力例1】
//4ケタの暗証番号を入力して下さい
//input PIN? >>1234
//認証しました
//suzuki様の個人情報を表示します
//Account [name=suzuki, pin=****, balance=2000000]

//【出力例2】
//4ケタの暗証番号を入力して下さい
//input PIN? >>1111
//暗証番号が違います。

//【出力例3】
//4ケタの暗証番号を入力して下さい
//input PIN? >>1aA@,.
//day10.q1answer.IllegalInputException: 不正な入力:1aA@,.
//	at day10.q1answer.ConsoleReader.inputPIN(ConsoleReader.java:18)
//	at day10.q1answer.Main.main(Main.java:13)

package day10.q01;

public class Main {

	// ここから追記してください

}
