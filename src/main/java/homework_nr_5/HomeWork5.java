package homework_nr_5;

public class HomeWork5 {
    public static void main(String[] args) {
        int[] numbers = new int[101];
        for(int i = 0; i < 101; i++) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }
        int sum = 0;
        for(int i = 2; i < numbers.length; i +=2){
            System.out.println("even numbers -" + i );
            sum += i;
            System.out.println(sum);


        }


        }
    };

