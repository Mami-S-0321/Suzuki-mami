package question20;

/**
 * 料理人クラス
 */
public class Chef extends Worker {
	/**
     * コンストラクタ
     * @param name 氏名
     * @param age 年齢
     */
    public Chef(String name, int age) {
        super(Constant.CHEF, name, age);
    }

    /*** 仕事内容の表示*/
    public void doWork() {
        System.out.println("食事を作ります。");
    }
}
