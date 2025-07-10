/*追加問題
冒険の旅に出ます。めざせパケモンマスター！！仲間のパケモンの種族名と評価を表示させます。
以下の条件を満たすクラスを作成しなさい
Pakemonクラス
	種族名　tribe_name
	個体値　individual_value
	をフィールドに持つ。型は自分で考えること。
	カプセル化も行う。


	コンストラクタ①(ソースタブのコンストラクターの生成機能を用いてもよい)
		引数：String型
		引数をフィールドに代入
		個体値は乱数を用いて１～３１までの値が入力されるようにする。
		種族名を出力する。
		evaluateメソッド(評価メソッド)をもつ。

	コンストラクタ②(ソースタブのコンストラクターの生成機能を用いてもよい)
		引数：int型
		引数をif文またはswitch文を用いて引数に応じて適切な名前が種族名に入るようにする。
		個体値は乱数を用いて１～３１までの値が入力されるようにする。（教科書P３１７を参考にしたり人に聞いたりしてもよい。）
		種族名を出力する。
		evaluateメソッド(評価メソッド)をもつ。

	evaluateメソッド（評価メソッド）
		引数なし、戻り値の型はvoid、修飾子はprivate
		個体値が1-15なら"この個体はまあまあ"
				16-30なら"この個体は素晴らしい"
				31なら"この個体は最高"
				それ以外は"不正な値です"
		を出力する。

Startクラス
	メインメソッド内でパケモンクラスを生成する。
	※引数がない状態での生成はできないことを確認する。

	コンソール入力で1-4の値を入力させ、
	・1-3の場合は数値を引数にし、数値に適合する名前のPakemonを生成する。
	・4の場合は名前をコンソール入力させ、名前を引数にPakemonを生成する。
	・それ以外の数値を入力した場合は、"パケモンの生成に失敗しました。"と表示させる。

【出力例①】
はじめまして！パケット　モンスターの　せかいへ　ようこそ！
わたしの　なまえは　オークダ　みんなからは　パケモンはかせと　したわれておるよ
この　せかいには　パケット　モンスター　とよばれる　いきもの　たちが　いたるところに　すんでいる！
その　パケモン　という　いきものを　ひとは　ペットにしたり　なんやかや...
さあ　きみも　パケモンを　てにいれて　たびだつのじゃ！
つぎのなかからパケモンをえらんでください
１　ビトカゲ
２　ゼヌガメ
３　フサギダネ
４　じぶんできめる

せんたくしてください＞1
種族名はビトカゲです。
この個体はまあまあです。

出力例②（中略）
つぎのなかからパケモンをえらんでください
１　ビトカゲ
２　ゼヌガメ
３　フサギダネ
４　じぶんできめる

せんたくしてください＞４
パケモンのなまえをにゅうりょくしてください
ビカチュー
種族名はビカチューです。
この個体は素晴らしい

*/

package other.pakemon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start_main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 引数がない状態ではnewできません。
		// Pakemon pakemon=new Pakemon();

		System.out.println(
				"はじめまして！パケット　モンスターの　せかいへ　ようこそ！\nわたしの　なまえは　オークダ　みんなからは　パケモンはかせと　したわれておるよ\nこの　せかいには　パケット　モンスター　とよばれる　いきもの　たちが　いたるところに　すんでいる！\nその　パケモン　という　いきものを　ひとは　ペットにしたり　なんやかや...\nさあ　きみも　パケモンを　てにいれて　たびだつのじゃ！");

		System.out.println("つぎのなかからパケモンをえらんでください\n１　ビトカゲ\n２　ゼヌガメ\n３　フサギダネ\n４　じぶんできめる");
		System.out.print("\nせんたくしてください＞");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nameNum = Integer.parseInt(br.readLine());
		if (nameNum >= 1 && nameNum <= 3) {
			Pakemon pakemon = new Pakemon(nameNum);
		} else if (nameNum == 4) {
			System.out.println("パケモンのなまえをにゅうりょくしてください");
			System.out.print(">");
			String pakemonName = br.readLine();
			Pakemon pakemon = new Pakemon(pakemonName);
		} else {
			System.out.println("パケモンの生成に失敗しました。");
		}

	}

}
