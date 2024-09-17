package entity;
import lombok.Data;

import java.util.Date;

@Data
public class USERS {
    private int Id;
    private String Fullname;
    private String Email;
    private String Password;
    private Boolean Role;
    private Date Birthday;
    private boolean Gender;
    private String Mobile;
}
