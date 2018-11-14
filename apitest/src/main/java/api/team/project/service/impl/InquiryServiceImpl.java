package api.team.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.team.project.dao.InquiryDAO;
import api.team.project.service.InquiryService;
import api.team.project.vo.InquiryInfo;
@Service
public class InquiryServiceImpl implements InquiryService{

	@Autowired
	private InquiryDAO inquiryDAO;
	@Override
	public List<InquiryInfo> getInquiryInfoList(InquiryInfo inquiryInfo) {
		// TODO Auto-generated method stub
		return inquiryDAO.getInquiryInfoList(inquiryInfo);
	}

	@Override
	public InquiryInfo getInquiryInfo(Integer inquiryNumber) {
		// TODO Auto-generated method stub
		return inquiryDAO.getInquiryInfo(inquiryNumber);
	}

	@Override
	public int insertInquiryInfo(InquiryInfo inquiryInfo) {
		// TODO Auto-generated method stub
		return inquiryDAO.insertInquiryInfo(inquiryInfo);
	}

	@Override
	public int deleteInquiryInfo(Integer inquiryNumber) {
		// TODO Auto-generated method stub
		return inquiryDAO.deleteInquiryInfo(inquiryNumber);
	}

	@Override
	public int updateInquiryInfo(InquiryInfo inquiryInfo) {
		// TODO Auto-generated method stub
		return inquiryDAO.updateInquiryInfo(inquiryInfo);
	}

}
