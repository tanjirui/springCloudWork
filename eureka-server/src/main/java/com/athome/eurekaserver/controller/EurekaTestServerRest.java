package com.athome.eurekaserver.controller;

import com.athome.eurekaserver.model.IpModel;
import com.athome.eurekaserver.model.ResultModel;
import com.athome.eurekaserver.utils.IPUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author tanjirui
 * @create 2020-12-24
 */
@RestController
@RequestMapping("/eurekaServer")
public class EurekaTestServerRest {

    @RequestMapping(value = "/ip", method = { RequestMethod.GET })
    public ResultModel welCome(HttpServletRequest request) {
        IpModel ipModel = new IpModel();
        ipModel.setClientIpAddress(IPUtil.getIpAddr(request));
        ipModel.setServerIpAddress(IPUtil.localIp());
        return ResultModel.ok(ipModel);
    }
}