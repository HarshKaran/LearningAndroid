package com.example.learningandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

public class NotificationExampleActivity extends AppCompatActivity {
private  static final  String CHANNEL_ID =  "My Channel";
private  static  final int REQ_CODE=200;
    private  static final  int NOTIFICATION_ID =  100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_example);


        //Notification
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.c, null);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        assert bitmapDrawable != null;
        Bitmap largeIcon = bitmapDrawable.getBitmap();

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

//                PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), REQ_CODE, intent, PendingIntent.FLAG_UPDATE_CURRENT);


        Notification notification;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            notification = new Notification.Builder(this)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.c)
                    .setContentText("New Message")
                    .setSubText("New Notification form app")
                    .setChannelId(CHANNEL_ID)
                    .build();
            nm.createNotificationChannel(new NotificationChannel(CHANNEL_ID, "New Channel", NotificationManager.IMPORTANCE_HIGH));
        } else {
            notification = new Notification.Builder(this)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.a)
                    .setContentText("New Message")
                    .setSubText("New Notification form app")
                    .build();
        }

        nm.notify(NOTIFICATION_ID, notification);

//        Drawable drawable = ResourcesCompat.getDrawable(getResources(),R.drawable.database,null);
//        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
//        assert bitmapDrawable != null;
//        Bitmap largeIcon = bitmapDrawable.getBitmap();
//
//        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//        Notification notification;
//
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
//            notification = new Notification.Builder(this)
//                    .setLargeIcon(largeIcon)
//                    .setSmallIcon(R.drawable.database)
//                    .setContentText("New Message")
//                    .setSubText("New Message genereated")
//                    .setChannelId(CHANNEL_ID)
//                    .build();
//            nm.createNotificationChannel(new NotificationChannel(CHANNEL_ID,"New Channel",NotificationManager.IMPORTANCE_HIGH));
//        }   else {
//            notification = new Notification.Builder(this)
//                    .setLargeIcon(largeIcon)
//                    .setSmallIcon(R.drawable.database)
//                    .setContentText("New Message")
//                    .setSubText("New Message genereated")
//                    .build();
//        }
//        nm.notify(NOTIFICATION_ID , notification);

    }
}