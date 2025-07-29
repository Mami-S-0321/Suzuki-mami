package Question28;

public class Question28_02 {

	public static void main(String[] args) {
		int num;
        num = 5 * 6;
        int messageNo = 0;
        String str[] = {    "30以上50未満", "25以上30未満"    };

        if (messageNo == 0) {
            if (num >= 30 && num < 50) {
                System.out.println(str[messageNo]);
            }
        } else if (messageNo == 1) {
            if (num >= 25 && num < 30) {
                System.out.println(str[messageNo]);
            }
        }

        System.out.println("処理を終了します");

	}

}
