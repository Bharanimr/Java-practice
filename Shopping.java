class Shopping
{
public static void main(String[] args)

{
int amount = 1000;
Shopping myself = new Shopping();
myself.purchase(amount);      //pass by value ---> amount ---> value 1000

}
void purchase(int cash)
{
System.out.println("Came to Shopping with " +cash);
}


}
