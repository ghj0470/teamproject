package api.team.project.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import api.team.project.dao.InquiryDAO;
import api.team.project.vo.InquiryInfo;

@Repository
public class InquiryDAOImpl implements InquiryDAO{

	private SqlSession SqlSession;
	@Override
	public List<InquiryInfo> getInquiryInfoList(InquiryInfo inquiryInfo) {
		// TODO Auto-generated method stub
		return SqlSession.selectList("SQL.InquiryInfo.selectInquiryInfoList",inquiryInfo);
	}

	@Override
	public InquiryInfo getInquiryInfo(Integer inquiryNumber) {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("SQL.InquiryInfo.selectinquiryNumber");
	}

	@Override
	public int insertInquiryInfo(InquiryInfo inquiryInfo) {
		// TODO Auto-generated method stub
		return SqlSession.insert("SQL.InquiryInfo.insertInquiryInfo",inquiryInfo);
	}

	@Override
	public int deleteInquiryInfo(int inquiryNumber) {
		// TODO Auto-generated method stub
		return SqlSession.delete("SQL.InquiryInfo.deleteInquiryInfo",inquiryNumber);
	}

	@Override
	public int updateInquiryInfo(InquiryInfo inquiryInfo) {
		// TODO Auto-generated method stub
		return SqlSession.update("SQL.InquiryInfo.updateInquiryInfo",inquiryInfo);
	}

}
