package api.team.project.vo;

import org.apache.ibatis.type.Alias;

@Alias("api")
public class APITestInfo {
	private Integer apinum;
	private String apiname;
	private String apidesc;
	private Integer apilowprice;

	public Integer getApinum() {
		return apinum;
	}

	public void setApinum(Integer apinum) {
		this.apinum = apinum;
	}

	public String getApiname() {
		return apiname;
	}

	public void setApiname(String apiname) {
		this.apiname = apiname;
	}

	public String getApidesc() {
		return apidesc;
	}

	public void setApidesc(String apidesc) {
		this.apidesc = apidesc;
	}

	public Integer getApilowprice() {
		return apilowprice;
	}

	public void setApilowprice(Integer apilowprice) {
		this.apilowprice = apilowprice;
	}

	@Override
	public String toString() {
		return "ApiTestInfo [apinum=" + apinum + ", apiname=" + apiname + ", apidesc=" + apidesc + ", apilowprice=" + apilowprice + "]";
	}

}
