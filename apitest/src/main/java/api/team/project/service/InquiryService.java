package api.team.project.service;

import java.util.List;

import api.team.project.vo.InquiryInfo;

public interface InquiryService {
	public List<InquiryInfo> getInquiryInfoList(InquiryInfo inquiryInfo);
	public InquiryInfo getInquiryInfo(Integer inquiryNumber);
	public int insertInquiryInfo(InquiryInfo inquiryInfo);
	public int deleteInquiryInfo(Integer inquiryNumber);
	public int updateInquiryInfo(InquiryInfo inquiryInfo);
}
