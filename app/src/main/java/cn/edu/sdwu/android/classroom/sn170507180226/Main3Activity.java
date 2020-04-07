package cn.edu.sdwu.android.classroom.sn170507180226;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);

        RadioGroup radioGroup=(RadioGroup)findViewById(R.id.rg);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                //第2个参数代表当前选中的radiobutton的id
                RadioButton radioButton=(RadioButton) findViewById(i);
                Object object=radioButton.getTag();
                TextView textView=(TextView) findViewById(R.id.tishi1);
                if(object!=null&&object.toString().equals("1")){
                    textView.setText("right");
                }else{
                    textView.setText("wrong");
                }
            }
        });

    }
}
