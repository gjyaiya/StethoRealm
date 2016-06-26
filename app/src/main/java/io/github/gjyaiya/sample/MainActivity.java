package io.github.gjyaiya.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File dir = new File(this.getFilesDir()+File.separator+"account");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        RealmConfiguration defaultConfig = new RealmConfiguration.Builder(this)
                .name("account" + File.separator + "default.1.db")
                .build();

        RealmConfiguration commonConfig = new RealmConfiguration.Builder(this)
                .name("common.1.db")
                .build();

        Realm dRealm = Realm.getInstance(defaultConfig);
        Realm cRealm = Realm.getInstance(commonConfig);
    }
}
