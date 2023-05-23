class Area1
{

public static void main(String[] args)

{
    Area1 square = new Area1();
    Area1 rectangle = new Area1();

    int result = square.calculate(40);
    System.out.println(result);

    rectangle.calculate(40,30);


}


void calculate(int len, int br)

{
    System.out.println(len*br);
}


int calculate(int a)

{
    return a*a;
}

}
