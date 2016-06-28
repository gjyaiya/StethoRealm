#StethoRealm

StethoRealm is based from [Stetho-Realm](https://github.com/uPhyca/stetho-realm)

### update log:
1. Recurses through subdirectories of the parent directory dir looking for realm files.
2. Add jcenter support.

### Download
grab via Gradle:
```groovy
dependencies {
    compile 'com.facebook.stetho:stetho:1.3.1'
    compile 'io.github.gjyaiya:stetho-realm:1.0'
}
```

```java
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
```

By calling some methods in `RealmInspectorModulesProvider.ProviderBuilder`,
you can include metadata table in table list, and can provide database file name pattern.
And also you can specify base folder for database files, encryption keys, limit, sort order.

```java
    RealmInspectorModulesProvider.builder(this)
            .withFolder(getCacheDir())
            .withEncryptionKey("encrypted.realm", key)
            .withMetaTables()
            .withDescendingOrder()
            .withLimit(1000)
            .databaseNamePattern(Pattern.compile(".+\\.realm"))
            .build()
```

## use Stetho in debug build only

http://littlerobots.nl/blog/stetho-for-android-debug-builds-only/

## License

StethoRealm is BSD-licensed.
