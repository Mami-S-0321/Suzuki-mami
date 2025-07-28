package question27;

import java.util.ArrayList;
import java.util.List;

public class Question27_02 {
	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();

		animals.add("イヌ");
		animals.add("クマ");
		animals.add("フクロウ");

		animals.remove(1);

		System.out.println("動物は" + animals + "がいます。");
	}
}