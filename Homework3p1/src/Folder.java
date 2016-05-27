import java.util.List;
import java.io.File;

/**
 * Created by Serg-fam on 27.05.2016 on 12:29.
 */
public class Folder {

    File folder = new File("/tmp/a/b");

    public java.io.File getFolder() {
        return folder;
    }

    public void setFolder(java.io.File folder) {
        this.folder = folder;
    }

    private List<File> File;


    public List<File> getFile() {
        return File;
    }

    public void setFile(List<File> file) {
        this.File = file;
    }

}
