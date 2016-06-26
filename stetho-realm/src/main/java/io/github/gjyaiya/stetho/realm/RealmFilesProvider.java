package io.github.gjyaiya.stetho.realm;

import com.facebook.stetho.inspector.database.DatabaseFilesProvider;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class RealmFilesProvider implements DatabaseFilesProvider {
    private final File folder;
    private final Pattern databaseNamePattern;

    public RealmFilesProvider(File folder, Pattern databaseNamePattern) {
        this.folder = folder;
        this.databaseNamePattern = databaseNamePattern;
    }

    @Override
    public List<File> getDatabaseFiles() {
        final List<File> files = new ArrayList<>();

        findFiles(folder, databaseNamePattern, files);

        return files;
    }

    public void findFiles(File baseDir, Pattern pattern, List<File> fileList) {
        if (!baseDir.exists() || !baseDir.isDirectory()) return;

        File[] files = baseDir.listFiles();
        if(files == null) return;

        for(File file : files) {
            if (file.isDirectory())
                findFiles(file, pattern, fileList);
            else if (file.isFile()) {
                if (pattern.matcher(file.getName()).matches())
                    fileList.add(file);
            }
        }
    }
}
