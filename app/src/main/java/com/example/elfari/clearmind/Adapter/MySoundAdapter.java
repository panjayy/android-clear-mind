package com.example.elfari.clearmind.Adapter;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.elfari.clearmind.Models.MySound;
import com.example.elfari.clearmind.R;
import com.example.elfari.clearmind.*;

import java.util.List;

/**
 * Created by Elfari on 11/9/2017.
 */
public class MySoundAdapter extends RecyclerView.Adapter<MySoundAdapter.ViewHolder> {

    public List<MySound> mySounds;
    private MediaPlayer mp;

    public MySoundAdapter(List<MySound> mySounds) {
        this.mySounds = mySounds;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final MySound sound = mySounds.get(position);
        holder.pilihan.setImageResource(sound.getPilihan());
        holder.songName.setText(sound.getSongName());

        holder.pilihan.setTag(holder);
        holder.pilihan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                ViewHolder vholder = (ViewHolder) v.getTag();
                int position = vholder.getPosition();

                if (position == 0 && position<getItemCount()){
                    Intent x = new Intent(v.getContext(), SuaraLautActivity.class);
                    v.getContext().startActivity(x);
                }
                if (position == 1 && position<getItemCount()){
                    Intent x = new Intent(v.getContext(), SuaraHujanActivity.class);
                    v.getContext().startActivity(x);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return mySounds.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView pilihan;
        public TextView songName;


        public ViewHolder(View itemView) {
            super(itemView);
            songName = (TextView)itemView.findViewById(R.id.songName);
            pilihan = (ImageView) itemView.findViewById(R.id.pilihan);
        }
    }
}
