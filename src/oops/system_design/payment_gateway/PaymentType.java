package oops.system_design.payment_gateway;

public class PaymentType {
	PaymentTypeEnum type;
	Long limit;
	boolean isEnabled;
	public PaymentTypeEnum getType() {
		return type;
	}
	public void setType(PaymentTypeEnum type) {
		this.type = type;
	}
	public Long getLimit() {
		return limit;
	}
	public void setLimit(Long limit) {
		this.limit = limit;
	}
	public boolean isEnabled() {
		return isEnabled;
	}
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
}
