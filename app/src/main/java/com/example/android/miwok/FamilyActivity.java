/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an ArrayList which will hold our list of words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("әpә","Father"));
        words.add(new Word("әṭa","Mother"));
        words.add(new Word("Angsi","Son"));
        words.add(new Word("Daughter","Tune"));
        words.add(new Word("Taachi","Older Brother"));
        words.add(new Word("Chalitti","younger brother"));
        words.add(new Word("Teṭe","Older Sister"));
        words.add(new Word("Kolliti","Younger Sister"));
        words.add(new Word("Ama","Grandmother"));
        words.add(new Word("Paapa","Grandfather"));

        // Create an ArrayAdapter to show only elements of a list that fit screen
        WordAdapter mArrayAdapter = new WordAdapter(this, words);
        // find the list layoutView in word_list xml file by id casting it and assign it to
        // the ListView object that we create it mListView
        ListView mListView = (ListView) findViewById(R.id.list);
        // set Adapter to mListView and pass in it tha ArrayAdapter that we have created
        mListView.setAdapter(mArrayAdapter);
    }
}
