package day09.q02;

public class Piano {

	private String maker;
	private double weight;

	public Piano(String maker) {

		this.maker = maker;
		weight = 80.5;
	}

	@Override
	public String toString() {
		return "Piano [weight=" + weight + ", maker=" + maker + "]";
	}

	public void playMusic() {
		System.out.println(maker + "のピアノを弾きます。");

	}

}
