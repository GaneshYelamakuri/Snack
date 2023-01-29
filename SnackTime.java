package com.jsp.vegpack;
import java.util.Scanner;

class Vegtable
{
	public void washingLogic() 
	{
		System.out.println("Salt and luke warm water are good to wash");
	}
	
}
class Carrot extends Vegtable 
{
	public void prepareCarrotHalwa() 
	{
		System.out.println("halwa is a tradional sweet");
	}
	
}
class Potato extends Vegtable
{
	public void PrepareFrenchFries() 
	{
		System.out.println("Fries are very tasty");

	}
	
}
class Shopkeeper
{
	public Vegtable sell(String vegName) 
	{

		if(vegName.equalsIgnoreCase("Carrot"))
		{
			System.out.println(vegName+" is availble");
			return  new Carrot();
		}
		if(vegName.equalsIgnoreCase("Potato"))
		{
			System.out.println(vegName+" is availble");
			return  new Potato();
		}
		System.out.println(vegName+" is  not availble");
		return null;

	}
}

public class SnackTime 
{
	public static void main(String [] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Available vegetables ");
		System.out.println("Potato");
		System.out.println("carrot");
		System.out.println("Vegtable Name:");
		String vegName = scn.nextLine();
		
		Shopkeeper shop=new Shopkeeper();
		Vegtable veg=shop.sell(vegName);
		
		if(veg instanceof Carrot) 
		{
			veg.washingLogic();
			((Carrot)veg).prepareCarrotHalwa();
		}
		if(veg instanceof Potato) 
		{
			veg.washingLogic();
			((Potato)veg).PrepareFrenchFries();
		}else System.out.println("select the available vegtable :)");

	}

}
