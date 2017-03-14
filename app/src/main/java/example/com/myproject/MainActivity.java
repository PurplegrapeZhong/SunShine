package example.com.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView hotMovie_tv;
    private TextView stock_tv;
    private TextView reader_tv;
    private TextView news_tv;
    private TextView graduation_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    public void initUI(){

        hotMovie_tv = (TextView) findViewById(R.id.hotMovie_tv);
        stock_tv = (TextView) findViewById(R.id.stock_tv);
        reader_tv = (TextView) findViewById(R.id.reader_tv);
        news_tv = (TextView) findViewById(R.id.news_tv);
        graduation_tv = (TextView) findViewById(R.id.graduation_tv);

        hotMovie_tv.setOnClickListener(this);
        stock_tv.setOnClickListener(this);
        reader_tv.setOnClickListener(this);
        news_tv.setOnClickListener(this);
        graduation_tv.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.hotMovie_tv:

                Toast.makeText(MainActivity.this,"热门电影",Toast.LENGTH_SHORT).show();
                break;
            case R.id.stock_tv:
                Toast.makeText(MainActivity.this,"股票雄鹰",Toast.LENGTH_SHORT).show();

                break;
            case R.id.reader_tv:
                Toast.makeText(MainActivity.this,"XYZ 阅读器",Toast.LENGTH_SHORT).show();

                break;

            case R.id.news_tv:
                Toast.makeText(MainActivity.this,"最新闻",Toast.LENGTH_SHORT).show();

                break;

            case R.id.graduation_tv:

                Toast.makeText(MainActivity.this,"毕业设计",Toast.LENGTH_SHORT).show();

                break;

            default:
                break;
        }
    }



}

