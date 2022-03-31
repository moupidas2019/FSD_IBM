package com.ibm.service;

import java.util.List;

import com.ibm.model.Following;

public interface FollowingService {

	Following createFollower(Following following);

	List<Following> getFollowerByMyid(int myid);

	List<Following> getFollowingByUserid(int userid);

	void deleteFollowingByMyidAndUserid(int myid, int userid);

}
