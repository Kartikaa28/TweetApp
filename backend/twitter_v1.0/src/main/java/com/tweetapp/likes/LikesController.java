package com.tweetapp.likes;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController
public class LikesController {
	
	@Autowired
	private LikesService likesService;
	

	
	@GetMapping("/tweet/all/likes")
	public List<Likes> getAll(){
		return likesService.getAll();
	}
	
	@PutMapping("/tweet/{uname}/like/{tid}")
	public String updateLikes(@PathVariable String uname,@PathVariable UUID tid, @RequestBody Likes likes) {
		String updatedLikes1 = likesService.updateLikes(uname, tid, likes);	
		return updatedLikes1;
	}
	
	@DeleteMapping("/tweet/{lid}/deletelike")
	public String Delete(@PathVariable UUID lid){
		likesService.deletelike(lid);
		return "Deleted succesfully";
	}

}
