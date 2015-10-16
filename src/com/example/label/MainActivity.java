package com.example.label;

import java.util.ArrayList;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.label.FlowLayout.OnItemClickListrener;


public class MainActivity extends ActionBarActivity {

	private ArrayList<String> data;
	private FlowLayout teacher_label;
	private ArrayList<String> checkList = new ArrayList<String>();
	private int checkSize = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teacher_label = (FlowLayout)findViewById(R.id.layou23);
        initTeacherLabel();
    }
    
    private void initTeacherLabel() {
		// TODO Auto-generated method stub
    	///测试数据
    	data = new ArrayList<String>();
    	data.add("welcome");
    	data.add("IT工程师");
    	data.add("挣钱ing");
    	data.add("i think i can");
    	data.add("标题栏textview");
    	data.add("点击事件");
    	data.add("显示到上面");
    	data.add("清楚");
    	data.add("明白易理解");
    	
    	//获取数据，创建item
    	FlowLayout layout = (FlowLayout)findViewById(R.id.layou23);
    	FlowAdapter adapter = new FlowAdapter(this, data);
    	teacher_label.setAdapter(adapter);
//        pingjia.addAll(JsonUtils.getBeanList(message.result,"Items", Pingjia.class));
        layout.setOnItemClickListrener(new OnItemClickListrener() {
			
			@Override
			public void onItemClick(ViewGroup parent, View v, int position) {
				// TODO Auto-generated method stub
				if(((Button)v).isSelected()) {
					((Button)v).setSelected(false);
					((Button)v).setTextColor(Color.BLACK);
					checkList.remove(data.get(position));
					checkSize --;
				} else {
					if(checkSize >= 5) {
//						Toast.makeText(getApplicationContext(), checkList.toString(), Toast.LENGTH_SHORT).show();
						Toast.makeText(getApplicationContext(), "最多选5个---"+ position, Toast.LENGTH_SHORT).show();
						return;
					}
					((Button)v).setSelected(true);
					((Button)v).setTextColor(Color.WHITE);
					checkList.add(data.get(position));
					checkSize++;
				}
			}
		});
	}
    
    
}
