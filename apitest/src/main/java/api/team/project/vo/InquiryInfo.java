package api.team.project.vo;


public class InquiryInfo {
	private Integer inquiryNumber;
	private String inquiryTitle;
	private String inquiryText;
	private String inquiryImage;

	public Integer getInquiryNumber() {
		return inquiryNumber;
	}

	public void setInquiryNumber(Integer inquiryNumber) {
		this.inquiryNumber = inquiryNumber;
	}

	public String getInquiryTitle() {
		return inquiryTitle;
	}

	public void setInquiryTitle(String inquiryTitle) {
		this.inquiryTitle = inquiryTitle;
	}

	public String getInquiryText() {
		return inquiryText;
	}

	public void setInquiryText(String inquiryText) {
		this.inquiryText = inquiryText;
	}

	public String getInquiryImage() {
		return inquiryImage;
	}

	public void setInquiryImage(String inquiryImage) {
		this.inquiryImage = inquiryImage;
	}

	public InquiryInfo() {
		
	}

	/**
	 * @param inquiryNumber
	 * @param inquiryTitle
	 * @param inquiryText
	 * @param inquiryImage
	 */
	public InquiryInfo(Integer inquiryNumber, String inquiryTitle, String inquiryText, String inquiryImage) {
		this.inquiryNumber = inquiryNumber;
		this.inquiryTitle = inquiryTitle;
		this.inquiryText = inquiryText;
		this.inquiryImage = inquiryImage;
	}

	@Override
	public String toString() {
		return "InquiryInfo [inquiryNumber=" + inquiryNumber + ", inquiryTitle=" + inquiryTitle + ", inquiryText=" + inquiryText + ", inquiryImage=" + inquiryImage + "]";
	}
	
}
