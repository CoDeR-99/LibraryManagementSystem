package com.library.management.admin.respos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.library.management.admin.model.MemberModel;

public interface Lb_MemberRepos extends MongoRepository<MemberModel, Integer> {

	List<MemberModel> findByUstatus(Integer Ustatus);

	List<MemberModel> findByUrecstatus(Integer Urecstatus);

}
