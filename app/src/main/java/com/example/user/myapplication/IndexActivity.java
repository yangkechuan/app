package com.example.user.myapplication;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

/**
 * 使用接口方式完成监听事件
 */

public class IndexActivity extends Activity implements View.OnClickListener {

    private Button index_btn1;
    private EditText index_editText1;
    private ImageView index_imageView1;
    private ProgressBar index_progressBar1,index_progressBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        index_btn1 =(Button)findViewById(R.id.index_btn1);
        index_btn1.setOnClickListener(this);
        index_editText1 = (EditText) findViewById(R.id.index_editText1);
        index_editText1.setOnClickListener(this);
        index_imageView1 = (ImageView) findViewById(R.id.index_imageView1);
        index_imageView1.setOnClickListener(this);
        index_progressBar1 = (ProgressBar) findViewById(R.id.index_progressBar1);
        index_progressBar1.setOnClickListener(this);
        index_progressBar2 = (ProgressBar) findViewById(R.id.index_progressBar2);
        index_progressBar2.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.index_btn1 :
                String inputText = index_editText1.getText().toString();
                Toast.makeText(IndexActivity.this,inputText,Toast.LENGTH_SHORT).show();
                break;

            case R.id.index_imageView1://点击替换图片
                index_imageView1.setImageResource(R.drawable.ic_launcher);
                break;

            case R.id.index_progressBar1://点击取消进度条
                if (index_progressBar1.getVisibility() == View.GONE){
                    index_progressBar1.setVisibility(View.VISIBLE);
                }else {
                    index_progressBar1.setVisibility(View.GONE);
                }
                break;

            case R.id.index_progressBar2://点击进度条，增加数值
                int progress = index_progressBar2.getProgress();
                progress+=10;
                index_progressBar2.setProgress(progress);
                break;

            default:
                break;
        }
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_index, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}