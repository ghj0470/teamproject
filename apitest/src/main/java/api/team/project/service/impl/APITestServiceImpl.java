package api.team.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.team.project.dao.APITestDAO;
import api.team.project.service.APITestService;
import api.team.project.vo.APITestInfo;

@Service
public class APITestServiceImpl implements APITestService{
	
	@Autowired
	private APITestDAO apitestdao;

	@Override
	public List<APITestInfo> getAPITestInfoList(APITestInfo api) {
		// TODO Auto-generated method stub
		return apitestdao.getAPITestInfoList(api);
	}

	@Override
	public APITestInfo getAPITestInfo(Integer apinum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertAPITestInfo(APITestInfo api) {
		// TODO Auto-generated method stub
		return apitestdao.insertAPITestInfo(api);
	}
	@Override
	public int deleteAPITestInfo(Integer apinum) {
		// TODO Auto-generated method stub
		return apitestdao.deleteAPITestInfo(apinum);
	}


	@Override
	public int updateAPITestInfo(APITestInfo api) {
		// TODO Auto-generated method stub
		return apitestdao.updateAPITestInfo(api);
	}



}
