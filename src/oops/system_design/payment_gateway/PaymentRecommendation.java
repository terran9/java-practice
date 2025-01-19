package oops.system_design.payment_gateway;

import java.util.List;

public class PaymentRecommendation {
	public List<UserPaymentInstrument> getRecommendedPaymentTypes(User user, Cart cart){
		
		
		PurchaseTypeEnum purchaseType = cart.getCartType();
		
		List<UserPaymentInstrument> availablePaymentsForUser = user.getPaymentModes();
		boolean isUpiEnabled = user.getContext().isUpiEnabled();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return null;
		
	}
}
