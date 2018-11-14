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

import api.team.project.service.InquiryService;
import api.team.project.vo.APITestInfo;
import api.team.project.vo.InquiryInfo;
import api.team.project.vo.InquiryInfo;

@Controller
public class InquiryController {
	@Autowired
	private InquiryService inquiryService;

	@RequestMapping(value = "/inquiryservice", method = RequestMethod.GET)
	public @ResponseBody List<InquiryInfo> getInquiryInfoList(@ModelAttribute InquiryInfo inquiryInfo) {
		return inquiryService.getInquiryInfoList(inquiryInfo);
	}
	
	@RequestMapping(value = "/inquiryservice/{inquiryNumber}", method = RequestMethod.POST)
	public @ResponseBody InquiryInfo getInquiryInfo(@PathVariable Integer inquiryNumber) {
		return inquiryService.getInquiryInfo(inquiryNumber);
	}

	@RequestMapping(value = "/inquiryservice", method = RequestMethod.POST)
	@ResponseBody
	public Integer insertInquiryInfo(@RequestBody InquiryInfo inquiryInfo) throws Exception {
		return inquiryService.insertInquiryInfo(inquiryInfo);
	}

	@RequestMapping(value = "/inquiryservice/{inquiryNumber}", method = RequestMethod.PUT)
	@ResponseBody
	public Integer updateInquiryInfo(@RequestBody InquiryInfo api, @PathVariable Integer inquiryNumber) throws Exception {
		api.setInquiryNumber(inquiryNumber);

		return inquiryService.updateInquiryInfo(api);
	}

	@RequestMapping(value = "/inquiryservice/{inquiryNumber}", method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteInquiryInfo(@PathVariable int inquiryNumber) {
		return inquiryService.deleteInquiryInfo(inquiryNumber) + "";
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


