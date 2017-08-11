package contract;

import java.util.Date;

public class Contract {
	int contractId;
	int fresherId;
	Date contractDate;
	String contractContent;
	
	public int getContractId() {
		return contractId;
	}
	public void setContractId(int contractId) {
		this.contractId = contractId;
	}
	public int getFresherId() {
		return fresherId;
	}
	public void setFresherId(int fresherId) {
		this.fresherId = fresherId;
	}
	public Date getContractDate() {
		return contractDate;
	}
	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}
	public String getContractContent() {
		return contractContent;
	}
	public void setContractContent(String contractContent) {
		this.contractContent = contractContent;
	}
}
