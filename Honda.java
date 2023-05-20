class Honda
{
//fields - global variable
// static , non-static
static int dealer_id = 1234;  
static String owner_name = "Kumar";
int price;  //declaration 
int cc;
float discount;   //Data Members

public static void main(String[] args)
{
Honda shine   = new Honda();   //new allocates memory
Honda unicorn = new Honda();
Honda activa  = new Honda();

shine.price = 70000;
unicorn.price = 80000;
activa.price = 90000;

shine.discount = 5.0f;
activa.discount = 1.0f;
unicorn.discount = 3.0f;

System.out.println(shine.price);
System.out.println(shine.discount);
System.out.println(Honda.owner_name);
System.out.println(unicorn.owner_name);
System.out.println(owner_name);

}



}
