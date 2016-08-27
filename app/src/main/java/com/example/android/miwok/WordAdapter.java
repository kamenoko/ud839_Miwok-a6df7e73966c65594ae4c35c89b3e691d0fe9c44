package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * (@link WordAdapter) is an (@link ArrayAdapter) that can provide the layout for each list
 * based on a data source, which is a list of (@link Word) objects.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = Word.class.getSimpleName();
    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> word, int colorResourceId) {
        super(context, 0, word);
        mColorResourceId = colorResourceId;
    }

    /**
     *
     * @param position
     * @param convertView
     * @param parent
     * @return
     * Get's the current view, checks and sees if it's in the listview, if it isn't,
     * it get's created.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Grab a reference to the current Word object, then display the values from it to
        // TextViews.
        Word currentWord = getItem(position);
        ImageView listImageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            listImageView.setImageResource(currentWord.getImageResourceID());
            listImageView.setVisibility(View.VISIBLE);
        } else {
            listImageView.setVisibility(View.GONE);
        }
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwak_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
