package io.github.gjyaiya.sample;

import android.app.Application;

import com.facebook.stetho.Stetho;

import io.github.gjyaiya.stetho.realm.RealmInspectorModulesProvider;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(RealmInspectorModulesProvider.builder(this).build())
                        .build());
    }
}
