package com.example.label;

import java.util.ArrayList;

import com.example.label.FlowLayout.OnItemClickListrener;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	private ArrayList<String> pingjia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        pingjia = new ArrayList<String>();
        pingjia.add("welcome");
        pingjia.add("IT工程师");
        pingjia.add("挣钱ing");
        pingjia.add("i think i can");
        pingjia.add("标题栏textview");
        pingjia.add("点击事件");
        pingjia.add("显示到上面");
        pingjia.add("清楚");
        pingjia.add("明白易理解");
        pingjia.add("明白易理解111");
        pingjia.add("明白易理解22");
        pingjia.add("明白易理解33");
//        pingjia.addAll(JsonUtils.getBeanList(message.result,"Items", Pingjia.class));
        FlowLayout layout = (FlowLayout)findViewById(R.id.layou23);
        FlowAdapter adapter = new FlowAdapter(this, pingjia);
        layout.setAdapter(adapter);
        layout.setOnItemClickListrener(new OnItemClickListrener() {
			
			@Override
			public void onItemClick(ViewGroup parent, View v, int position) {
				// TODO Auto-generated method stub
//				Toast.makeText(getApplicationContext(), ((Button)v).getText().toString()+"------"+position, Toast.LENGTH_SHORT).show();
//				((Button)v).setBackgroundColor(Color.GRAY);
				
				if(((Button)v).isSelected()) {
					((Button)v).setSelected(false);
					checkList.remove(pingjia.get(position));
					checkSize --;
				} else {
					if(checkSize >= 5) {
						Toast.makeText(getApplicationContext(), checkList.toString(), Toast.LENGTH_SHORT).show();
//						Toast.makeText(getApplicationContext(), "最多选5个", Toast.LENGTH_SHORT).show();
						return;
					}
					((Button)v).setSelected(true);
					checkList.add(pingjia.get(position));
					checkSize++;
				}
				
			}
		});
        
    }

    private ArrayList<String> checkList = new ArrayList<String>();
    
    private int checkSize = 0;
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
