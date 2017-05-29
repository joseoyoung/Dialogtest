package kr.hs.emirim.joseoyoung.dialogtest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String[] itemArr={"오이카와 토오루","우시지마 와카토시","쿠로오 테츠로","스가와라 코우시"};
    Button butDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butDialog=(Button)findViewById(R.id.but_dialog);
        butDialog=(Button)findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("첫번째 다이얼로그");
        /*//dialog.setMessage("여기는 메시지를 쓰는 곳입니다.");
        dialog.setIcon(R.mipmap.ic_launcher);//기본 아이콘
        dialog.setItems(itemArr, null);
        dialog.setItems(itemArr, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                butDialog.setText(itemArr[i]);
            }
        });*/
        //라디오 버튼 목록
        dialog.setSingleChoiceItems(itemArr, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                butDialog.setText(itemArr[i]);
            }
        });
        //dialog.setPositiveButton("OK", null);
        dialog.show();
    }
}
