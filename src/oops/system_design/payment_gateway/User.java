package oops.system_design.payment_gateway;

import java.util.List;

public class User {
	
	String userId;
	List<UserPaymentInstrument> paymentModes;
	DeviceContext context;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<UserPaymentInstrument> getPaymentModes() {
		return paymentModes;
	}
	public void setPaymentModes(List<UserPaymentInstrument> paymentModes) {
		this.paymentModes = paymentModes;
	}
	public DeviceContext getContext() {
		return context;
	}
	public void setContext(DeviceContext context) {
		this.context = context;
	}
	

}
