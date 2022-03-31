package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.model.Following;
import com.ibm.repository.FollowingRepository;

@Service
public class FollowingServiceImpl implements FollowingService{

	@Autowired
	FollowingRepository followingRepository;

	@Override
	public Following createFollower(Following following) {
		return followingRepository.save(following);
	}

	@Override
	public List<Following> getFollowerByMyid(int myid) {
		return followingRepository.getByMyid(myid);
	}

	@Override
	public List<Following> getFollowingByUserid(int userid) {
		return followingRepository.getByUserid(userid);
	}

	@Override
	public void deleteFollowingByMyidAndUserid(int myid, int userid) {
		followingRepository.deleteByMyidAndUserid(myid, userid);		
	}
}
