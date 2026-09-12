public class FolderDriver {
    public static void main(String[] args) {
        Folder phpDemo1 = new Folder("php_demo1");

        Folder sourceFiles = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");
        phpDemo1.addSubFolder(sourceFiles);
        phpDemo1.addSubFolder(includePath);
        phpDemo1.addSubFolder(remoteFiles);

        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);

        app.addSubFolder(new Folder("config"));
        app.addSubFolder(new Folder("controllers"));
        app.addSubFolder(new Folder("library"));
        app.addSubFolder(new Folder("migrations"));
        app.addSubFolder(new Folder("models"));
        app.addSubFolder(new Folder("views"));

        sourceFiles.addFile(new File(".htaccess"));
        sourceFiles.addFile(new File(".htrouter.php"));
        sourceFiles.addFile(new File("index.html"));

        System.out.println("File structure before deleting subfolders");
        phpDemo1.print("");

        System.out.println("Deleted app subfolder:");
        sourceFiles.deleteSubFolder("app");
        phpDemo1.print("");


        System.out.println("Deleted public subfolder: ");
        sourceFiles.deleteSubFolder("public");
        phpDemo1.print("");
    }
}