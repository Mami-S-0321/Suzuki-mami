package question19;

import java.util.HashMap;
import java.util.Map;

public class Question19_03 {
	public static void main(String[] args) {
		Map<String, Integer> fruitsMap = new HashMap<>();

		fruitsMap.put("orange", 100);
		fruitsMap.put("grape", 200);
		fruitsMap.put("strawberry", 300);

		System.out.println("みかんの価格は" + fruitsMap.get("orange") + "円です");
		System.out.println("ぶどうの価格は" + fruitsMap.get("grape") + "円です");
		System.out.println("いちごの価格は" + fruitsMap.get("strawberry") + "円です");
	}
}
