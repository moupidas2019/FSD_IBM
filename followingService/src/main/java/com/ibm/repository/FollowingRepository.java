package com.ibm.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.model.Following;

@Repository
public interface FollowingRepository extends CrudRepository<Following, Integer> {

	List<Following> getByMyid(Integer myid);
	
	List<Following> getByUserid(Integer userid);
	
	@Transactional
	void deleteByMyidAndUserid(Integer myid, Integer userid);
}
