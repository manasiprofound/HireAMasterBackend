package com.itprofound.hireamasterbackend.resourse.admin.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admins")
public class Admin {

    @Id
    private String id;
    private String adminfirstname;
    private String adminlastname;
    private String adminaddress;
    private String adminmobile;
    private String username;
    private String password;


    public Admin(String id, String adminfirstname, String adminlastname, String adminaddress, String adminmobile, String username, String password) {
        this.id = id;
        this.adminfirstname = adminfirstname;
        this.adminlastname = adminlastname;
        this.adminaddress = adminaddress;
        this.adminmobile = adminmobile;
        this.username = username;
        this.password = password;
    }

    public Admin() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdminfirstname() {
        return adminfirstname;
    }

    public void setAdminfirstname(String adminfirstname) {
        this.adminfirstname = adminfirstname;
    }

    public String getAdminlastname() {
        return adminlastname;
    }

    public void setAdminlastname(String adminlastname) {
        this.adminlastname = adminlastname;
    }

    public String getAdminaddress() {
        return adminaddress;
    }

    public void setAdminaddress(String adminaddress) {
        this.adminaddress = adminaddress;
    }

    public String getAdminmobile() {
        return adminmobile;
    }

    public void setAdminmobile(String adminmobile) {
        this.adminmobile = adminmobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id='" + id + '\'' +
                ", adminfirstname='" + adminfirstname + '\'' +
                ", adminlastname='" + adminlastname + '\'' +
                ", adminaddress= '" + adminaddress + '\'' +
                ", adminmobile='" + adminmobile + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
