package com.example.lty.login;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import junit.framework.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ThreeActivity extends AppCompatActivity {
    private ListView list = null;
    private List<Test> data;
    private ListView mListView;
    // private ShoppingCartAdapter adapter;

    private RelativeLayout rlRefresh;
    private TextView tvRefresh;
    private ProgressBar barRefresh;
    private LinearLayout clear;
    private CheckBox checkBox_select_all;
    private CheckBox checkBox_add;
    private TextView integral_sum;
    private int sum = 0;
    private int[] sumIntegral;
    private Context context;
    boolean u_checked=false;
    Button show;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    // public ThreeActivity(List<Test> data) {
    //   this.data = data;
    // }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /*
        show = (Button)findViewById(R.id.show);
        u_checked=false;


        show.setOnClickListener(


                new View.OnClickListener() {

            @Override

            public void onClick(View v) {



                if(u_checked==true)
                    u_checked=false;
                else
                    u_checked=true;



                //list.getAdapter();

             // for(int j=0 ;j<list.getCount();j++)
             // {
                 //   (CheckBox)view.findViewById(R.id.list_select);
                 //'Object ss=    list.getItemAtPosition(j);

          //  }

                /*
                listItemID.clear();
                for(int i=0;i<adapter.mChecked.size();i++){
                    if(adapter.mChecked.get(i)){
                        listItemID.add(i);
                    }
                }

                if(listItemID.size()==0){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(ThreeActivity.this);
                    builder1.setMessage("没有选中任何记录");
                    builder1.show();
                }else{
                    StringBuilder sb = new StringBuilder();

                    for(int i=0;i<listItemID.size();i++){
                        sb.append("ItemID="+listItemID.get(i)+" . ");
                    }
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(MainActivity.this);
                    builder2.setMessage(sb.toString());
                    builder2.show();
                }

            }
        });

   */



        // ontext = this;
        //showpage = 1;
        // isPermitFlag = true;
        data = new ArrayList<Test>();
        // 测试数据
        //     data.add(new Test("id", "color", "type", "100"));
        //   data.add(new Test("id", "color", "type", "200"));
        //  data.add(new Test("id", "color", "type", "300"));
        // data.add(new Test("id", "color", "type", "0"));
        // data.add(new Test("id", "color", "type", "300"));
        //  data.add(new Test("id", "color", "type", "100"));
        //  data.add(new Test("id", "color", "type", "500"));
        //   data.add(new Test("id", "color", "type", "0"));
        //  data.add(new Test("id", "color", "type", "900"));


        // adapter = new ShoppingCartAdapter(context, handler, data);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        list = (ListView) findViewById(R.id.ListView1);
        //组织数据源
        List<HashMap<String, Object>> mylist = new ArrayList<HashMap<String, Object>>();
        for (int i = 0; i < 10; i++) {
            HashMap<String, Object> map = new HashMap<String, Object>();

            if(i%2==0)
                 map.put("isSelected", true);
            else
                 map.put("isSelected", false);
            map.put("itemTitle", "This is Title"+i);
            map.put("itemText", "This is text"+i);
            mylist.add(map);
        }
        //配置适配器
      //  SimpleAdapter adapter = new SimpleAdapter(this,
            //    mylist,//数据源
            //    R.layout.three_item,//显示布局
            //    new String[]{"itemTitle", "itemText"}, //数据源的属性字段
            //    new int[]{R.id.itemTitle, R.id.itemText}); //布局里的控件id
        //添加并且显示


        SimpleAdapter adapter2 = new SimpleAdapter(this,mylist,R.layout.three_item,new String []{"isSelected","itemTitle", "itemText"},new int[]

                {R.id.checkBox,R.id.itemTitle,R.id.itemText})

        {



            @Override
            public View getView(final int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                ViewHolder viewHolder;

                viewHolder = new ViewHolder();

                convertView = LayoutInflater.from(ThreeActivity.this).inflate(R.layout.three_item, null);
                viewHolder.layout = (LinearLayout)convertView.findViewById(R.id.myListItem);
                viewHolder.textView = (TextView)convertView.findViewById(R.id.textView);
                viewHolder.checkBox = (CheckBox)convertView.findViewById(R.id.checkBox);


                final HashMap<String,Object> map = (HashMap<String, Object>) this.getItem(position);

                CheckBox checkBox = (CheckBox)view.findViewById(R.id.checkBox);
                checkBox.setChecked((Boolean) map.get("isSelected"));

                /*

                //获取相应View中的Checkbox对象


                */
                //添加单击事件,在map中记录状态
                //通过判断checkbox是否被选中来确定联系人是否被放在names和numbers两个数组中。



                checkBox.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int j=0;
                        map.put("isSelected", ((CheckBox)view).isChecked());
                        if(((CheckBox)view).isChecked()){
                            Toast.makeText(ThreeActivity.this,"选中了"+ map.get("itemTitle"), Toast.LENGTH_LONG).show();
                           // names.add((String) map.get("name"));
                           // numbers.add((String) map.get("number"));
                        }else{

                            j=j+1;

                        //    names.remove(map.get("name"));
                           // numbers.remove(map.get("number"));
                        }

                    }
                });



                return view;
            }


            class ViewHolder{
                LinearLayout layout;
                TextView textView;
                CheckBox checkBox;
            }






        };






        list.setAdapter(adapter2);







        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent1, View view,
                                    int position, long id) {

              //Toast.makeText(parent1.getContext(), "这是一个提示", Toast.LENGTH_SHORT).show();

              //  Toast.makeText(context, "这是一个提示", Toast.LENGTH_SHORT).show();

              //  Toast.makeText(parent1, position + "", Toast.LENGTH_LONG)
                     //   .show();

               // Toast.makeText(context, "请选择商品数量", Toast.LENGTH_LONG)
                  //      .show();

                //int pos = position - 1;





               // HashMap<String, Object> item=(HashMap<String, Object>)
               //       parent1.getItemAtPosition(position);


                //TextView username = (TextView) view.findViewById(R.id.itemTitle);






            //    String item1=item.get("itemTitle").toString();

                Toast.makeText(getApplicationContext(),"123", Toast.LENGTH_SHORT).show();


                /*
             //   int num=item.
             //   int item=0;
                int num=position;




                //    ViewHolder viewHolder = (ViewHolder) view.getTag();
            // int num = data.get(pos).getNum();
               // int num = 0;
                if (num == 0) {
                    Toast.makeText(context, "请选择商品数量", Toast.LENGTH_LONG)
                            .show();
                } else {

                }

                */
            }
        });





        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Three Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.lty.login/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Three Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.lty.login/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}

