import java.util.ArrayList;
import java.util.Scanner;

public class RecursiveMinimum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (true)
        {
            System.out.print("Please enter numbers. Enter -1 to quit: ");
            int number = input.nextInt();

            if (number == -1)
            {
                break;
            }
            else
            {
                numbers.add(number);
            }
        }

        int minimum = findMinimum(numbers, 0);
        System.out.println("Minimum: " + minimum);
    }

    public static int findMinimum(ArrayList<Integer> numbers, int index)
    {
        if (index == numbers.size() - 1)
        {
            return numbers.get(index);
        }

        int min = findMinimum(numbers, index + 1);

        if (min < numbers.get(index))
        {
            return min;
        }
        else
        {
            return numbers.get(index);
        }
    }
}