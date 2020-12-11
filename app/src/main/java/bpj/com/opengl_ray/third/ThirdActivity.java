package bpj.com.opengl_ray.third;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import bpj.com.opengl_ray.R;
import bpj.com.opengl_ray.third.widget.DouyinView;
import bpj.com.opengl_ray.third.widget.RecordButton;

public class ThirdActivity extends AppCompatActivity {

    DouyinView douyinView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        douyinView = findViewById(R.id.douyinView);

        RecordButton recordButton = findViewById(R.id.btn_record);
        recordButton.setOnRecordListener(new RecordButton.OnRecordListener() {
            /**
             * 开始录制
             */
            @Override
            public void onRecordStart() {
                douyinView.startRecord();
            }

            /**
             * 停止录制
             */
            @Override
            public void onRecordStop() {
                douyinView.stopRecord();
            }
        });
        RadioGroup radioGroup = findViewById(R.id.rg_speed);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            /**
             * 选择录制模式
             * @param group
             * @param checkedId
             */
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_extra_slow: //极慢
                        douyinView.setSpeed(DouyinView.Speed.MODE_EXTRA_SLOW);
                        break;
                    case R.id.rb_slow:
                        douyinView.setSpeed(DouyinView.Speed.MODE_SLOW);
                        break;
                    case R.id.rb_normal:
                        douyinView.setSpeed(DouyinView.Speed.MODE_NORMAL);
                        break;
                    case R.id.rb_fast:
                        douyinView.setSpeed(DouyinView.Speed.MODE_FAST);
                        break;
                    case R.id.rb_extra_fast: //极快
                        douyinView.setSpeed(DouyinView.Speed.MODE_EXTRA_FAST);
                        break;
                }
            }
        });
    }
}
