package main;

public class Drive {
    protected String name;
    protected DriveComponent driveComponent;

    public Drive(String name) {
        this.name = name;
        driveComponent = new Directory(name);
    }

    public void addDir(DriveComponent directory) {
        driveComponent.add(directory);
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
        return driveComponent.getSize();
    }

    public void print() {
        System.out.println("- drive " + name);
        driveComponent.print();
//        for (Directory dir : dirList) {
//            dir.print();
//        }
//        for (File file : fileList) {
//            file.print();
//        }
    }
}
