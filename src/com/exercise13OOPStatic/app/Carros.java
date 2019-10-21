package com.exercise13OOPStatic.app;
import com.exercise13OOPStatic.model.Car;
public class Carros {

	public static void main(String[] args) {
		
		/*Car Cyan = new Car("122101",4);
		Car Bear = new Car("233203",2);
		Car Snake = new Car("181709",2);
		Car Pablo = new Car("SerialNumber1",4);
		Car Alex = new Car("SerialNumeber2",2);*/
		
		Car bear = new Car();
		bear.setSerialNumber("1");
		bear.setNumberDoors(4);
		bear.setBrand("Volvo");
		System.out.println("Bear "+"\n"+bear.ToString());
		
		Car snake = new Car();
		snake.setSerialNumber("2");
		snake.setNumberDoors(4);
		snake.setBrand("Honda");
		System.out.println("Snake "+"\n"+snake.ToString());
		
		Car blueH = new Car();
		blueH.setSerialNumber("3");
		blueH.setNumberDoors(4);
		blueH.setBrand("Volvo");
		System.out.println("Blue Hacker"+"\n"+blueH.ToString());
		
		Car dvirus = new Car();
		dvirus.setSerialNumber("4");
		dvirus.setNumberDoors(4);
		dvirus.setBrand("Honda");
		System.out.println("Dvirus "+"\n"+dvirus.ToString());
		
		
		dvirus.CarIsCoupe(true);
		System.out.println("\n'After change it to private static'");
		System.out.println("Bear "+"\n"+bear.ToString());
		System.out.println("Snake "+"\n"+snake.ToString());
		System.out.println("Blue Hacker"+"\n"+blueH.ToString());
		System.out.println("Dvirus "+"\n"+dvirus.ToString());
		
		dvirus.numberDoors = 3;
		System.out.println("\n'After change it to public static'");
		System.out.println("Bear "+"\n"+bear.ToString());
		System.out.println("Snake "+"\n"+snake.ToString());
		System.out.println("Blue Hacker"+"\n"+blueH.ToString());
		System.out.println("Dvirus "+"\n"+dvirus.ToString());
	}

}
