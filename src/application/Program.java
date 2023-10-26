package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dpt = new Department(2, "Ned");
		
		Seller seller = new Seller(19, "Ned", "Nedson.junior91@gmail.com", new Date(), 4000.0, dpt);
		
		System.out.println(seller);
		
		
	}

}
