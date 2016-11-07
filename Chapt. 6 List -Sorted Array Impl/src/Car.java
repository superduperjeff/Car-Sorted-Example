
public class Car implements Comparable{
	protected int year;
	protected String make;
	protected String model;
	protected int price;
	
	Car(int y,int p, String mk, String mdl)
	{
		this .year=y;
		this.price=p;
		this.make=mk;
		this.model=mdl;
	}
	public void setYear(int y)
	{
		this.year=y;
	}

	public void setPrice(int p)
	{
		this.price=p;
	}

	public void setMake(String m)
	{
		this.make=m;
	}

	public void setModel(String m)
	{
		this.model=m;
	}

	public int getPrice()
	{
		return this.price;
	}

	public int getYear()
	{
		return this.year;
	}
	
	public String getMake()
	{
		return this.make;
	}

	public String getModel()
	{
		return this.model;
	}
	
	public String toString()
	{
		String ret = "";
		ret+= "Year=" + year;
		ret+="Make="+ make;
		ret+= "Model="+model;
		ret+="Price="+ price;
		return ret;
	}
	public boolean equals(Object c)
	{
		if(this.year==((Car)c).getYear())
			return true;
		else
			return false;
	}
	@Override
	public int compareTo(Object arg0) {
		if (this.make.compareTo(((Car)arg0).getMake()) !=0)
			return this.make.compareTo(((Car)arg0).getMake());
		else
			return this.model.compareTo(((Car)arg0).getModel());
			
	}
}

