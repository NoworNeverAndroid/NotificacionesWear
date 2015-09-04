package es.com.blogspot.noworneverandroid.notificacionwear1;

import android.app.Notification;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

/**
 * Created by ruben_000 on 03/09/2015.
 */
public class NotificacionesLargas {


    private int NOTIFICATION_ID = 3;
    private String NOTIFICATION_TAG = "Notificaciones largas";


    public NotificacionesLargas(Context contexto,  NotificationManagerCompat mNotificationManager) {

          NotificationCompat.Style style = new NotificationCompat.BigTextStyle()
         .setBigContentTitle("My big title")
         .setSummaryText("My summary")
         .bigText("Linea 1 \n"+
                 "Linea 2 \n"+
                 "Linea 3 \n"+
                 "Linea 4 \n"+
                 "Linea 5 \n"+
                 "Linea 6 \n"+
                 "Linea 7 \n"+
                 "Linea 8 \n"+
                 "Linea 9\n"
              );


         NotificationCompat.WearableExtender extender = new NotificationCompat
         .WearableExtender()
         .setStartScrollBottom(true);

         Notification notification = new NotificationCompat.Builder(contexto)
         .setSmallIcon(R.mipmap.ic_launcher)
         .setContentTitle("Content title")
         .setContentText("Content text")
         .setStyle(style)
         .extend(extender)
         .build();


         mNotificationManager= NotificationManagerCompat.from(contexto);

         mNotificationManager.notify(NOTIFICATION_TAG, NOTIFICATION_ID, notification);



    }
}
