package com.study.newapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText("hello Android");
        //타입이 맞지 않으니 캐스팅을 해줘야한다.

//        //화면 요소에 접근하기
//        // 1 요소  타입 선언 - 레이아웃.xml 파일을 text모드로 보면
//        //                     해당 요소의 제일 첫 단어가 타입
//        // 2 findViewById(R.id.아이디)로 해당 요소를 찾아서 할당
//        // 3 찾은 요소를 타입에 맞게 캐스팅
//        Button btn = (Button) findViewById(R.id.button);
//        // 주의! Textview나 Button을 만들고 이걸 써먹어야 한다.
//        // 4. 버튼의 경우 클릭 같은 이벤트를 감지하기 위해서 리스너라는 것을 달아야한다.
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { // 5. 버튼이 클릭되면 onClick 함수를 호출한다.
//                changeText();
//            }
//        });
    // 자바로 하는 방법 1 -> 객체를 생성하며 인자로 넘겨줌
    // XML 로 하는 방법 2 -> 디자인 탭에 들어가서 아래에 만들어둔 메소드를 넘겨버리면 된다.
    }
    // 1. 뷰 요소에서 함수를 호출하기 위해서는
    // 2. 파라미터에 View를 선언해 주어야한다.
    public void changeText(View v) {
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(BuildConfig.MYURL);
    }
}