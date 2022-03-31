package com.ibm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.model.Following;
import com.ibm.service.FollowingService;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FollowingController {
	
	@Autowired
	FollowingService followingService;
	
	@PostMapping("/follow/create")
	public Following createFollower(@RequestBody Following following) {
    	
		return followingService.createFollower(following);
    }

	 @GetMapping("/follow/following/{myid}")
	 public List<Following> getFollowing(@PathVariable int myid) {	 
		 return followingService.getFollowerByMyid(myid);
	 }
	 
	 @GetMapping("/follow/follower/{userid}")
	 public List<Following> getFollower(@PathVariable int userid){	 
		 return followingService.getFollowingByUserid(userid);
	 }
	 
	 @DeleteMapping("/follow/delete/{myid}/{userid}")
	 public void deleteFollowing(@PathVariable int myid,@PathVariable int userid)
	 {
		 followingService.deleteFollowingByMyidAndUserid(myid,userid);
	 }
}
