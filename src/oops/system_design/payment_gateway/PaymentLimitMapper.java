package oops.system_design.payment_gateway;

import java.util.List;

public class PaymentLimitMapper {
	
	public List<PaymentType> getTypes() {
		return types;
	}
	public void setTypes(List<PaymentType> types) {
		this.types = types;
	}
	public PurchaseTypeEnum getPurchaseType() {
		return purchaseType;
	}
	public void setPurchaseType(PurchaseTypeEnum purchaseType) {
		this.purchaseType = purchaseType;
	}
	List<PaymentType> types;
	PurchaseTypeEnum purchaseType;
}
