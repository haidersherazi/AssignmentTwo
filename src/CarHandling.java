
public class CarHandling {
    public static void main(String[] args) {
        
    	// Create an array of objects as mentioned in the HomeTask 2 Assignment
        
    	Car[] cars = {
            new Car(1, "Toyota", "Corolla", 2015, "Grey", 18000, "LEA231"),
            new Car(2, "Toyota", "Prius", 2019, "Blue", 21000, "LGH323"),
            new Car(3, "Toyota", "Supra", 2022, "Brown", 35000, "HPB909"),
            new Car(4, "Toyota", "Mirai", 2023, "Red", 47500, "GBH342"),
            new Car(5, "Toyota", "Camry", 2020, "Green", 39000, "PGT235"),
            new Car(6, "Toyota", "Sienna", 2021, "Black", 29000, "HLT389"),
            new Car(7, "Toyota", "Venza", 2022, "Black", 62000, "ABC123"),
            new Car(8, "Honda", "Civic", 2017, "Blue", 16000, "SFF163"),
            new Car(9, "Honda", "Accord", 2022, "Grey", 27000, "ABH563"),
            new Car(10, "Honda", "City", 2019, "White", 14000, "PKG323"),
            new Car(11, "Ford", "Mustang", 2022, "Black", 28000, "POS789"),
            new Car(12, "Kia", "Picanto", 2020, "White", 13000, "HGY567"),
            new Car(13, "Kia", "Rio", 2023, "Blue", 23000, "DGS236"),
            new Car(14, "Kia", "Sportage", 2019, "Brown", 38000, "RYT009"),
            new Car(15, "Kia", "Spectra", 2010, "Grey", 11000, "AET936"),
            
        };

        
        // (a) a list of cars of a given brand
        FileManager.saveCarsByBrand(cars, "Honda", "CarsByBrand.txt");

        // (b) a list of cars of a given model that have been in use for more than n years
        FileManager.saveCarsByAgeAndModel(cars, "Picanto", 2, "CarsByAgeAndModel.txt");
        
        // (c) a list of cars of a given year of manufacture, the price of which is higher than the specified one
        FileManager.saveCarsByPriceAndYear(cars, 2019, 18000, "CarsByPriceAndYear.txt");
    }

   
}