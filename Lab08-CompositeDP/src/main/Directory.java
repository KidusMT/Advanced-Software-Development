package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Directory extends DriveComponent {
    protected String name;
//    protected Collection<DriveComponent> fileList = new ArrayList<>();
    protected Collection<DriveComponent> dirList = new ArrayList<>();


    public Directory(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("-- dir " + name + " size=" + getSize() + " bytes");
//        Iterator<DriveComponent> fileItr = dirList.iterator();

        for (DriveComponent component : dirList) {
            component.print();
        }
//        for (Directory dir : dirList) {
//            dir.print();
//        }
//        for (File file : fileList) {
//            file.print();
//        }
    }

//    public void addFile(File file) {
//        fileList.add(file);
//    }

//    public void addDir(Directory directory) {
//        dirList.add(directory);
//    }

    public void add(DriveComponent directory) {
        dirList.add(directory);
    }

    public int getSize() {
        int sizeInBytes = 0;
        for (DriveComponent component : dirList) {
            sizeInBytes += component.getSize();
        }
//        for (File file : fileList) {
//            sizeInBytes += file.getSizeInBytes();
//        }
//        for (Directory dir : dirList) {
//            sizeInBytes += dir.computeSize();
//        }
        return sizeInBytes;
    }
}
