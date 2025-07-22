package question12;

public class Question12_01 {

	public static void main(String[] args) {
		// 2つの口座オブジェクトを生成
		 Bank SampleTaro = new Bank(10000);
		 Bank TestHanako = new Bank(8000);

		 // 入金処理
		 SampleTaro.deposit(7000);
		 TestHanako.deposit(25000);

		 // 口座情報を出力
		 System.out.println("全ての口座の合計金額: " + Bank.getTotalBalance());
		 System.out.println("サンプル太郎さんの口座: " + SampleTaro.getBalance());
		 System.out.println("テスト花子さんの口座: " + TestHanako.getBalance());
		 }


}
