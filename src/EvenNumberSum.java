public class EvenNumberSum {
    public static void main(String[] args) {
        System.out.println("This program counts the Sum of all even numbers between 1 and 100");
        int SumOfEven = 0;
        for (int i=0;i<101;i++){
            if(i % 2 == 0){
                SumOfEven = SumOfEven + i;

            }


        }
        System.out.println("The sum of the all the even numbers between 1 and 100 are: "+SumOfEven);


    }
}
