package jp.co.sss.game;

/**
 * モグラクラス<br/>
 * モグラの機能をまとめたクラス
 *
 * @author SystemShared
 *
 */
public class Mole {

    /** モグラの名前 */
    private String name;

    /** モグラが現在いるマスを表す変数 */
    private int stayPoint;

    /** 叩かれたか判定するためのフラグ(叩かれた場合true)*/
    private boolean hitFlag;

    /**
     * 名前のゲッター
     *
     * @return モグラの名前
     */
    public String getName() {
        return name;
    }

    /**
     * 名前のセッター
     *
     * @param name モグラの名前
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * モグラ配置マスのゲッター
     *
     * @return モグラが配置されているマス
     */
    public int getStayPoint() {
        return stayPoint;
    }

    /**
     * モグラ配置マスのセッター
     *
     * @param stayPoint モグラを配置するマス
     */
    public void setStayPoint(int stayPoint) {
        this.stayPoint = stayPoint;
    }

    /**
     * 叩かれたか判定用フラグのゲッター
     *
     * @return 判定用フラグ
     */
    public boolean isHitFlag() {
        return hitFlag;
    }

    /**
     * 叩かれたか判定用フラグのセッター
     *
     * @param hitFlag 判定用フラグ
     */
    public void setHitFlag(boolean hitFlag) {
        this.hitFlag = hitFlag;
    }

    /**
     * メッセージ出力機能<br/>
     * 叩かれたかどうかに応じて<br/>
     * モグラがメッセージを出力する機能
     *
     */
    public void speak() {

        // 叩かれた時のメッセージ出力
        if (hitFlag) {
            System.out.println(name + ":「痛いモグ。。。」");

         // はずれた時のメッセージ出力
        } else {
            System.out.println(name + ":「はずれ！ ちゃんとねらうモグよ！」");
        }
    }
}
