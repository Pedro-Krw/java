package com.Sacoding;

public class Main {
public static void main( String[] args) {
	
	// Tipe data dalam bahasa Java
	// integer, byte, short, long, double, float, boolean
	
	// INTEGER (Satuan)
	
	int i = 10;
	
	System.out.println("=====INTEGER=====");
	System.out.println("nialai integer i = " + (i + 1));
	System.out.println("Nilai Max = " + Integer.MAX_VALUE);
	System.out.println("Nilai Min = " + Integer.MIN_VALUE);
    System.out.println("Besar integer " + Integer.BYTES + " bytes");
    System.out.println("Besar integer " + Integer.SIZE + " bit");
	
	
	
	// byte(Satuan)
	
	int b = 10;
	
	System.out.println("=====BYTE=====");
	System.out.println("nialai byte  = " + b);
	System.out.println("Nilai Max = " + Byte.MAX_VALUE);
	System.out.println("Nilai Min = " + Byte.MIN_VALUE);
    System.out.println("Besar byte " + Byte.BYTES + " bytes");
    System.out.println("Besar byte " + Byte.SIZE + " bit");
	
    
    
	// short (Satuan)
	
	int s = 10;
	
	System.out.println("=====SHORT=====");
	System.out.println("nialai byte  = " + s);
	System.out.println("Nilai Max = " + Short.MAX_VALUE);
	System.out.println("Nilai Min = " + Short.MIN_VALUE);
    System.out.println("Besar byte " + Short.BYTES + " bytes");
    System.out.println("Besar byte " + Short.SIZE + " bit");
	
    
	// long (Satuan)
	
	int l = 10;
	
	System.out.println("=====LONG=====");
	System.out.println("nialai byte i = " + l);
	System.out.println("Nilai Max = " + Long.MAX_VALUE);
	System.out.println("Nilai Min = " + Long.MIN_VALUE);
    System.out.println("Besar byte " + Long.BYTES + " bytes");
    System.out.println("Besar byte " + Long.SIZE + " bit");
	
    
	// double (Koma Bilangan Real)
	
	int d = 10;
	
	System.out.println("=====DOUBLE=====");
	System.out.println("nialai byte i = " + d);
	System.out.println("Nilai Max = " + Double.MAX_VALUE);
	System.out.println("Nilai Min = " + Double.MIN_VALUE);
    System.out.println("Besar byte " + Double.BYTES + " bytes");
    System.out.println("Besar byte " + Double.SIZE + " bit");
	
    
    
	// float (Koma Bilangan Real)
	
	int f = 10;
	
	System.out.println("=====FLOAT=====");
	System.out.println("nialai byte i = " + f);
	System.out.println("Nilai Max = " + Float.MAX_VALUE);
	System.out.println("Nilai Min = " + Float.MIN_VALUE);
    System.out.println("Besar byte " + Float.BYTES + " bytes");
    System.out.println("Besar byte " + Float.SIZE + " bit");
	
    
	// char (Koma Bilangan Real Berdasarkan ASCII)
	
	int c = 10;
	
	System.out.println("=====CHAR=====");
	System.out.println("nialai byte i = " + c);
	System.out.println("Nilai Max = " + Character.MAX_VALUE);
	System.out.println("Nilai Min = " + Character.MIN_VALUE);
    System.out.println("Besar byte " + Character.BYTES + " bytes");
    System.out.println("Besar byte " + Character.SIZE + " bit");
	
    
	// boolean (Nialai true atau false)
	
	boolean val = false;
	
	System.out.println("=====BOOLEAN=====");
	System.out.println("nialai byte val = " + val);
	System.out.println("Nilai Max = " + Boolean.TRUE);
	System.out.println("Nilai Min = " + Boolean.FALSE);
  
	
    

    
    
    
}
	
	
	
	
}


<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

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
                android:textColor="@color/black"
                android:textStyle="bold"
                android:text="Biak Online Store"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"/>

            <RelativeLayout
                android:layout_width="20dp"
                android:layout_height="match_parent"/>

            <Button
                android:layout_width="209dp"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:backgroundTint="@color/white"
                android:textColor="@color/black"
                android:text="Cari Sesuatu"
                android:textAllCaps="false"
                android:drawableStart="@drawable/ic_cari"/>

            <Button
                android:layout_width="17dp"
                android:layout_height="match_parent"
                android:background="@drawable/ic_favorit" />


        </LinearLayout>

    </androidx.appcompat.widget.Toolbar>

</LinearLayout>
