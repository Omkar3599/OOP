public class Count{
    static int counter = 0;

        public Count() {
        counter++;
    }

    static int getCount(){
        return counter;
    }


    public static void main(String[] args)  {
        Count obj=new Count();
        Count obj1=new Count();
        Count obj2=new Count();
        // Count obj3=new Count();
        // Count obj4=new Count();

        System.out.println("The number of objects created is: " +getCount());

    }
}
