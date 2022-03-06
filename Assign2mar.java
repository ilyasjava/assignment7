	import java.util.Arrays;
import java.util.Scanner;

public class ass2march {
    public static void main(String[] args) {
//		C/W
        System.out.println(Arrays.toString(storeInReverseOrder()));
        splitArray();
        System.out.println(Arrays.toString(rotateArray(new int[] {1,2,3,4,5})));
        System.out.println(valueOfOperationsUsingSwitch(new String[] {"--x","x++","x++"}));
//		H/W
        System.out.println(truncateKSentence("Hello how are you contestant",4));
        System.out.println(Arrays.toString(numbersSmallerThenCurrent(new int[] {8,1,2,2,3})));
        System.out.println(isValidString("Hello0"));
    }

    private static String isValidString(String str) {
        boolean isUpper = false, isLower = false, isDigit = false;
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z' && !isUpper) {
                isUpper = true;
            } else if (ch >= 'a' && ch <= 'z' && !isLower) {
                isLower = true;
            } else if (ch >= '0' && ch <= '9' && !isDigit) {
                isDigit = true;
            }
        }
        return (isUpper && isLower && isDigit) ? "Valid" : "InValid";
    }

    private static int[] numbersSmallerThenCurrent(int[] arr) {
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            int curVal=arr[i],count=0;
            for(int val:arr) {
                if(curVal>val) {
                    count++;
                }
            }
            res[i]=count;
        }
        return res;
    }

    private static String truncateKSentence(String str, int k) {
        String[] strArray=str.split(" ");
        String output="";
        for(int i=0;i<k;i++) {
            output+=strArray[i]+" ";
        }
        return output;
    }

    private static int valueOfOperations(String[] arr) {
        int res=0;
        for(String val:arr) {
            res+=val.contains("+")?1:-1;
        }
        return res;
    }


    private static int valueOfOperationsUsingSwitch(String[] arr) {
        int res = 0;
        for (String val : arr) {
            switch (val) {
                case "--x":
                case "x--":
                    res--;
                    break;
                case "++x":
                case "x++":
                    res++;
                    break;
            }
        }
        return res;
    }

    private static int[] rotateArray(int[] arr) {
        int last = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--) {
            arr[i+1]=arr[i];
        }
        arr[0]=last;
        return arr;
    }

    private static void splitArray() {
        Scanner sc=new Scanner(System.in);
        int size=10;
        int original[]=new int[size];
        for(int i=0;i<10;i++) {
            original[i]=sc.nextInt();
        }
        int[] split1=new int[size-=size/2];
        int[] split2=new int[size];
        int i=0;
        for(i=0;i<split1.length;i++) {
            split1[i]=original[i];
        }
        for(int j=0;j<split2.length;j++,i++) {
            split2[j]=original[i];
        }
        System.out.println(Arrays.toString(split1));
        System.out.println(Arrays.toString(split2));
    }

    private static int[] storeInReverseOrder() {
        Scanner sc=new Scanner(System.in);
        int res[]=new int[10];
        for(int i=0;i<10;i++) {
            res[res.length-i-1]=sc.nextInt();
        }
        return res;
    }
}
