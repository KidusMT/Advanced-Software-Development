package main;

import java.util.ArrayList;
import java.util.Collection;

public class Directory extends DriveComponent {
    protected String name;
    protected Collection<DriveComponent> dirItems = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("-- dir " + name + " size=" + getSize() + " bytes");

        for (DriveComponent component : dirItems) {
            component.print();
        }
    }

    public void add(DriveComponent directory) {
        dirItems.add(directory);
    }

    public int getSize() {
        int sizeInBytes = 0;
        for (DriveComponent component : dirItems) {
            sizeInBytes += component.getSize();
        }
        return sizeInBytes;
    }
}
