import java.util.*;
public class UsesListInterface {
	public static void main(String[] args)
	  {
/*		ListInterface<String> list1 = new ArraySortedList<String>(3) ;
		list1. add("Wirth") ;
		list1. add("Dykstra") ;
		list1. add("DePasquale") ;
		list1. add("Dahl") ;
		list1. add("Nygaard") ;
		list1. remove("DePasquale") ;

				
		System. out. print("Sorted ") ;
		System. out. println(list1) ;
*/		
		ListInterface<Car> list1 = new ArraySortedList<Car>(3) ;
		Car c1=new Car(2007,12000,"Toyota","Sedan");
		list1.add(c1);
		Car c2=new Car(2008,2000,"Nissan","Crossover");
		list1.add(c2);
		Car c4=new Car(2015,2000,"Toyota","No Idea");
		list1.add(c4);
		System. out. print("Sorted ") ;
		System. out. println(list1) ;
		if(list1.contains(c1)){
			System. out.print("Car 1 was found!!!");
			System.out.println("/n Comparison ********************* " + c1.compareTo(c4) + " here");
		}
		Car c3=new Car(2007,12000,"Toyota","Sedan");
		
		if(list1.contains(c3)){
			System. out.print("Car 3 was found!!!");
			System.out.println(c1.compareTo(c3));
		}
		else
		{
			System. out.print("Car 3 was NOT found!!!");
		}
		System. out.print("The cost of the items in the list is ... "+getTotalPrice(list1));
	  }
		
public static Integer getTotalPrice(ListInterface<Car> list)
{
	Integer tot = 0;
	list.reset();
	int numItems=list.size();
	for (int i=1;i<=numItems;i++)
	{
		Car c = list.getNext();
		tot += c.getPrice();
	}
	return tot;
}
}
