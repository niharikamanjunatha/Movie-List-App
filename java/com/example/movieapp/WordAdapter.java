package com.example.movieapp;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import com.squareup.picasso.Picasso;


import java.util.ArrayList;
import java.util.Objects;

public class WordAdapter extends ArrayAdapter<Word> {
    ArrayList<Word> words;
    Context context;
    int resource;

    public WordAdapter(Context context, ArrayList<Word> words)
    {

        super(context, 0,words);
        this.words = words;
        this.context = context;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the vie
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            assert layoutInflater != null;
            convertView = layoutInflater.inflate(
                    R.layout.items_list, parent, false);
        }

        Word currentWord = getItem(position);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageview);
        assert currentWord != null;
        Picasso.get().load(currentWord.getImageUrl()).into(imageView);

        TextView movieTextView = (TextView) convertView.findViewById(R.id.moviename);
        movieTextView.setText(currentWord.getName());

        return convertView;
    }
}
