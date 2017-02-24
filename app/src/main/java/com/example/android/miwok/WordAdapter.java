package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hassan on 23/02/2017.
 */

    class WordAdapter extends ArrayAdapter<Word> {
    /**
     * Constructor
     *
     * @param context activity where will be implemented
     * @param mList Object list of both words
     */
     WordAdapter(Context context, ArrayList<Word> mList) {
        super(context, 0, mList);
    }

    /**
     * {@inheritDoc}
     *
     * @param position
     * @param convertView
     * @param parent
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem = convertView;
        if(listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link mList} object located at this position in the list
        Word currentItem = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID item2
        TextView txt2 = (TextView) listItem.findViewById(R.id.item2);
        // Get the word Miwok from the current mList object and
        // set this text on the Miwok word TextView
        txt2.setText(currentItem.getWordMiwok());

        // Find the TextView in the list_item.xml layout with the ID item1
        TextView txt1 = (TextView) listItem.findViewById(R.id.item1);
        // Get the word English from the current mList object and
        // set this text on the English word TextView
        txt1.setText(currentItem.getWordEnglish());


        /**
         * @return return the item list with two TextView
         */
        return listItem;

    }
}
