package com.vvit.myappcsed;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class MyAsyncTask extends AsyncTask<Void,Void,String> {

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

        try {
            JSONObject jsonObject = new JSONObject(s);
            JSONArray jsonArray = jsonObject.getJSONArray("results");
            for(int i=0;i<jsonArray.length();i++){
                JSONObject o = jsonArray.getJSONObject(i);
                Log.i("Result Object",o.toString());

            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
