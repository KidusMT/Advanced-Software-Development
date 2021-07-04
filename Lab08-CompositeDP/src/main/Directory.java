package main;

import java.util.ArrayList;
import java.util.Collection;

public class Directory extends DriveComponent {
    protected String name;
    protected Collection<DriveComponent> dirList = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("-- dir " + name + " size=" + getSize() + " bytes");

        for (DriveComponent component : dirList) {
            component.print();
        }
    }

    public void add(DriveComponent directory) {
        dirList.add(directory);
    }

    public int getSize() {
        int sizeInBytes = 0;
        for (DriveComponent component : dirList) {
            sizeInBytes += component.getSize();
        }
        return sizeInBytes;
    }
}
