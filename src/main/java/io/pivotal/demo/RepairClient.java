package io.pivotal.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("openings")
public interface RepairClient {

    @RequestMapping(method = RequestMethod.GET, value = "/ServiceOpenings/${dealerId}")
    List<Schedule> openings(@RequestParam("dealerId") Long dealerId);

}
