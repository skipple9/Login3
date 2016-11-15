package com.example.lty.login;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class SecondActivity extends Activity {
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TableLayout  tableLayout = (TableLayout)findViewById(R.id.TableLayout1);
        //全部列自动填充空白处
        tableLayout.setStretchAllColumns(true);
        //生成10行，8列的表格
        for(int row=0;row<10;row++)
        {
            TableRow tableRow=new TableRow(this);
            for(int col=0;col<8;col++)
            {
                //tv用于显示
                TextView tv=new TextView(this);
                tv.setText("("+col+","+row+")");
                tableRow.addView(tv);
            }
            //新建的TableRow添加到TableLayout
            tableLayout.addView(tableRow, new TableLayout.LayoutParams(FP, WC));
        }




    }


}
