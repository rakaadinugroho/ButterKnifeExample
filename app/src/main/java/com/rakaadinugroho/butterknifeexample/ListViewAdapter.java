package com.rakaadinugroho.butterknifeexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Raka Adi Nugroho on 1/12/17.
 *
 * @Github github.com/rakaadinugroho
 * @Contact nugrohoraka@gmail.com
 */

public class ListViewAdapter extends BaseAdapter {
    LayoutInflater mInflater;
    public ListViewAdapter(LayoutInflater mInflater){
        this.mInflater  = mInflater;
    }
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        View view   = mInflater.inflate(R.layout.list_item_row, parent, false);
        viewHolder  = new ViewHolder(view);

        viewHolder.itemTextView.setText("Hello, "+position);
        return view;
    }

    static class ViewHolder{
        @BindView(R.id.item_textview)
        TextView itemTextView;
        public ViewHolder(View view){
            ButterKnife.bind(this, view);
        }
    }
}
