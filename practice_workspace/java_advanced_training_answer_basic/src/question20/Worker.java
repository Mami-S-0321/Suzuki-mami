package question20;

/**
 * 職業人クラス
 */
public abstract class Worker {
    /** 職業 */
    protected String job;

    /** 名前 */
    protected String name;

    /** 年齢 */
    protected int age;

    /**
     * 職業人を設定
     *
     * @param job 職業
     * @param name 名前
     * @param age 年齢
     */
    protected Worker(String job, String name, int age) {
        this.job = job;
        this.name = name;
        this.age = age;
    }

    /**
     * 自己紹介を表示
     */
    public void showIntroduction() {
        System.out.println("名前は" + name + "、年齢は" + age + "歳、職業は" + job + "です。");
    }

    /**
     * 仕事内容を表示
     */
    public abstract void doWork();
}
