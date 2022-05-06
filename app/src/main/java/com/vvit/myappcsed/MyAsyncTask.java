package com.vvit.myappcsed;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyAsyncTask extends AsyncTask<Void,Void,String> {
    private Activity activity;


    public MyAsyncTask(Activity activity) {
        this.activity = activity;
    }

    @Override
    protected String doInBackground(Void... urls) {
        String result="";
        try {
            result = NetworkUtils.getResponseFromHttpUrl();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        ArrayList<Movie> myMovieList = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(s);
            JSONArray jsonArray = jsonObject.getJSONArray("results");
            for(int i=0;i<jsonArray.length();i++){
                JSONObject o = jsonArray.getJSONObject(i);
                Log.i("Result Object",o.toString());
                Log.i("Movie Name:",o.getString("title"));
                Movie movie = new Movie();
                movie.setTitle(o.getString("title"));
                movie.setRelease_date(o.getString("release_date"));
                myMovieList.add(movie);
            }

            Intent intent = new Intent(activity,HomeScreen.class);
            intent.putExtra("myMovieList",myMovieList);
            activity.startActivity(intent);
            activity.finish();

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
