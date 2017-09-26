package jp.techacademy.gou.kuwabara.javalog_relasson;

import android.util.Log;

class Dog extends Animal  implements Movable {
    // クラス変数
    static String to_jp = "犬";
    static String tree_jp = "テスト 犬";

    // メンバ変数
    String name;  // 名前
    int age;    // 年齢
    String place;    // 場所

    // コンストラクタ
    public Dog(String name, int age, String place) {
        this.name = name;
        this.age = age;
        this.place = place;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは犬クラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", this.place + this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }
}