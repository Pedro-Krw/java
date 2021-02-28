<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:background="#EFEFEF"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
<!--Bagian Navigasi bar-->
    <androidx.appcompat.widget.Toolbar
        android:background="@color/purple_200"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <LinearLayout
            android:orientation="horizontal"
            android:layout_height="match_parent"
            android:layout_width="wrap_content">

            <TextView
                android:layout_gravity="center"
                android:textSize="19dp"
                android:textColor="@color/white"
                android:textStyle="bold"
                android:text="Biak Ngemil"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"/>

            <RelativeLayout
                android:layout_width="20dp"
                android:layout_height="match_parent"/>

            <Button
                android:layout_weight="1"
                android:layout_width="265dp"
                android:layout_height="wrap_content"
                android:gravity="center_vertical"
                android:backgroundTint="@color/white"
                android:drawableLeft="@drawable/ic_cari"
                android:text="Cari Sesuatu"
                android:textAllCaps="false"
                android:textColor="@color/black" />
            <androidx.cardview.widget.CardView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"/>



        </LinearLayout>

    </androidx.appcompat.widget.Toolbar>

<!--  Ini bagian Header  -->
<LinearLayout
    android:background="@drawable/header"
    android:layout_width="match_parent"
    android:layout_height="120dp"/>

<!--Splash-->
    <LinearLayout
        android:padding="8dp"
        android:orientation="horizontal"
        android:layout_marginLeft="12dp"
        android:layout_marginRight="12dp"
        android:layout_marginTop="-115dp"
        android:background="@drawable/splas"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <LinearLayout
            android:gravity="center"
            android:layout_gravity="center"
            android:layout_width="wrap_content"
            android:layout_height="121dp"
            android:orientation="vertical">

            <androidx.cardview.widget.CardView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                app:cardCornerRadius="20dp">

                <ImageView
                    android:layout_width="160dp"
                    android:layout_height="164dp"
                    android:layout_marginLeft="-7dp"
                    android:layout_marginTop="-20dp"
                    android:adjustViewBounds="true"
                    android:cropToPadding="true"
                    android:src="@drawable/waffel" />
            </androidx.cardview.widget.CardView>
        </LinearLayout>

        <LinearLayout
            android:padding="5dp"
            android:orientation="vertical"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
            <TextView
                android:textColor="@color/black"
                android:textStyle="bold"
                android:layout_marginLeft="20dp"
                android:text="Khusus Hari Ini"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"/>
            <TextView
                android:textColor="@color/black"
                android:textStyle="bold"
                android:textSize="20dp"
                android:layout_marginLeft="20dp"
                android:text="Paket Komplit Waffel"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"/>
            <TextView
                android:textColor="@color/black"
                android:textStyle="bold"
                android:textSize="12dp"
                android:layout_marginLeft="20dp"
                android:text="Rp 15.000"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"/>

            <Button
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:backgroundTint="#03506f"
                android:text="Ambil Promo"
                android:textAllCaps="false"
                android:textColor="@color/white" />

        </LinearLayout>
    </LinearLayout>

<LinearLayout
    android:padding="15dp"
    android:orientation="horizontal"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
<!--Card menu-->
    <LinearLayout
        android:layout_weight="1"
        android:foreground="?android:attr/selectableItemBackground"
        android:clickable="true"
        android:background="@drawable/card_button"
        android:padding="20dp"
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <ImageView
            android:adjustViewBounds="true"
            android:cropToPadding="true"
            android:src="@drawable/ic_add_event"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"/>

    </LinearLayout>
    <RelativeLayout
        android:layout_width="40dp"
        android:layout_height="40dp"/>
    <!--Card menu-->
    <LinearLayout
        android:layout_weight="1"
        android:foreground="?android:attr/selectableItemBackground"
        android:clickable="true"
        android:background="@drawable/card_button"
        android:padding="20dp"
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <ImageView
            android:adjustViewBounds="true"
            android:cropToPadding="true"
            android:src="@drawable/ic_add_event"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"/>

    </LinearLayout>
    <RelativeLayout
        android:layout_width="40dp"
        android:layout_height="40dp"/>
    <!--Card menu-->
    <LinearLayout
        android:layout_weight="1"
        android:foreground="?android:attr/selectableItemBackground"
        android:clickable="true"
        android:background="@drawable/card_button"
        android:padding="20dp"
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <ImageView
            android:adjustViewBounds="true"
            android:cropToPadding="true"
            android:src="@drawable/ic_add_event"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"/>

    </LinearLayout>
    <RelativeLayout
        android:layout_width="40dp"
        android:layout_height="40dp"/>
    <!--Card menu-->
    <LinearLayout
        android:layout_weight="1"
        android:foreground="?android:attr/selectableItemBackground"
        android:clickable="true"
        android:background="@drawable/card_button"
        android:padding="20dp"
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <ImageView
            android:adjustViewBounds="true"
            android:cropToPadding="true"
            android:src="@drawable/ic_add_event"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"/>

    </LinearLayout>



</LinearLayout>

    <TextView
        android:layout_marginTop="10dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Kategori"
        android:textAlignment="center"
        android:textSize="12dp">

    </TextView>


</LinearLayout>
