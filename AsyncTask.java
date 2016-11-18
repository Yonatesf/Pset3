package com.example.yona.pset3;

import android.os.Bundle;

/**
 * Created by S on 18-11-2016.
 */

public class AsyncTask extends List {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


    }

    private class MyTask extends AsyncTask<String, Integer, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

        }

        @Override
        protected String doInBackground(String... params) {

            return;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate();

        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute();
        }
    }
    )
}
