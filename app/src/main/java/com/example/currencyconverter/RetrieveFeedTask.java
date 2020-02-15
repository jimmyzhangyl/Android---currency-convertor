package com.example.currencyconverter;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class RetrieveFeedTask extends AsyncTask<Void, Void,String> {
    private Exception exception;

    protected void onPreExecute(){

    }

    @Override
    protected String doInBackground(Void... urls) {
        //catch two selections
        String baseCurrency, targetCurrency;

        try {
            URL url = new URL(FIll in URLS);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            try{
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                //extract the income data
                while ((line = bufferedReader.readLine()) != null){
                    stringBuilder.append(line).append("\n");
                }
            }
            finally{
                urlConnection.disconnect();
            }
        }
        catch (Exception e){
            Log.e("ERROR", e.getMessage(),e);
            return null;
        }

    }

    protected void onPostExecute(String response){
        if(response == null) {
            response = "THERE WAS AN ERROR";
        }


    }

}
