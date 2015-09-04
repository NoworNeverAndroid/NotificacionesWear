package es.com.blogspot.noworneverandroid.notificacionwear1;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.view.Display;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ruben_000 on 03/09/2015.
 */
public class NotificacionesSimples  {

    private int NOTIFICATION_ID = 1;
    private String NOTIFICATION_TAG = "Notificacion Simple";



    public NotificacionesSimples(Context contexto,  NotificationManagerCompat mNotificationManager) {


        NotificationCompat.Style style = new NotificationCompat.BigPictureStyle()
                .bigPicture(BitmapFactory.decodeResource(contexto.getResources(), R.drawable.natacion));


        Notification notification = new NotificationCompat.Builder(contexto)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Natacion")
                .setContentText("Hoy tienes clase de natacion")
                .setStyle(style)
                .build();



        mNotificationManager=NotificationManagerCompat.from(contexto);

        mNotificationManager.notify(NOTIFICATION_TAG, NOTIFICATION_ID, notification);


    }


    public AssetManager getAssets() {
        return null;
    }

    public Resources getResources() {
        return null;
    }

    public PackageManager getPackageManager() {
        return null;
    }

    public ContentResolver getContentResolver() {
        return null;
    }

    public Looper getMainLooper() {
        return null;
    }

    public Context getApplicationContext() {
        return null;
    }

    public void setTheme(int i) {

    }

    public Resources.Theme getTheme() {
        return null;
    }

    public ClassLoader getClassLoader() {
        return null;
    }

    public String getPackageName() {
        return null;
    }

    public ApplicationInfo getApplicationInfo() {
        return null;
    }

    public String getPackageResourcePath() {
        return null;
    }

    public String getPackageCodePath() {
        return null;
    }

    public SharedPreferences getSharedPreferences(String s, int i) {
        return null;
    }

    public FileInputStream openFileInput(String s) throws FileNotFoundException {
        return null;
    }

    public FileOutputStream openFileOutput(String s, int i) throws FileNotFoundException {
        return null;
    }

    public boolean deleteFile(String s) {
        return false;
    }

    public File getFileStreamPath(String s) {
        return null;
    }

    public File getFilesDir() {
        return null;
    }

    public File getNoBackupFilesDir() {
        return null;
    }

    @Nullable
    public File getExternalFilesDir(String s) {
        return null;
    }

    public File[] getExternalFilesDirs(String s) {
        return new File[0];
    }

    public File getObbDir() {
        return null;
    }

    public File[] getObbDirs() {
        return new File[0];
    }

    public File getCacheDir() {
        return null;
    }

    public File getCodeCacheDir() {
        return null;
    }

    @Nullable
    public File getExternalCacheDir() {
        return null;
    }

    public File[] getExternalCacheDirs() {
        return new File[0];
    }

    public File[] getExternalMediaDirs() {
        return new File[0];
    }

    public String[] fileList() {
        return new String[0];
    }

    public File getDir(String s, int i) {
        return null;
    }

    public SQLiteDatabase openOrCreateDatabase(String s, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        return null;
    }

    public SQLiteDatabase openOrCreateDatabase(String s, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return null;
    }

    public boolean deleteDatabase(String s) {
        return false;
    }

    public File getDatabasePath(String s) {
        return null;
    }

    public String[] databaseList() {
        return new String[0];
    }

    public Drawable getWallpaper() {
        return null;
    }

    public Drawable peekWallpaper() {
        return null;
    }

    public int getWallpaperDesiredMinimumWidth() {
        return 0;
    }

    public int getWallpaperDesiredMinimumHeight() {
        return 0;
    }

    public void setWallpaper(Bitmap bitmap) throws IOException {

    }

    public void setWallpaper(InputStream inputStream) throws IOException {

    }

    public void clearWallpaper() throws IOException {

    }

    public void startActivity(Intent intent) {

    }

    public void startActivity(Intent intent, Bundle bundle) {

    }

    public void startActivities(Intent[] intents) {

    }

    public void startActivities(Intent[] intents, Bundle bundle) {

    }

    public void startIntentSender(IntentSender intentSender, Intent intent, int i, int i1, int i2) throws IntentSender.SendIntentException {

    }

    public void startIntentSender(IntentSender intentSender, Intent intent, int i, int i1, int i2, Bundle bundle) throws IntentSender.SendIntentException {

    }

    public void sendBroadcast(Intent intent) {

    }

    public void sendBroadcast(Intent intent, String s) {

    }

    public void sendOrderedBroadcast(Intent intent, String s) {

    }

    public void sendOrderedBroadcast(Intent intent, String s, BroadcastReceiver broadcastReceiver, Handler handler, int i, String s1, Bundle bundle) {

    }

    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle) {

    }

    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String s) {

    }

    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String s, BroadcastReceiver broadcastReceiver, Handler handler, int i, String s1, Bundle bundle) {

    }

    public void sendStickyBroadcast(Intent intent) {

    }

    public void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver broadcastReceiver, Handler handler, int i, String s, Bundle bundle) {

    }

    public void removeStickyBroadcast(Intent intent) {

    }

    public void sendStickyBroadcastAsUser(Intent intent, UserHandle userHandle) {

    }

    public void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String s, Bundle bundle) {

    }

    public void removeStickyBroadcastAsUser(Intent intent, UserHandle userHandle) {

    }

    @Nullable
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return null;
    }

    @Nullable
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String s, Handler handler) {
        return null;
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {

    }

    @Nullable
    public ComponentName startService(Intent intent) {
        return null;
    }

    public boolean stopService(Intent intent) {
        return false;
    }

    public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
        return false;
    }

    public void unbindService(ServiceConnection serviceConnection) {

    }

    public boolean startInstrumentation(ComponentName componentName, String s, Bundle bundle) {
        return false;
    }

    public Object getSystemService(String s) {
        return null;
    }

    public String getSystemServiceName(Class<?> aClass) {
        return null;
    }

    public int checkPermission(String s, int i, int i1) {
        return 0;
    }

    public int checkCallingPermission(String s) {
        return 0;
    }

    public int checkCallingOrSelfPermission(String s) {
        return 0;
    }

    public int checkSelfPermission(String s) {
        return 0;
    }

    public void enforcePermission(String s, int i, int i1, String s1) {

    }

    public void enforceCallingPermission(String s, String s1) {

    }

    public void enforceCallingOrSelfPermission(String s, String s1) {

    }

    public void grantUriPermission(String s, Uri uri, int i) {

    }

    public void revokeUriPermission(Uri uri, int i) {

    }

    public int checkUriPermission(Uri uri, int i, int i1, int i2) {
        return 0;
    }

    public int checkCallingUriPermission(Uri uri, int i) {
        return 0;
    }

    public int checkCallingOrSelfUriPermission(Uri uri, int i) {
        return 0;
    }

    public int checkUriPermission(Uri uri, String s, String s1, int i, int i1, int i2) {
        return 0;
    }

    public void enforceUriPermission(Uri uri, int i, int i1, int i2, String s) {

    }

    public void enforceCallingUriPermission(Uri uri, int i, String s) {

    }

    public void enforceCallingOrSelfUriPermission(Uri uri, int i, String s) {

    }

    public void enforceUriPermission(Uri uri, String s, String s1, int i, int i1, int i2, String s2) {

    }

    public Context createPackageContext(String s, int i) throws PackageManager.NameNotFoundException {
        return null;
    }

    public Context createConfigurationContext(Configuration configuration) {
        return null;
    }

    public Context createDisplayContext(Display display) {
        return null;
    }
}
