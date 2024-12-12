
// NotificationHelper.java (Étape 4 : Notifications)
package com.example.finalexam;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;

public class NotificationHelper {
    public static void sendNotification(Context context) {
        String channelId = "exam_channel";
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(channelId, "Exam Notifications", NotificationManager.IMPORTANCE_DEFAULT);
            notificationManager.createNotificationChannel(channel);
        }

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, channelId)
                .setContentTitle("Notification FinalExamApp")
                .setContentText("Bonjour, voici un exemple de notification.")
                .setSmallIcon(R.drawable.ic_notification);

        notificationManager.notify(1, builder.build());
    }
}
