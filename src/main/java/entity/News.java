package entity;
import lombok.Data;

import java.util.Date;

@Data
public class News {
    private String id;
    private String title;
    private String content;
    private String Image;
    private Date PostedDate;
    private String Author;
    private String Category;
    private int ViewCount;
    private Boolean Home;
}
