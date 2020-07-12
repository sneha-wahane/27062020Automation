package functions;

public class CarUser {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.colour="White";
		car1.capacity=5;
		car1.features();
		Car car2=new Car();
		car2.colour="Black";
		car2.capacity=6;
		car2.features();
		Car car3=new Car();
		car3.colour="Red";
		car3.capacity=7;
		car3.features();
		Car car4=new Car("Silver",5);
		car4.features();

	}

}
