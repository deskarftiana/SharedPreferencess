package com.example.aplikasikudeska.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Button;
import android.widget.EditText;

import com.example.aplikasikudeska.HomeActivity;

public class SharedPref {
    EditText username;
    EditText pass;

    private static SharedPref INSTANCE;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    /*static final String KEY_USER_TEREGISTER ="username", KEY_PASS_TEREGISTER ="pass";*/

    private SharedPref(Context context) {
        sharedPreferences = context
                .getApplicationContext()
                .getSharedPreferences( "com.example.projectmi03", Context.MODE_PRIVATE);
    }

    public  static  SharedPref getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new SharedPref(context);
        }
        return  INSTANCE;
    }
    public  SharedPreferences Pref() { return  sharedPreferences; }

    public Boolean isLogin () { return sharedPreferences.getBoolean("isLogin", false);}
    public void setLogin (boolean isCall) {
        sharedPreferences.edit().putBoolean("isLogin", isCall).apply();
    }
    public void  setName (String isName) {
        sharedPreferences.edit().putString("isName", isName).apply();
    }


    //private static SharedPreferences.Editor edit() {
    //}
    private void getData(){
        //Mendapatkan Input dari user
        //String user = username.getText().toString();

        //Digunakan Untuk Pengaturan Konfigurasi SharedPreferences
        //editor = SharedPref.edit();

        //Memasukan Data Pada Editor SharedPreferences dengan key (data_saya)
        //editor.putString("data_user", user);

        //Menjalankan Operasi
        //editor.apply();

        /*Menampilkan Output
        tv_nama.setText("Output Data : "+SharedPref.getS("data_user"));*/
    }//

}
