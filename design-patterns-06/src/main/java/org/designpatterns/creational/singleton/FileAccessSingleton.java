package org.designpatterns.creational.singleton;

public class FileAccessSingleton {

    private static volatile FileAccessSingleton fileAccessSingleton;

    private FileAccessSingleton() {
    }

    public static FileAccessSingleton createInstance() {
        if (fileAccessSingleton == null) {
            synchronized (FileAccessSingleton.class) {
                if (fileAccessSingleton == null) {
                    fileAccessSingleton = new FileAccessSingleton();
                }
            }
        }
        return fileAccessSingleton;
    }

}
