package com.example.label;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;

import com.example.label.R;

/**
 * 老师标签的数据适配器
 * 说明：
 * @author 51talk
 * @version 创建时间：2015-10-14  下午2:28:23
 */
public class FlowAdapter {
	
	private Context mContext;
	private ArrayList<String> data;
	
	public FlowAdapter(Context mContext, ArrayList<String> data) {
		super();
		this.mContext = mContext;
		this.data = data;
	}

	public int getCount() {
		return data == null ? 0 : data.size();
	}
	
	public void setData(ArrayList<String> data) {
		this.data = data;
	}
	
	public View getView(FlowLayout parent, int position) {
		// TODO Auto-generated method stub
        Button tvNav = new Button(mContext);
        tvNav.setBackgroundResource(R.drawable.teacher_label_selector);
        tvNav.setTextSize(14);
        tvNav.setPadding(20, 0, 20, 0);
        // tvNav.setWidth((int)Math.floor(Double.valueOf(a)));
        // tvNav.setHeight((int)Math.floor(Double.valueOf(b)));
        tvNav.setText(data.get(position));
        tvNav.setId(position);
        tvNav.setTag(false);
        tvNav.setTextColor(Color.BLACK);
        // tvNav.setGravity(Gravity.CENTER_HORIZONTAL);
        return tvNav;
	}
	
}
