package com.tony.android.virtualmuseum;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<CategoryItem> {
    public CategoryAdapter(Context context, ArrayList<CategoryItem> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.category_list_item, parent, false);
        CategoryItem currentCategoryItem = getItem(position);
        ImageView categoryImageView = convertView.findViewById(R.id.item_image_view);
        categoryImageView.setImageResource(currentCategoryItem.getImage());
        TextView categoryTextView = convertView.findViewById(R.id.item_text_view);
        categoryTextView.setText(currentCategoryItem.getName());

        return convertView;

        Intent i = new Intent(context, HistoryDetailActivity.class);
        i.putExtra()
    }
}
