import java.util.ArrayList;

public class Folder {
    private String folderName;
    private ArrayList<File> fileList;
    private ArrayList<Folder> subFolders;

    public Folder(String folderName)
    {
        this.folderName = folderName;
        fileList = new ArrayList<>();
        subFolders = new ArrayList<>();
    }

    public String getFolderName() {
        return folderName;
    }

    public ArrayList<File> getFileList() {
        return fileList;
    }

    public ArrayList<Folder> getSubFolders() {
        return subFolders;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public void setFileList(ArrayList<File> fileList) {
        this.fileList = fileList;
    }

    public void setSubFolders(ArrayList<Folder> subFolders) {
        this.subFolders = subFolders;
    }

    public void addFile(File file)
    {
        fileList.add(file);
    }

    public void addSubFolder(Folder subFolder)
    {
        subFolders.add(subFolder);
    }

    public void deleteFile(String fileName)
    {
        fileList.removeIf(file -> file.getFileName().equalsIgnoreCase(fileName));
    }

    public void deleteSubFolder(String subFolderName)
    {
        subFolders.removeIf(subFolder -> subFolder.getFolderName().equalsIgnoreCase(subFolderName));
    }

    public void print(String indent)
    {
        System.out.println(indent + folderName);
        for(Folder subFolder : subFolders)
        {
            subFolder.print(indent + "|    ");
        }
        for(File file : fileList)
        {
            file.print(indent + "    ");
        }

    }

}
