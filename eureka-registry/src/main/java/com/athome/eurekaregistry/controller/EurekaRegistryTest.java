package com.athome.eurekaregistry.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanjirui
 * @create 2020-12-24
 */
@RestController
@RequestMapping("/eurekaRegistry")
public class EurekaRegistryTest {

    @RequestMapping(value = "/test", method = { RequestMethod.GET })
    public String welCome() {
        return "Hello, Hello";
    }



}
