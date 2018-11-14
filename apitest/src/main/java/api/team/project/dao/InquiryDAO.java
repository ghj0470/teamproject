package api.team.project.dao;

import java.util.List;

import api.team.project.vo.InquiryInfo;

public interface InquiryDAO {
	public List<InquiryInfo> getInquiryInfoList(InquiryInfo inquiryInfo);
	public InquiryInfo getInquiryInfo(Integer inquiryNumber);
	public int insertInquiryInfo(InquiryInfo inquiryInfo);
	public int deleteInquiryInfo(int inquiryNumber);
	public int updateInquiryInfo(InquiryInfo inquiryInfo);
}
