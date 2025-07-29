package Question09;

public class Question09_03 {

	public static void main(String[] args) {
		int  point = 35;

		if ( point >= 80) {
			//80以上の場合
			System.out.println("テストの点数は優秀です");
		}else if(80 > 50){//80未満50以上の場合
			System.out.println("テストの点数は平均的です");
		}else if(50 >30){//50未満30以上の場合
			System.out.println("テストの点数が及第です");
		}else {
			System.out.println("赤点のため追試が必要です");
		}
		System.out.println("お疲れ様でした");

	}

}
