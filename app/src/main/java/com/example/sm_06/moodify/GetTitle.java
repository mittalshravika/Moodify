package com.example.sm_06.moodify;

/**
 * Created by HP on 19-08-2017.
 */

import android.os.AsyncTask;

import com.google.firebase.storage.StorageReference;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

public class GetTitle extends AsyncTask<String, Void, String>{

    public String getTitile(String videoId) throws IOException
    {
        String json;
        String titile=null;

        HttpClient Client = new DefaultHttpClient();

        try{

            HttpGet httpget =     new HttpGet("https://www.googleapis.com/youtube/v3/videos?id=" + videoId + "&key="+ Config.YOUTUBE_API_KEY + "&part=snippet");
            ResponseHandler<String> responseHandler  =     new BasicResponseHandler();
            json = Client.execute(httpget, responseHandler);

            JSONObject object  = new JSONObject(json);

            JSONObject obj = object.getJSONObject("data");

            titile = obj.getString("title");


        } catch (ClientProtocolException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return titile;
    }

    @Override
    protected String doInBackground(String... params) {
        return null;
    }
}