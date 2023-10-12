import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

	 public static void saveCarsByBrand(Car[] cars, String brand, String filename) {
	        
		 List<Car> filteredCars = new ArrayList<>();
		 
		 for (int i = 0; i < cars.length; i++) {
			 
			 if (cars[i].getMake().equalsIgnoreCase(brand)) {
 
				 filteredCars.add(cars[i]);	            
			 }
		 }
		 
		 saveCarsToFile(filteredCars, filename);
	 }

	    
	 public static void saveCarsByAgeAndModel(Car[] cars, String model, int years, String filename) {
	    
		 List<Car> filteredCars = new ArrayList<>();
		 int currentYear = java.time.Year.now().getValue();
	        
		 for (int i = 0; i < cars.length; i++) {
			 
			 if (cars[i].getModel().equalsIgnoreCase(model) && (currentYear - cars[i].getYearOfManufacture()) > years) {
	         
				 filteredCars.add(cars[i]);   
			 }
		 }
		 
		 saveCarsToFile(filteredCars, filename);
	 }

	    
	 public static void saveCarsByPriceAndYear(Car[] cars, int year, double minPrice, String filename) {
	 
		 List<Car> filteredCars = new ArrayList<>();
	     
		 for (int i = 0; i < cars.length; i++) {
			 
			 if (cars[i].getYearOfManufacture() == year && cars[i].getPrice() > minPrice) {
	         
				 filteredCars.add(cars[i]);   
			 }	 
		 }
	     
		 saveCarsToFile(filteredCars, filename);
	 }


	 public static void saveCarsToFile(List<Car> cars, String filename) {
	 
		 // try catch to safe program from crashes
		 try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
	     
			 for (Car car : cars) {
	         
				 writer.println(car.toString());	            
			 }
	         
			 System.out.println(filename + " updated.");
	        
		 } catch (IOException e) {
	     
			 e.printStackTrace();
		 }
	 }
}
