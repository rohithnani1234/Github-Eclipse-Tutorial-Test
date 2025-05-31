package manufacturermain;

import com.manufacturer.Manufacturer;
import com.product.Product;

public class ManufacturerMain {

	public static void main(String[] args) {
		System.out.println("Manufacture:");
		Manufacturer manufacturer=Manufacturer.getManufacturerObject("Alex", "USA", "7854120369");
		Product product=Product.getProductObject("Car", "Ferrari", manufacturer, 78965);
		if(manufacturer==null || product==null) {
			System.out.println("Invalid product/manufacturer information.");
		}
		else {
			System.out.println("---Product Details---");
			System.out.println(product);
		}
		System.out.println("---ManufactureDratils---");
		System.out.println(manufacturer);
		

	}

}
