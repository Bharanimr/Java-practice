class shop
{
static String shopname="Bharani";
int price;
int discount;
public static void main(String[] args)
{
shop prod1 = new shop();
shop prod2 = new shop();
shop prod3 = new shop();
prod1.price = 100;
prod1.discount = 20;
prod2.price = 200;
prod2.discount = 10;
int actual_price = prod2.sell(); //method callings 
System.out.println("Actual price is" + actual_price);
prod1.sell();  // Method Calling Statement
prod2.bill();
shop.clean();
}

void bill()
{

}

static void clean()
{
System.out.println("Cleaning");
//System.out.println(this.discount);
}

int sell()
{
int discount = 30;
//System.out.println(price);
//System.out.println(discount);  //local variable
//System.out.println(this.discount);
System.out.println(this.price - this.discount);
return this.price - this.discount;

}

}
