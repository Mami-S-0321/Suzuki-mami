package question18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question18_01 {

	public static void main(String[] args) {
		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("今日の日付を表示します。");
		System.out.println(sdf.format(date));

	}

}
