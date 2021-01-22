package Assignment3;

public class Invoice implements payable{
	String partNum;
	String partDesription;
    int quantity;
    double pricePerItem;
	public Invoice(String partNum, String partDesription, int quantity, double pricePerItem) {
		super();
		this.partNum = partNum;
		this.partDesription = partDesription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	public String getPartNum() {
		return partNum;
	}
	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}
	public String getPartDesription() {
		return partDesription;
	}
	public void setPartDesription(String partDesription) {
		this.partDesription = partDesription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	public double  getPayment() {
		return pricePerItem*quantity;
		
	}
    

}
