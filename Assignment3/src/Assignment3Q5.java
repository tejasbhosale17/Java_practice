class Car
{
	void speed()
	{
		System.out.println("Car Speed is 120km/h");
	}
}
class Maruti extends Car
{
	void speed()
	{
		System.out.println("Maruti speed is 60km/h");
	}
}
class Alto extends Car
{
	void speed()
	{
		System.out.println("Alto speed is 70km/h");
	}
}
class Brezza extends Car
{
	void speed()
	{
		System.out.println("Alto speed is 80km/h");
	}
}
public class Assignment3Q5 {
	public static void main(String[] agrs)
	{
		Car c= new Car();
		c.speed();
		Maruti m= new Maruti();
		m.speed();
		Alto a = new Alto();
		a.speed();
		Brezza b = new Brezza();
		b.speed();
	}
}
