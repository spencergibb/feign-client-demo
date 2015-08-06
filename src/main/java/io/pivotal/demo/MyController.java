package io.pivotal.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MyController {
	
	@Autowired
	private RepairClient repairClient;
	
    @RequestMapping("/dealershipOpenings")
	public @ResponseBody List<Schedule> dealershipOpenings(@RequestParam(required=true) Long dealerId) {
		return repairClient.openings(dealerId);
	} 
}
