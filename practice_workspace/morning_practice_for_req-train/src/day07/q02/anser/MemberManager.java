package day07.q02.anser;

public class MemberManager {

	private MemberManager() {// オブジェクト生成を禁止する
	}

	public static void show(Member[] list) {
		System.out.println("\nメンバー一覧を表示します");
		for (Member member : list) {
			member.show();
		}
	}

	public static void update(Member[] list, int id, String name) {
		System.out.println("\nID：" + id + "のメンバー名を" + name + "に更新します");
		for (Member member : list) {
			if (member.getId() == id) {
				member.setName(name);
				break;
			}
		}
	}

}
