package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fujitsu on 03.06.2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link words} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current Word object and set the image to iconView
        imageView.setImageResource(currentWord.getmImageResourceId());

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the miwok translation from Word object and set this text on miwoxTranslation
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default translation from Word object and set this text on defaultTranslation
        defaultTextView.setText(currentWord.getDefaultTranslation());



        return listItemView;
    }





}

