package com.athome.eurekaclient.feign;

import com.athome.eurekaclient.model.ResultModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author tanjirui
 * @create 2020-12-24
 */
@FeignClient("eurekaServer")
public interface IpInfoService {

    @RequestMapping(method = RequestMethod.GET, value = "/eurekaServer/ip", consumes = "application/json")
    public ResultModel getIpInfo();
}
