package entities;

public class ImportProduct extends Product {

	public Double customFee;

	public ImportProduct() {
		super();
	}

	public ImportProduct(String name, double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;		
	}

	public double totalPrice() {
		return customFee+super.price;
	}
		
	@Override
	public final String priceTag() {
		return getName()
					+" $"
					+  String.format("%.2f",totalPrice())
					+" (Customs fee: $"
					+ String.format("%.2f",customFee)
					+")";			
	}

}
