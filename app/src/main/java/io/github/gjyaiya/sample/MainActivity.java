package io.github.gjyaiya.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RealmConfiguration myConfig = new RealmConfiguration.Builder(this)
                .name("myrealm.realm")
                .build();

        RealmConfiguration otherConfig = new RealmConfiguration.Builder(this)
                .name("otherrealm.realm")
                .build();

        Realm myRealm = Realm.getInstance(myConfig);
        Realm otherRealm = Realm.getInstance(otherConfig);
    }
}
