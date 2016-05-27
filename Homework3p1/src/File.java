
import java.util.Date;

/**
 * Created by Serg-fam on 27.05.2016 on 11:12.
 */
public class File {
    private Date creatDate;
    private float size;
    private String name;
    private String type;

    public File(Date dataGread, float size, String name, String type) {
        this.name = name;
        this.creatDate = dataGread;
        this.size = size;
    }

    public File() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
