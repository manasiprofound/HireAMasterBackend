package com.itprofound.hireamasterbackend.resourse.admin.Controller;

import com.itprofound.hireamasterbackend.resourse.admin.Entity.Admin;
import com.itprofound.hireamasterbackend.resourse.admin.Service.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController

@RequestMapping("/api/v1/admin")
public class AdminController {

    @Autowired
    private AdminServices adminServices;


    @PostMapping("/save")
    private Admin saveAdmin(@RequestBody Admin admins)
    {
        Admin newAdmin = adminServices.saveOrUpdate(admins);
        return newAdmin;
    }

    @GetMapping(value = "/getAll")
    public Iterable<Admin>getAdmins()
    {
        return adminServices.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    public Admin update(@RequestBody Admin admin,@PathVariable(name="id")String _id )
    {
        admin.setId(_id);
        adminServices.saveOrUpdate(admin);
        return admin;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteAdmin(@PathVariable("id") String id)
    {
        adminServices.deleteAdmin(id);
    }

    @RequestMapping("/admin/{id}")
    private Admin getAdmins(@PathVariable(name="id") String adminid)
    {
        return AdminServices.getAdminByID(adminid);
    }

}
