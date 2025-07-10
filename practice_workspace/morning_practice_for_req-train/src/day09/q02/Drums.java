package day09.q02;

public class Drums {

	private String maker;
	private String constitution;// ドラムの構成

	// Instrumentのコンストラクタを呼び出し
	public Drums(String maker) {
		this.constitution = "バスドラム・スネアドラム・タムタム・シンバルのセットです";
	}

	public void playMusic() {
		System.out.println(maker + "のドラムを演奏します。");
	}

	@Override
	public String toString() {
		return "Drums [constitution=" + constitution + ", maker=" + maker + "]";
	}

}
