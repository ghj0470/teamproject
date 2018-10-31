package api.team.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import api.team.project.service.APITestService;
import api.team.project.vo.APITestInfo;

@Controller
public class APITestController {

	@Autowired
	private APITestService apitestservice;

	@RequestMapping(value = "/APITestInfo", method = RequestMethod.GET)
	public @ResponseBody List<APITestInfo> getAPITestInfoapist(@ModelAttribute APITestInfo api) {
		return apitestservice.getAPITestInfoList(api);
	}

	@RequestMapping(value = "/APITestInfo/{apinum}", method = RequestMethod.POST)
	public @ResponseBody APITestInfo getAPITestInfo(@PathVariable Integer apinum) {
		return apitestservice.getAPITestInfo(apinum);
	}

	@RequestMapping(value = "/APITestInfo", method = RequestMethod.POST)
	@ResponseBody
	public Integer insertAPITestInfo(@RequestBody APITestInfo api) throws Exception {
		return apitestservice.insertAPITestInfo(api);
	}

	@RequestMapping(value = "/APITestInfo/{apinum}", method = RequestMethod.PUT)
	@ResponseBody
	public Integer updateAPITestInfo(@RequestBody APITestInfo api, @PathVariable Integer apinum) throws Exception {
		api.setApinum(apinum);

		return apitestservice.updateAPITestInfo(api);
	}

	@RequestMapping(value = "/APITestInfo/{apinum}", method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteAPITestInfo(@PathVariable int apinum) {
		return apitestservice.deleteAPITestInfo(apinum) + "";
	}
	
	@RequestMapping(value = "/uri/{rocate}", method = RequestMethod.GET)
	public String uriRocater(HttpServletResponse res, @PathVariable String rocate) {
		if(rocate.indexOf(":") != 0) {
			rocate = rocate.replace(":", "/");
		}
		res.setContentType("text/html; charset=UTF-8");
		return rocate;
	}

}
