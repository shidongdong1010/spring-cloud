package org.springcloud.eurekaclient.web;

import org.springcloud.eurekaclient.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SDD on 2017/5/18.
 */
@RestController
public class IndexController {

	@RequestMapping("/")
	public String home() {
		return "Hello world";
	}

	@RequestMapping(value = "/users/{id}", produces = "application/json")
	public User findByid(@PathVariable("id") Long id){
		User user = new User();
		user.setId(id);
		user.setUsername("梦话");
		user.setAge(11);
		return user;
	}

}
