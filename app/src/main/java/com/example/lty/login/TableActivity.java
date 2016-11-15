package com.example.lty.login;


        import java.util.ArrayList;
        import java.util.List;

        import android.app.Activity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.AdapterView.OnItemClickListener;
        import android.widget.ListView;
        import android.widget.Toast;


//MainActivity需要实现自定义接口
public class TableActivity extends Activity implements OnItemClickListener,
        DataAdapter.Callback {

    // 模拟listview中加载的数据
    private static final String[] CONTENTS = { "北京", "上海", "广州", "深圳", "苏州",
            "南京", "武汉", "长沙", "杭州" };
    private List<String> contentList;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        mListView = (ListView) findViewById(R.id.listview);
        contentList = new ArrayList<String>();
        for (int i = 0; i < CONTENTS.length; i++) {
            contentList.add(CONTENTS[i]);
        }
        //
        mListView.setAdapter(new DataAdapter(this, contentList, this));
        mListView.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     * 响应ListView中item的点击事件
     */
    @Override
    public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
        Toast.makeText(this, "listview的item被点击了！，点击的位置是-->" + position,
                Toast.LENGTH_SHORT).show();
    }

    /**
     * 接口方法，响应ListView按钮点击事件
     */
    @Override
    public void click(View v) {
        Toast.makeText(
                TableActivity.this,
                "listview的内部的按钮被点击了！，位置是-->" + (Integer) v.getTag() + ",内容是-->"
                        + contentList.get((Integer) v.getTag()),
                Toast.LENGTH_SHORT).show();
    }
}