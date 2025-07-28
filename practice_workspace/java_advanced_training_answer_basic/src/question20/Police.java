package question20;

/**
 * 警察官クラス
 */
public class Police extends Worker {
	/**
     * コンストラクタ
     *
     * @param name 氏名
     * @param age 年齢
     */
    public Police(String name, int age) {
        super(Constant.POLICE, name, age);
    }

/*** 仕事内容の表示*/
    public void doWork() {
        System.out.println("地域や人々の安全を守ります。");
    }
}
