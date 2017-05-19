package org.springcloud.eurekaclient.web;

import org.springcloud.eurekaclient.api.UserServerApi;
import org.springcloud.eurekaclient.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by SDD on 2017/5/18.
 */
@RestController
public class IndexController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private UserServerApi userServerApi;

	@RequestMapping(value = "/", produces = "application/json")
	public User home() {

		// 方法一：restTemplate
		//User user = restTemplate.getForEntity("http://client1/user/20", User.class).getBody();

		// 方法二：FeignClient
		User user = userServerApi.findOne(20L);
		return user;
	}


}
