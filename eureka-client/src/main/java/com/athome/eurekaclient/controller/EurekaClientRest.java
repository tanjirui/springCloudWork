package com.athome.eurekaclient.controller;

import com.athome.eurekaclient.feign.IpInfoService;
import com.athome.eurekaclient.model.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanjirui
 * @create 2020-12-24
 */
@RestController
@RequestMapping("/eurekaClient")
public class EurekaClientRest {

    @Autowired
    IpInfoService ipInfoService;
	
	private String name;

    @RequestMapping(value = "/test", method = { RequestMethod.GET })
    public String test() {
        return "Hello, Hello";
    }

    @RequestMapping(value = "/ip", method = { RequestMethod.GET })
    public ResultModel ip() {
        return ipInfoService.getIpInfo();
    }
}
