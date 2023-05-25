class Animal
{
	void makeSound()
	{
		System.out.println("Animal");
	}
}
class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("Dog");
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Cat");
	}
}
public class Assignment3Q4 {
	public static void main(String[] args)
	{
		Animal a= new Animal();
		a.makeSound();
		Dog d = new Dog();
		d.makeSound();
		Cat c= new Cat();
		c.makeSound();
	}
}
