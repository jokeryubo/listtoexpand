package com.example.exapmples;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity implements View.OnClickListener{
    private ListView listView1,listView2,listView3;
    private ImageView img1,img2,img3;
    private TextView textview1 ,textview2,textview3;
    private RelativeLayout relative1,relative2,relative3;
    private List<String> list=new ArrayList<String>();
    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        listView1= (ListView) findViewById(R.id.list1);
        listView2= (ListView) findViewById(R.id.list2);
        listView3= (ListView) findViewById(R.id.list3);
        img1= (ImageView) findViewById(R.id.img1);
        img2= (ImageView) findViewById(R.id.img2);
        img3= (ImageView) findViewById(R.id.img3);
        textview1= (TextView) findViewById(R.id.textview1);
        textview2= (TextView) findViewById(R.id.textview2);
        textview3= (TextView) findViewById(R.id.textview3);
        relative1= (RelativeLayout) findViewById(R.id.relative1);
        relative2= (RelativeLayout) findViewById(R.id.relative2);
        relative3= (RelativeLayout) findViewById(R.id.relative3);
        relative1.setOnClickListener(this);
        relative2.setOnClickListener(this);
        relative3.setOnClickListener(this);

        for (int i =0 ; i < 5 ; i++){
            list.add("item"+i);
        }
        adapter =new MyAdapter(this,list);
        listView1.setAdapter(adapter);
        listView2.setAdapter(adapter);
        listView3.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                click1(parent,view ,position);
            }
        });
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                click2(parent,view ,position);
            }
        });
        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                click3(parent,view ,position);
            }
        });
    }

    private int clickposition1 =-1 ,clickposition2 =-1,clickposition3 =-1;
    private void click1(AdapterView<?> parent, View view, int position){
        RadioButton rb = (RadioButton) view.findViewById(R.id.rd);
        if (rb != null) {
            rb.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.enlarge_out));
            if (clickposition1 == position){
                if (rb.isChecked()){
                    rb.setChecked(false);
                    Toast.makeText(this,"取消第"+position+"项",Toast.LENGTH_SHORT).show();
                } else{
                    rb.setChecked(true);
                    Toast.makeText(this,"选中第"+position+"项",Toast.LENGTH_SHORT).show();
                }

            }
            else{
                clickposition1 = position;
                rb.setChecked(true);
                Toast.makeText(this,"选中第"+position+"项",Toast.LENGTH_SHORT).show();
                for (int i = 0; i < parent.getChildCount(); i++) {
                    if (i != position) {
                        View v = parent.getChildAt(i);
                        if (v != view) {
                            RadioButton iv2 = (RadioButton) v
                                    .findViewById(R.id.rd);
                            iv2.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.small_out));
                            iv2.setChecked(false);
                        }else{
                            rb.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.enlarge_out));
                            rb.setChecked(false);
                        }
                    }
                }
            }
        }
    }
    private void click2(AdapterView<?> parent, View view, int position){
        RadioButton rb = (RadioButton) view.findViewById(R.id.rd);
        if (rb != null) { //类似ExpandableListView的组件，加入一些动画，让它用起来更漂亮
            rb.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.enlarge_out));
            if (clickposition2 == position){
                if (rb.isChecked()){
                    rb.setChecked(false);
                    Toast.makeText(this,"取消第"+position+"项",Toast.LENGTH_SHORT).show();
                } else{
                    rb.setChecked(true);
                    Toast.makeText(this,"选中第"+position+"项",Toast.LENGTH_SHORT).show();
                }
            }
            else{
                clickposition2 = position;
                rb.setChecked(true);
                Toast.makeText(this,"选中第"+position+"项",Toast.LENGTH_SHORT).show();
                for (int i = 0; i < parent.getChildCount(); i++) {
                    if (i != position) {
                        View v = parent.getChildAt(i);
                        if (v != view) {
                            RadioButton iv2 = (RadioButton) v
                                    .findViewById(R.id.rd);
                            iv2.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.small_out));
                            iv2.setChecked(false);
                        }else{
                            rb.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.enlarge_out));
                            rb.setChecked(false);
                        }
                    }
                }
            }
        }
    }
    private void click3(AdapterView<?> parent, View view, int position){
        RadioButton rb = (RadioButton) view.findViewById(R.id.rd);
        if (rb != null) {
            rb.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.enlarge_out));
            if (clickposition3 == position){
                if (rb.isChecked()){
                    rb.setChecked(false);
                    Toast.makeText(this,"取消第"+position+"项",Toast.LENGTH_SHORT).show();
                } else{
                    rb.setChecked(true);
                    Toast.makeText(this,"选中第"+position+"项",Toast.LENGTH_SHORT).show();
                }
            }
            else{
                clickposition3 = position;
                rb.setChecked(true);
                Toast.makeText(this,"选中第"+position+"项",Toast.LENGTH_SHORT).show();
                for (int i = 0; i < parent.getChildCount(); i++) {
                    if (i != position) {
                        View v = parent.getChildAt(i);
                        if (v != view) {
                            RadioButton iv2 = (RadioButton) v
                                    .findViewById(R.id.rd);
                            iv2.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.small_out));
                            iv2.setChecked(false);
                        }else{
                            rb.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.enlarge_out));
                            rb.setChecked(false);
                        }
                    }
                }
            }
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.relative1:
                getListViewVisiable(listView1 ,img1);
                setVisiable(listView2 ,img2);
                setVisiable(listView3 ,img3);
                break;
            case R.id.relative2:
                getListViewVisiable(listView2 ,img2);
                setVisiable(listView1 ,img1);
                setVisiable(listView3 ,img3);
                break;
            case R.id.relative3:
                getListViewVisiable(listView3 ,img3);
                setVisiable(listView2 ,img2);
                setVisiable(listView1 ,img1);
                break;
        }
    }
    public void getListViewVisiable(ListView listView  ,ImageView img){
        if (listView.getVisibility() == View.GONE){
            expand(listView ,img);
        }else if (listView.getVisibility() == View.VISIBLE){
            unexpand(listView ,img);
        }
    }
    public void setVisiable(ListView listView ,ImageView img){
        if (listView.getVisibility() == View.VISIBLE){
            unexpand(listView ,img);
        }
    }
    /**
     * 展开
     */
    public void expand(final ListView listView  ,ImageView img) {
        final int targtetHeight = getListViewHeightBasedOnChildren(listView);
        Log.d("targtetHeight" , targtetHeight+"");
        listView.setVisibility(View.VISIBLE);
        listView.getLayoutParams().height = 0;
        Animation a = new Animation() {
            @Override
            protected void applyTransformation(float interpolatedTime,
                                               Transformation t) {

                listView.getLayoutParams().height = interpolatedTime == 1 ? ViewGroup.LayoutParams.WRAP_CONTENT
                        : (int) (targtetHeight * interpolatedTime);
                listView.requestLayout();
            }

            @Override
            public boolean willChangeBounds() {
                return true;
            }
        };
        // 1dp/ms
        a.setDuration(500);
        listView.startAnimation(a);
        Animation anim= AnimationUtils.loadAnimation(this,R.anim.rotate);
        anim.setFillAfter(true);
        img.startAnimation(anim);
    }

    /**
     * 收起
     * @param listView
     */
    public void unexpand(final ListView listView ,ImageView img){
        final int initialHeight =listView. getMeasuredHeight();

        Animation a = new Animation() {
            @Override
            protected void applyTransformation(float interpolatedTime,
                                               Transformation t) {
                if (interpolatedTime == 1) {
                    listView.setVisibility(View.GONE);
                    listView.getLayoutParams().height= initialHeight;
                } else {
                    listView.getLayoutParams().height = initialHeight
                            - (int) (initialHeight * interpolatedTime);
                    listView.requestLayout();
                }
            }

            @Override
            public boolean willChangeBounds() {
                return true;
            }
        };

        // 1dp/ms
        a.setDuration(500);
        listView.startAnimation(a);
        Animation anim= AnimationUtils.loadAnimation(this,R.anim.roatate1);
        img.startAnimation(anim);
    }

    /*
	 * 动态设置ListView的高度
	 *
	 * */
    public int getListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return 0;
        }
        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }
        return totalHeight  + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
    }
}
