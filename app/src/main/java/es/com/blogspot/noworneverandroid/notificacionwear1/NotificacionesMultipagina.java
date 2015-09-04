package es.com.blogspot.noworneverandroid.notificacionwear1;

import android.app.Notification;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ruben_000 on 03/09/2015.
 */
public class NotificacionesMultipagina {


    private int NOTIFICATION_ID = 2;
    private String NOTIFICATION_TAG = "Notificaciones Multipagina";


    public NotificacionesMultipagina(Context contexto,  NotificationManagerCompat mNotificationManager) {



        NotificationCompat.Style style = new NotificationCompat.BigPictureStyle()
                .bigPicture(BitmapFactory.decodeResource(contexto.getResources(), R.drawable.natacion));

        List<Notification> pages = new ArrayList<Notification>();
        for( int i = 1; i <= 3; i++ ){
            Notification notification = new NotificationCompat.Builder(contexto)
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setContentTitle("Page " + i)
                    .setContentText("Text for page " + i)
                    .setStyle(style)
                    .build();
            pages.add(notification);
        }

        NotificationCompat.WearableExtender extender = new NotificationCompat
                .WearableExtender()
                .addPages(pages);

        Notification notification = new NotificationCompat.Builder(contexto)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Notificacion multipagina")
                .setContentText("primera pagina")
                .setStyle(style)
                .extend(extender)
                .build();


        mNotificationManager= NotificationManagerCompat.from(contexto);

        mNotificationManager.notify(NOTIFICATION_TAG, NOTIFICATION_ID, notification);


    }
}
