package jp.co.sss.game;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Player {

    /** プレイヤーの名前 */
    private String name;

    /** プレイヤーが所持しているモグラ */
    private Mole mole;

    /** 0.0～1.0未満の乱数に対してかける数 */
    private final int INCREASE_NUM = 10;

    /** 乱数に対してわる数（0～3の剰余を求めるため） */
    private final int UPPER_LIMIT_NUM = 4;

    public void positioningMole() {

        // モグラの配置マス用変数
        int point;

        // ランダムに配置マスを取得する
        point = getRandomPoint();

        // そのモグラの配置マスとして登録する
        mole.setStayPoint(point);

    }

    public int selectStrikePoint() {

        // 入力準備
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 叩くマスの一次入力用変数
        String stirikePointStr = null;

        // 叩くマス用変数
        int strikePoint = 0;

        // 入力エラー時にくり返すか判定するフラグ
        boolean roopFlag = false;

        System.out.println("\n「叩くマスを選んでください 1～4(半角数字)」");

        do {
            // ループフラグを初期化
            roopFlag = false;

            System.out.print("\n>");

            try {
                // 標準入力
                stirikePointStr = br.readLine();

                // 整数に変換して格納する
                strikePoint = Integer.parseInt(stirikePointStr);

            // 整数が入力されなかった場合
            } catch (NumberFormatException e) {

                // ループフラグを立てる
                roopFlag = true;

            // それ以外の例外発生時の処理
            } catch (Exception e) {
                e.printStackTrace();
            }

            // ループフラグが立っている場合
            if (roopFlag) {

                // エラーメッセージを出力
                System.out.println("\n1～4(半角数字)のみ入力可能です。");

            // 入力値が1～4の範囲に収まっていない場合
            } else if (strikePoint < 1 || 4 < strikePoint) {

                // エラーメッセージを出力
                System.out.println("\n1～4(半角数字)のみ入力可能です。");

                // ループフラグを立てる
                roopFlag = true;
            }

            // ループフラグが立っている場合はくり返す
        } while (roopFlag);

        // 1～4の入力値を0～3に範囲に補正する
        strikePoint--;

        return strikePoint;
    }

    public int autoSelectStrikePoint() {

        // 叩くマスをランダムに取得する
        int strikePoint = getRandomPoint();

        return strikePoint;
    }

    public String getName() {

        // プレイヤーの名前を返す
        return name;
    }

    public void setName(String name) {

        // プレイヤーの名前を設定する
        this.name = name;
    }

    public Mole getMole() {

        // プレイヤーが所持しているモグラを返す
        return mole;
    }

    public void setMole (Mole mole) {

        // モグラを登録する
        this.mole = mole;
    }

    /**
     * マス決定機能（ランダム）<br/>
     * マスをランダムに決定する
     *
     * @return ランダムに取得されたマス
     */
    private int getRandomPoint() {

        // 乱数の格納用変数
        int point;

        // 乱数を0～3の範囲で取得
        point = (int) (Math.random() * INCREASE_NUM) % UPPER_LIMIT_NUM;

        return point;
    }
}
