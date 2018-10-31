package api.team.project.dao;

import java.util.List;

import api.team.project.vo.APITestInfo;

public interface APITestDAO {

	public List<APITestInfo> getAPITestInfoList(APITestInfo api);
	public APITestInfo getAPITestInfoList(Integer apinum);
	public int insertAPITestInfo(APITestInfo api);
	public int deleteAPITestInfo(int apinum);
	public int updateAPITestInfo(APITestInfo api);
}
