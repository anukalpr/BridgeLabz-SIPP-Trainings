interface Discountable{
    void discount(double amt);
    String discInfo();
}

abstract class FoodItem{
    private String name;
    private double price;
    private int qty;

    public FoodItem(String name,double price,int qty){
        this.name=name;
        this.price=price;
        this.qty=qty;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQty(){
        return qty;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void setQty(int qty){
        this.qty=qty;
    }

    public abstract double total();

    public void show(){
        System.out.println(name+" "+price+" "+qty);
    }
}

class VegItem extends FoodItem implements Discountable{
    public VegItem(String name,double price,int qty){
        super(name,price,qty);
    }

    public double total(){
        return getPrice()*getQty();
    }

    public void discount(double amt){
        setPrice(getPrice()-amt);
    }

    public String discInfo(){
        return "Veg disc";
    }
}

class NonVegItem extends FoodItem implements Discountable{
    public NonVegItem(String name,double price,int qty){
        super(name,price,qty);
    }

    public double total(){
        return (getPrice()+20)*getQty();
    }

    public void discount(double amt){
        setPrice(getPrice()-amt);
    }

    public String discInfo(){
        return "Non-veg disc";
    }
}

public class FoodDeliverySystem{
    public static void main(String[] args){
        Discountable[] items={
            new VegItem("Paneer",150,2),
            new NonVegItem("Chicken",200,3)
        };

        for(Discountable d:items){
            FoodItem f=(FoodItem)d;
            f.show();
            System.out.println("Total:"+f.total());
            d.discount(10);
            System.out.println("After disc:"+f.total());
            System.out.println(d.discInfo());
            System.out.println();
        }
    }
}
