package com.example.cjcu.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CityAdapter extends BaseAdapter{
    private LayoutInflater inflater;
    private String[][] data;

    static class ViewHolder{
        LinearLayout layout;
        TextView name;
        TextView address;
    }

    public CityAdapter(String[][] data,LayoutInflater inflater)
    {
        this.inflater=inflater;
        this.data=data;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null)
        {
            convertView = inflater.inflate(R.layout.templayout,null);

            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.tv_name);
            holder.address = (TextView) convertView.findViewById(R.id.tv_address);
            holder.layout = (LinearLayout) convertView.findViewById(R.id.CJCULayout);

            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }

        if(data[position][0].equals("1"))
        {
            holder.name.setText("Ω");
        }
        else
        {
            holder.name.setText("");
        }

        holder.address.setText(data[position][1]);

        return convertView;
    }
}
