package com.library.management.admin.respos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.library.management.admin.model.Lb_Admin_adminsModel;

public interface Lb_Admin_adminsRepos extends MongoRepository<Lb_Admin_adminsModel, Integer>{

	
}
