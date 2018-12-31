<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="10dp"
    android:background="@drawable/main_background">

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:text="Restart"
        android:onClick="restart"
        android:background="@android:color/holo_blue_dark"
        android:textColor="#ffffff"
        android:padding="10dp"
        android:layout_alignParentLeft="true"/>

    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentTop="true"
        android:text="Exit"
        android:onClick="exit"
        android:background="@android:color/holo_blue_dark"
        android:textColor="#ffffff"
        android:padding="10dp"
        android:layout_alignParentRight="true"/>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="horizontal">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Score: "/>


        <TextView
            android:id="@+id/tvScore"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="36sp"
            android:textColor="@android:color/holo_orange_dark"
            android:text="TextView"/>

    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="horizontal">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Personal best: "/>

        <TextView
            android:id="@+id/tvPersonalBest"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@android:color/holo_green_dark"
            android:text="TextView"/>
    </LinearLayout>

</RelativeLayout>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              