package com.library.management.admin.service;

import java.util.List;

import com.library.management.admin.model.Lb_Admin_adminsModel;
import com.library.management.admin.model.MemberModel;

public interface Lb_Admin_Sevice {

	List<Lb_Admin_adminsModel> GetAdminList();

	Lb_Admin_adminsModel getByID(String id);

	List<MemberModel>  GetAll();

	Boolean AddMember(MemberModel bmodel);

	Boolean DeleteById(String id);

	Boolean UpdateMember(String id, MemberModel bmodel);

	MemberModel GetMemberByID(String id);

	List<MemberModel> GetBYStatus(String ustatus);

	List<MemberModel> GetBYRecStatus(String urecstatus);

}
