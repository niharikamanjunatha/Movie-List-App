package com.example.movieapp;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public final class ParsedJson  {
    private static final String SampleResponse = "https://velmm.com/apis/volley_array.json";

    private ParsedJson(){
    }


   public static ArrayList<Word> extractWords() {
       ArrayList<Word> words = new ArrayList<>();

       try {
           JSONObject JO = new JSONObject(SampleResponse);
           JSONArray JA = JO.getJSONArray("");
           for (int i = 0; i < JA.length(); i++) {
               JSONObject movies = JA.getJSONObject(i);
               String image = movies.getString("image");
               String name = movies.getString("title");

               Word word = new Word(image, name);
               words.add(word);
           }
       } catch (JSONException e) {
           e.printStackTrace();
       }

       return words;
   }
}
