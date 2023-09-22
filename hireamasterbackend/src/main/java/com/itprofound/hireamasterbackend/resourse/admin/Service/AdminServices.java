package com.itprofound.hireamasterbackend.resourse.admin.Service;


import com.itprofound.hireamasterbackend.resourse.admin.Entity.Admin;
import com.itprofound.hireamasterbackend.resourse.admin.Repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServices {
    @Autowired
    private static AdminRepo repo;

    public AdminServices(AdminRepo repo) {
        this.repo = repo;
    }
    public Admin saveOrUpdate(Admin admin) {
        Admin adminSaved = repo.save(admin);
        return adminSaved;
    }

    public Iterable<Admin> listAll() {

        return this.repo.findAll();
    }

    public void deleteAdmin(String id) {
        repo.deleteById(id);
    }

     public static Admin getAdminByID(String adminid) {
        return repo.findById(adminid).get();
    }
}
