package api.team.project.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import api.team.project.dao.APITestDAO;
import api.team.project.vo.APITestInfo;

@Repository
public class APITestDAOImpl implements APITestDAO{

	private SqlSession SqlSession;
	@Override
	public List<APITestInfo> getAPITestInfoList(APITestInfo api) {
		// TODO Auto-generated method stub
		return SqlSession.selectList("SQL.APITestInfo.selectAPITestInfoList", api);
	}

	@Override
	public APITestInfo getAPITestInfoList(Integer linum) {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("SQL.APITestInfo.selectapinum");
	}

	@Override
	public int insertAPITestInfo(APITestInfo api) {
		// TODO Auto-generated method stub
		return SqlSession.insert("SQL.APITestInfo.insertAPITestInfo",api);
	}

	@Override
	public int deleteAPITestInfo(int apinum) {
		// TODO Auto-generated method stub
		return SqlSession.delete("SQL.APITestInfo.deleteAPITestInfo",apinum);
	}

	@Override
	public int updateAPITestInfo(APITestInfo api) {
		// TODO Auto-generated method stub
		return SqlSession.update("SQL.APITestInfo.updateAPITestInfo",api);
	}

}
