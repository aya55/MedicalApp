package com.example.medicalapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter extends PagerAdapter {
    private Context mcomtect;
    private int[] images=new int[]{R.drawable.pro1,R.drawable.pro2,R.drawable.pro3,R.drawable.pro4,R.drawable.pro5};
    public ImageAdapter(Context mcomtect) {
        this.mcomtect = mcomtect; }



    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject( View view,  Object o) {
        return view==o;    }


    @Override
    public Object instantiateItem( ViewGroup container, int position) {
        ImageView imageView=new ImageView(mcomtect);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageResource(images[position]);
        container.addView(imageView,0);
        return imageView; }
    @Override
    public void destroyItem( ViewGroup container, int position,  Object object) {
        container.removeView((ImageView)object);
    }

}


