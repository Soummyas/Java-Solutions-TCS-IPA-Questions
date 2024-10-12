//correct code : 
/*
import java.util.Scanner;

class Footwear{
    private int id;
    private String name;
    private String type;
    private  int price;

    public Footwear(int id,String name, String type, int price ){
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }
    //getter
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public int getPrice(){
        return this.price;
    }
}
public class FootwearMain {
  public static int getCountByType(Footwear [] f, String t){
    int count = 0;
    for (int i = 0; i < f.length; i++) {
        if(f[i].getType().equalsIgnoreCase(t)){
            count++;
        }
    }
    return count;
  }

public static Footwear getSecondHighestPriceByBrand(Footwear[] f, String n) {
   
    int H = Integer.MIN_VALUE;
    for (int i = 0; i < f.length; i++) {
       if(f[i].getName().equalsIgnoreCase(n) && f[i].getPrice() > H){
        H= f[i].getPrice();
       }    
    }

    int secondH = Integer.MIN_VALUE;
    for (int i = 0; i < f.length; i++) {
        if(f[i].getName().equalsIgnoreCase(n) && f[i].getPrice() < H &&  f[i].getPrice() > secondH){
         secondH = f[i].getPrice();
        }
     }

     Footwear ans = null;
      //as we have to return an object then, we will itterate through loop to find the value of that second higest and assign ans as f[i] as we cant return int wehn return type is object
    //Logic :  In loop  if second higest (int we found as 'secondH') is same as f[i].getprice() then we assign that f[i] to ans as ans  = f[i];
      for (int i = 0; i < f.length; i++) {
          if(f[i].getName().equalsIgnoreCase(n) && f[i].getPrice() == secondH){
            ans = f[i];
            break;
          }
          
      }

    return ans;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Footwear [] f = new Footwear[5];
        for (int i = 0; i < f.length; i++) {
            int a = sc.nextInt(); sc.nextLine();
            String b =  sc.nextLine();;
            String c =  sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            f[i] = new Footwear(a, b, c, d);
        }
        String t = sc.nextLine();
        String n = sc.nextLine();
        
        int ans1 = getCountByType(f, t);
        Footwear ans2 = getSecondHighestPriceByBrand(f, n);
        
        if(ans1 != 0){
            System.out.println(ans1);
        }
        else{
            System.out.println("Footwear not available");
        }
        
        if(ans2 !=null){
            System.out.println(ans2.getId());
            System.out.println(ans2.getName());
            System.out.println(ans2.getPrice());
        }
        else{
            System.out.println("Brand not available");
        }
        sc.close();

    }
}

*/

package IPA2;
import java.util.*;
public class footwearProgram
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		Footwear[] ft = new Footwear[5];
		for(int i=0; i<5; i++)
		{
			int a = sc.nextInt();sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();sc.nextLine();

			ft[i]=new Footwear(a,b,c,d);
		}
	
		String ftType = sc.nextLine();
		String ftName = sc.nextLine();
		int count = getCountByType(ft,ftType);
		if(count>0)
		{
			System.out.println(count);
		}
		else
		{
			System.out.println("Footwear not avaliable");
		}

		Footwear obj = getSecondHighestPriceByBrand(ft, ftName);
		if(obj!=null)
		{
			System.out.println(obj.getId());
			System.out.println(obj.getName());
			System.out.println(obj.getPrice());
		}
		else
		{
			System.out.println("Brand not available");
		}
	
	}

	public static int getCountByType(Footwear[] ft, String t)
	{
		int count = 0;
		for(int i=0; i<ft.length; i++)
		{
			if(ft[i].getType().equalsIgnoreCase(t))
			{
				count++;
			}
		}
		if (count>0)
		{
			return count;
		}
		else
		{
			return 0;
		}
	}
	
	public static Footwear getSecondHighestPriceByBrand(Footwear[] ft, String name)
	{
		for(int i =0; i<ft.length; i++)
		{
			if(ft[i].getName().equalsIgnoreCase(name))
			{
				return ft[i];
			}
		}
		return null;
	}
}

class Footwear
{
	private int id;
	private String name;
	private String type;
	private int price;

	public Footwear(int id, String name, String type, int price)
	{
		this.id=id;
		this.name = name;
		this.type = type;
		this.price = price;
	}	

	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
}
