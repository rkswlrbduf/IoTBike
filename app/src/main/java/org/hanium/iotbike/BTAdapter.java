package org.hanium.iotbike;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BTAdapter extends RecyclerView.Adapter<BTAdapter.ViewHolder>{

    Context context;
    String[] mData;
    RecyclerView mRecyclerView;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;
        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView)v.findViewById(R.id.btlisttext);
        }
    }

    public BTAdapter(Context context, String[] Data) {
        this.context = context;
        mData = Data;
    }

    public BTAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.bluetooth_list,parent,false);
        mRecyclerView = (RecyclerView)parent;
        return new ViewHolder(v);
    }

    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Log.d("TAGG",mData[position].toString());
        holder.mTextView.setText(mData[position].toString());
    }

    public int getItemCount() {
        return mData.length;
    }
}
