	/*
1.Take as input a fraction in the form a/b. Convert the same into lowest terms and print. (Lowest terms examples 3/12 = 1/4).
2.Calculate the sum of digits of a number given by user. E.g.-
INUPT : 123        OUPUT : 6
INUPT : 12345        OUPUT : 15
3.A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
Write all Armstrong numbers between 100 to 500.
4.Write a program to print all prime number in between 1 to 100.
5.Write a program to find prime factor of a number.
If a factor of a number is prime number then it is its prime factor.
6.Write a program in java to find the sum of the even and odd digits of the number which is given as input.
*/

public class ass28feb {
    public static void main(String[] args) {
        findLowestTerms(3, 12);
        sumOfDigits(12345);
        findArmStrongNumber(100,500);
        printPrime(1,100);
        findPrimeFactors(32);
        findSumOfOddEvenDigits(2223);
    }

    private static void findSumOfOddEvenDigits(int num) {
        int evenSum=0,oddSum=0;
        while(num!=0) {
            if((num%10)%2==0)	{
                evenSum+=(num%10);
            }else {
                oddSum+=(num%10);
            }
            num/=10;
        }
        System.out.println("Even Sum: "+evenSum+" Odd Sum: "+oddSum);
    }

    private static void findPrimeFactors(int num) {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && checkPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static void printPrime(int start, int end) {
        while (start <= end) {
            if (checkPrime(start)) {
                System.out.print(start + ",");
            }
            start++;
        }
    }
    private static boolean checkPrime(int num) {
        int fact=0;
        for(int i=2;i*i<=num;i++) {
            if(num%i==0) {
                fact++;
                break;
            }
        }
        return fact!=0?false:true;
    }
    private static void findArmStrongNumber(int start,int end) {
        while (start<=end) {
            int sum = 0;
            int temp = start;
            while (temp != 0) {
                sum = sum + ((temp % 10) * (temp % 10) * (temp % 10));
                temp = temp / 10;
            }
            if (sum == start) {
                System.out.println(start);
            }
            start++;
        }
    }

    private static void sumOfDigits(int num) {
        int sum=0;
        while(num!=0) {
            sum+=num%10;
            num/=10;
        }
        System.out.println("Output :"+sum);
    }

    private static void findLowestTerms(int numerator, int denominator) {
        int a,b,gcd,t;
        a = numerator>denominator?numerator:denominator;
        b = numerator>denominator?denominator:numerator;

        while (b != 0){
            t = b;
            b = a % b;
            a = t;
        }
        gcd = a;

        System.out.println("Lowest form = "+numerator/gcd+"/"+denominator/gcd);
    }
}
