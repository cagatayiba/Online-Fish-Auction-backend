package com.G01.onlineFishAuction.dataAccess;

import java.util.List;

import com.G01.onlineFishAuction.entities.CooperativeMember;

public interface ICooperativeMemberRepository {
	List<CooperativeMember> getAll();
	CooperativeMember getMember(String username);
	void recordMember(CooperativeMember member);
	void delete(CooperativeMember member);

}
