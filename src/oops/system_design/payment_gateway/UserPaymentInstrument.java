package oops.system_design.payment_gateway;



public class UserPaymentInstrument {
	String issuer;
	Double relevanceScore;
	PaymentTypeEnum type;
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public Double getRelevanceScore() {
		return relevanceScore;
	}
	public void setRelevanceScore(Double relevanceScore) {
		this.relevanceScore = relevanceScore;
	}
	public PaymentTypeEnum getType() {
		return type;
	}
	public void setType(PaymentTypeEnum type) {
		this.type = type;
	}
}
