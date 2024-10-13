/*
import java.util.*;
class Fruit{
    private int id;
    private String name;
    private int price;
    private int rating;

    public Fruit(int id, String name ,int price ,int rating ){
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    //getter
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public int getRating(){
        return this.rating;
    }
}
public class FruitMain {
    public static Fruit findMaximumPriceByRating(Fruit [] f, int rate){
       int max = 0;
        for(int i = 0; i <f.length; i++){
            if(f[i].getRating() > rate){
                max = f[i].getPrice();
            }
        }
     
        for(int i = 0; i <f.length; i++){
            if(max  == f[i].getPrice()){
               return f[i];
            }
        }
        return null;
    }
    /*
     public static int findMaximumPriceByRating(Fruits[] ft, int r)
	{
		int max = 0;
		for(int i=0; i<ft.length; i++)
		{
			if(ft[i].getRating()>r)
			{
				if(ft[i].getPrice()>max)
				{
					max = ft[i].getPrice();
				}
			}
		}
		for(int i=0; i<ft.length; i++)
		{
			if(ft[i].getPrice()==max)
			{
				return ft[i].getId();
			}
		}
		return 0;
	}
}

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fruit f [] = new Fruit[4];
        for(int i=0; i<f.length; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            f[i] = new Fruit(a, b, c, d);
        }
        int rate = sc.nextInt();
        Fruit ans = findMaximumPriceByRating(f, rate);
        if(ans != null) {
            System.out.println(ans.getId());
        }
        else{
            System.out.println("No such Fruit");
        }
        /*
         if(ans!=0)
		{
			System.out.println(ans);
		}
		else
		{
			System.out.println("No such Fruit");
		}
         */
        sc.close();
    }
}

*/
package IPA21;
import java.util.Scanner;
public class IPA21
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		Fruits[] ft = new Fruits[4];
		for(int i=0; i<4; i++)
		{
			int a = sc.nextInt();sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();sc.nextLine();
			int d = sc.nextInt();sc.nextLine();
	
			ft[i] = new Fruits(a,b,c,d);
		}
		int rate = sc.nextInt();sc.nextLine();
		int ans = findMaximumPriceByRating(ft,rate);
		if(ans!=0)
		{
			System.out.println(ans);
		}
		else
		{
			System.out.println("No such Fruit");
		}
	}
	public static int findMaximumPriceByRating(Fruits[] ft, int r)
	{
		int max = 0;
		for(int i=0; i<ft.length; i++)
		{
			if(ft[i].getRating()>r)
			{
				if(ft[i].getPrice()>max)
				{
					max = ft[i].getPrice();
				}
			}
		}
		for(int i=0; i<ft.length; i++)
		{
			if(ft[i].getPrice()==max)
			{
				return ft[i].getId();
			}
		}
		return 0;
	}
}

class Fruits
{
	private int id;
	private String name;
	private int price;
	private int rating;

	public Fruits(int id, String name, int price, int rating)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
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
		this.name = name;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getRating()
	{
		return rating;
	}
	public void setRating(int rating)
	{
		this.rating = rating;
	}
}
