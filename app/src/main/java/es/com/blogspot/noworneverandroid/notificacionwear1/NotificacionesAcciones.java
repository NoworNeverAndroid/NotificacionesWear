package es.com.blogspot.noworneverandroid.notificacionwear1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.view.Gravity;

/**
 * Created by ruben_000 on 03/09/2015.
 */
public class NotificacionesAcciones {


    private int NOTIFICATION_ID = 4;
    private String NOTIFICATION_TAG = "Notificacion con acciones";

    public NotificacionesAcciones(Context contexto,  NotificationManagerCompat mNotificationManager) {

        Intent act1 = new Intent(contexto, MainActivity.class);
        PendingIntent pendingIntent1 = PendingIntent.getActivity(contexto, 0, act1,
                PendingIntent.FLAG_UPDATE_CURRENT);


        Intent act2 = new Intent(Intent.ACTION_DIAL);
        PendingIntent pendingIntent2 = PendingIntent.getActivity(contexto, 1,
                act2, PendingIntent.FLAG_UPDATE_CURRENT);





        NotificationCompat.WearableExtender ext = new NotificationCompat
                .WearableExtender()
                .setGravity(Gravity.TOP)
                .setContentAction(2);


        Notification notification = new NotificationCompat.Builder(contexto)
                .setSmallIcon(R.drawable.natacion)
                .setContentTitle("Action notification")
                .setContentText("This notification has multiple actions")
                .addAction(R.mipmap.ic_launcher, "Open app", pendingIntent1)
                .addAction(R.drawable.natacion, "action dial", pendingIntent2)
                .extend(ext)
                .build();

        mNotificationManager= NotificationManagerCompat.from(contexto);

        mNotificationManager.notify(NOTIFICATION_TAG, NOTIFICATION_ID, notification);
    }
}
