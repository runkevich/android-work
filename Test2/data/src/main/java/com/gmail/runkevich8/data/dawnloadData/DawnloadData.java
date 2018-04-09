package com.gmail.runkevich8.data.dawnloadData;


import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DawnloadData {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public static void download(String urlAdress, Context context) {

        try {
            URL url = new URL(urlAdress);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                File file = new File(context.getFilesDir(), "usersJSON.json");

                try (InputStream streamIn = connection.getInputStream();
                     FileOutputStream streamOut = new FileOutputStream(file)) {

                    byte[] buffer = new byte[2048];
                    int read;
                    while ((read = streamIn.read(buffer)) != -1) {
                        streamOut.write(buffer, 0, read);
                    }
                }
            } else {
                return;
            }
        } catch (IOException e) {
            e.getMessage();
            return;
        }
    }
}
