// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class problemA {
    String[] tb ;
    String[] lr ;
    public void swap(int index, int sIndex, String[] array) {
        String original = array[index];
        String swap = array[sIndex];
        char[] originalArr = original.toCharArray();
        char[] swapCharArray = swap.toCharArray();

        for(int indx=0; indx<originalArr.length; indx++)
            if(originalArr[indx]!='0') {
                for(int swapIndex=0; swapIndex<swapCharArray.length; swapIndex++)
                    if(swapCharArray[swapIndex]=='0') {
                        originalArr[indx]='0';
                        swapCharArray[swapIndex]='2';
                        break;
                    }
            }

        array[index] = String.valueOf(originalArr);
        array[sIndex] = String.valueOf(swapCharArray);


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        String[] tb = new String[n];
        String[] lr = new String[n];
        for(int index=0; index < n; index++){
            String str = input.nextLine();
            tb[index] = str.substring(0,2);
            lr[index] = str.substring(2);
        }

        problemA obj = new problemA();

        int fixedSword = 0;
        int tbCount = 0;
        int lrCount = 0;
        for(int index=0; index < n; index++) {

            if (index == n-1) {
                char[] tbArray = tb[index].toCharArray();
                char[] lrArray = lr[index].toCharArray();
                for(int i =0; i<tbArray.length;i++) {
                    if(tbArray[i]=='1') {
                        tbCount++;
                    }
                    if(lrArray[i]=='1') {
                        lrCount++;
                    }
                }

            } else {
                obj.swap(index, index + 1, tb);
                obj.swap(index, index + 1, lr);

                String stringAfterSwap = tb[index] + lr[index];
                if (stringAfterSwap.equals("0000")) {
                    fixedSword++;
                }
            }

        }

        System.out.println(fixedSword+" "+tbCount+" "+lrCount);

                }







}
