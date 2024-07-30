package net.media.training.designpattern.composite;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class Directory implements FileSystemElement{
    private final String name;
    private final List<FileSystemElement>fileSystemElements;
    private Directory parent;

    public String getName() {
        return name;
    }

    public Directory(String name, List<FileSystemElement> fileSystemElements) {
        this.name = name;
        this.fileSystemElements = fileSystemElements;

        for (FileSystemElement fileSystemElement : fileSystemElements) {
            fileSystemElement.setParent(this);
        }

    }

    public int getSize() {
        int sum = 0;

        for (FileSystemElement fileSystemElement : fileSystemElements) {
            sum += fileSystemElement.getSize();
        }

        return sum;
    }

    public void setParent(Directory directory) {
        this.parent = directory;
    }

    public void delete() {
        while (this.getFileSystemElements().size() > 0) {
            FileSystemElement fileSystemElement = this.getFileSystemElements().get(0);
            fileSystemElement.delete();
        }

        this.getParent().removeEntry(this);
    }

    public void removeEntry(FileSystemElement fileSystemElement) {
        fileSystemElements.remove(fileSystemElement);
    }

    public void add(FileSystemElement fileSystemElement) {
        this.fileSystemElements.add(fileSystemElement);
    }

    public boolean FileSystemElementExists(String name) {
        if (this.getName().equals(name))
            return true;

        for (FileSystemElement fileSystemElement : getFileSystemElements()) {
            if (fileSystemElement.FileSystemElementExists(name)) {
                return true;
            }
        }
        return false;
    }

    public List<FileSystemElement> getFileSystemElements() {
        return fileSystemElements;
    }

    public Directory getParent() {
        return parent;
    }

    public boolean isFile(){
        return false;
    }
}
