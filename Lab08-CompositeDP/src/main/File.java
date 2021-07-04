package main;

public class File {
    private final String name;
    private final int sizeInBytes;

    public File(String name, int sizeInBytes) {
        this.name = name;
        this.sizeInBytes = sizeInBytes;
    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }

    public void print() {
        System.out.println("--- file " + name + " size=" + getSizeInBytes() + "bytes");
    }
}
