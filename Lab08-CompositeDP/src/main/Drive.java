package main;

public class Drive {
    protected String name;
    protected DriveComponent component;

    public Drive(String name) {
        this.name = name;
        component = new Directory(name);
    }

    public void addDir(DriveComponent directory) {
        component.add(directory);
    }

    public int computeSize() {
//        int sizeInBytes = 0;
//        for (File file : fileList) {
//            sizeInBytes += file.getSizeInBytes();
//        }
//        for (Directory dir : dirList) {
//            sizeInBytes += dir.computeSize();
//        }
//        return sizeInBytes;
        return component.getSize();
    }

    public void print() {
        System.out.println("- drive " + name);
        component.print();
//        for (Directory dir : dirList) {
//            dir.print();
//        }
//        for (File file : fileList) {
//            file.print();
//        }
    }
}
