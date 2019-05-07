package samplePro.JavatoKotlin9;

public class Demo {

    public  static void main(String arg[]){

    //    int sum = MyDemoKt.add(3,4);

        int sum = Test.add(3,4);

        int distance = Test.distance(8,8);

        System.out.println(sum);

        System.out.println("Distance is  "+distance);
    }

   static int sub(int a,int b){

        return (a-b);
    }
}
