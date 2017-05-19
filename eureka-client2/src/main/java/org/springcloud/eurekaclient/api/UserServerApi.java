package org.springcloud.eurekaclient.api;

import org.springcloud.eurekaclient.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by SDD on 2017/5/19.
 */
@FeignClient("client1")
public interface UserServerApi {

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET, produces = "application/json")
	User findOne(@PathVariable("id") Long id);

}