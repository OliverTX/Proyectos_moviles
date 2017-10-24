package com.example.oliverrodriguez.a32consumodeserviciosweb;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ibm.watson.developer_cloud.android.library.audio.StreamPlayer;
import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

public class MainActivity extends AppCompatActivity {

    TextView titulo;
    EditText texto;
    Button botonsay;

    StreamPlayer streamPlayer;
    /*
    *
    * "url": "https://stream.watsonplatform.net/text-to-speech/api",
  "username": "a55ad439-fe9e-4e42-9c85-4676c34dd0f8",
  "password": "cbgWsVsI8Wdh"
    * */
    private TextToSpeech initTextToSpeechService(){
        TextToSpeech service = new TextToSpeech();
        String user = "a55ad439-fe9e-4e42-9c85-4676c34dd0f8";
        String pass = "cbgWsVsI8Wdh";
        service.setUsernameAndPassword(user,pass);
        return service;
    }
    private class WatsonTask extends AsyncTask<String,Void,String>{
        @Override
        protected String doInBackground(String... textToSpeak){
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    titulo.setText("Watson Corriendo");
                }
            });
            TextToSpeech textToSpeech = initTextToSpeechService();
            streamPlayer = new StreamPlayer();
            streamPlayer.playStream(textToSpeech.synthesize(String.valueOf(texto.getText()), Voice.ES_SOFIA).execute());

            return "  Finalizo Conversion de Texto";

        }
        @Override
        protected void onPostExecute(String resultado){
            titulo.setText("Estado:"+resultado);

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titulo = (TextView) findViewById(R.id.txt_titulo);
        texto = (EditText) findViewById(R.id.edt_texto);
        botonsay = (Button) findViewById(R.id.btn_say);
    }

    public void servicio (View view){
        titulo.setText("Texto:"+texto.getText());
        WatsonTask task = new WatsonTask();
                task.execute(new String[]{});

    }
}
