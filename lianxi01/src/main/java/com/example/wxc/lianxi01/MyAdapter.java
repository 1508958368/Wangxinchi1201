package com.example.wxc.lianxi01;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import Bean.Student;

/**
 * author:Created by WangXinChi on 2017/12/1.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHoder> {
    private ArrayList<Student> mlist;
    private Context context;

    public MyAdapter(Context context,ArrayList<Student> mlist) {
        this.mlist = mlist;
        this.context = context;
        notifyDataSetChanged();
    }



    @Override
    public ViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHoder viewHoder = new ViewHoder(LayoutInflater.from(context).inflate(R.layout.item, parent, false));
        return viewHoder;
    }

    @Override
    public void onBindViewHolder(ViewHoder holder, int position) {

        Student student = mlist.get(position);
        holder.tv.setText(student.getUserName());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    class ViewHoder extends RecyclerView.ViewHolder{

        private final TextView tv;

        public ViewHoder(View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv);
        }
    }
}
