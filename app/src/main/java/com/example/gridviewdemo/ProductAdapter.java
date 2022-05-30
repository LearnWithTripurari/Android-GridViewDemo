package com.example.gridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductAdapter extends BaseAdapter {

    Context context;
    private final int[] images;
    private final String[] names;


    public ProductAdapter(Context context, int[] images, String[] names) {
        this.context = context;
        this.images = images;
        this.names = names;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View productLayout = layoutInflater.inflate(R.layout.product_card, null);

        ImageView imageView = productLayout.findViewById(R.id.imageView);
        TextView textView = productLayout.findViewById(R.id.textView);

        imageView.setImageResource(images[i]);
        textView.setText(names[i]);

        return productLayout;
    }
}
