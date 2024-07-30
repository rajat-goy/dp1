package net.media.training.designpattern.composite;

public interface FileSystemElement {
    public void setParent(Directory parent);
    public String getName();
    public int getSize();
    public Directory getParent();
    public void delete();

    public boolean isFile();
    public boolean FileSystemElementExists(String name);
}
