package com.example.oliverrodriguez.a31consumodeserviciosweb;

import android.os.AsyncTask;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by oliverrodriguez on 10/10/17.
 */

public class Clima extends AsyncTask<String,Void,String> {


    @Override
    protected String doInBackground(String... urls) {
        String resultado="";
        URL url;
        HttpURLConnection urlConnection=null;
        try {
            url= new URL(urls[0]);
            urlConnection = (HttpURLConnection) url.openConnection();

            InputStream in = urlConnection.getInputStream();
            InputStreamReader reader = new InputStreamReader(in);
            int data = reader.read();

            while (data != -1){
                char current = (char) data;
                resultado+= current;
                data= reader.read();
            }
            return resultado;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);



        try {

            JSONObject jsonObject = new JSONObject(s);

            JSONObject weatherData = new JSONObject(jsonObject.getString("main"));

            Double temperatura = Double.parseDouble(weatherData.getString("temp"));
            int temperaturaInt = (int) (temperatura * 1.8-459.67);
            String ciudad = weatherData.getString("name");
            MainActivity.txtClima.setText("Hola mundo");
            //MainActivity.txtClima.setText("Temperatura:"+temperaturaInt+"\n Ciudad:"+ciudad);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
