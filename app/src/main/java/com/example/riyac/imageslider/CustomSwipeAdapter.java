package com.example.riyac.imageslider;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class CustomSwipeAdapter extends PagerAdapter {
    int i[]={R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4};
    LayoutInflater layoutInflater;

    public CustomSwipeAdapter(Context context) {
        this.context = context;
    }

    Context context;
    @Override
    public int getCount() {
        return i.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.image, container, false);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
        imageView.setImageResource(i[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((LinearLayout)object);
    }
}
