package api.team.project.service;

import java.util.List;

import api.team.project.vo.APITestInfo;

public interface APITestService {

	public List<APITestInfo> getAPITestInfoList(APITestInfo api);
	public APITestInfo getAPITestInfo(Integer apinum);
	public int insertAPITestInfo(APITestInfo api);
	public int deleteAPITestInfo(Integer api);
	public int updateAPITestInfo(APITestInfo api);

}
