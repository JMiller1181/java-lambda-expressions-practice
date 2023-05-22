import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Random;
import java.util.function.Supplier;

public class Practice {
    public static void main(String[] args) {
        //Part 1 simple lambda expressions for subtraction, addition, multiplication, and division
        BinaryOperator<Integer> subtract = (num1, num2) -> num1 - num2;
        BinaryOperator<Integer> add = (num1, num2) -> num1 + num2;
        BinaryOperator<Integer> multiply = (num1, num2) -> num1 * num2;
        BinaryOperator<Integer> divide = (num1, num2) -> num1 / num2;
        System.out.println(subtract.apply(4,2));
        System.out.println(add.apply(1,3));
        System.out.println(multiply.apply(3,5));
        System.out.println(divide.apply(12,6));
        //Part 2 created functional interface
        //Takes a number and checks to see if it is odd
        LambdaOdds isOdd = (num) -> {if(num % 2 != 0){
        return true;}
            return false;
        };
        System.out.println(isOdd.check(4));
        //Part 3 built in functional interfaces
        //Predicate check if number  is a single digit
        Predicate<Integer> singleDigit = (num) -> num < 10;
        System.out.println(singleDigit.test(5));
        //Function takes a number and doubles it
        Function<Integer,Integer> numDouble = (num) -> num * 2;
        System.out.println(numDouble.apply(5));
        //Consumer takes a phrase and says it twice
        Consumer<String> sayAgain = (phrase) -> {
            System.out.println(phrase);
            System.out.println(phrase);
        };
        sayAgain.accept("Alright, alright");
        //Supplier returns a number between 1 and 20
        Supplier<Integer> rollD20 = () -> {Random roll = new Random();
        return roll.nextInt(1,21);};
        System.out.println(rollD20.get());
    }
}
