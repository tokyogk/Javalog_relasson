package jp.techacademy.gou.kuwabara.javalog_relasson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("GO", 38 , "スニーカー");     // 名前をGO、年齢38歳で、Humanのインスタンスを作る

        human.say();  // GOが自己紹介します。（ログ出力）
        human.think();  // GOが趣味を紹介します。（ログ出力）

    }

}