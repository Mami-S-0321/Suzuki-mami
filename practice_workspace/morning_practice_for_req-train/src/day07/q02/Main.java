//追加問題 

//パッケージ名 day7.q2
//クラス名1 Member.java 会員クラス
//クラス名2 MemberManager.java 会員を操作するクラス
//クラス名3 Main.java オブジェクト生成し、プログラムを実行するクラス

//会員のオブジェクトを生成し、情報を表示、変更します
//Dataクラスのstaticメソッドを利用し会員オブジェクトを操作しなさい

//以下の条件を満たすクラスを作成しなさい。
//※「+」はpublic、「-」はprivate、「__」はstaticメンバを表す
//【Memberクラス】
//	・フィールド
//		- id:int
//		- name:String
//	・コンストラクタ（Eclipseの機能を用いて生成してもよい）
//		+ Member(id:int, name:String)  
//			・フィールドid,nameに引数の値を代入する
//	・メソッド
//		+ show():戻り値の型 void 
//			・会員情報としてフィールドの内容を表示します
//		+ 各フィールドのsetter,getter(Eclipseの機能を用いて生成してもよい)
//【MemberManagerクラス】
//	・コンストラクタ（Eclipseの機能を用いて生成してもよい）
//		- MemberManager()  
//			・MemberManagerオブジェクト生成を不可にする
//	・メソッド
//		+ __show(list:Member[]):戻り値の型 void 
//			・"メンバー一覧を表示します"とコンソール上に表示
// 			・listから拡張for文でオブジェクトを取得しつつ、Member#show()を呼び出す。
//		+ __update(list:Member[], id:int, name:String):戻り値の型 void 
//			・"ID：" + id + "のメンバー名を" + name + "に更新します"とコンソール上に表示
// 			・listから拡張for文でオブジェクト取得しつつ、IDが一致したメンバーの名前を変更する
// 				※ヒント:ID比較は (member.getId() == id)のように比較する
//【Mainクラス】
//	・メソッド
//		+ __main(args:String[]):戻り値の型 void 
//			・要素数3のMember型の配列を宣言します
//			・生成したMemberオブジェクト（コンストラクタ引数：1,"人見"）を配列要素0番目に代入します
//			・生成したMemberオブジェクト（コンストラクタ引数：2,"植木"）を配列要素0番目に代入します
//			・生成したMemberオブジェクト（コンストラクタ引数：3,"吉崎"）を配列要素0番目に代入します
//		 	・MemberManager.show()を呼び出す
// 			・MemberManager.update()を呼び出し、ID：1のメンバー名を"三浦"に変更する
// 			・再度MemberManager#show()を呼び出す

//【出力例】
//メンバー一覧を表示します
//1:人見
//2:植木
//3:吉崎
//
//ID：1のメンバー名を三浦に更新します
//
//メンバー一覧を表示します
//1:三浦
//2:植木
//3:吉崎

/*質問
 *	クラスメソッドはインスタンスメソッドと何が違いますか？
 *	staticキーワードの使用例を上げてください
 *	更新はDataクラスで行っているのにMainクラスで呼び出しているshowメソッドに反映されているのはなぜですか？
 * */

package day07.q02;

public class Main {

	public static void main(String[] args) {
		/*ここから記入*/

	}

}
