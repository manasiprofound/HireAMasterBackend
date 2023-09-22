package com.itprofound.hireamasterbackend.resourse.admin.Repo;

import com.itprofound.hireamasterbackend.resourse.admin.Entity.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepo extends MongoRepository<Admin, String> {
}
