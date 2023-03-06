import java.util.Scanner;

public class problemB {
    public static void main(String[] args) {

        char[][] whiteBoardArray = new char[3][3];
        for(int row = 0 ; row<3; row++) {
            for (int column=0; column<3; column++) {
                whiteBoardArray[row][column] = '.';
            }
        }
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
     int count = 0;
     int noOfClicks =0;
        
            while (count < n) {
                boolean shouldBreak = false;
                for (int row = 0; row < 3; row++) {
                    String str = String.valueOf(new char[]{whiteBoardArray[row][0], whiteBoardArray[row][1], whiteBoardArray[row][2]});
                    String givenStr = scanner.nextLine();

                    if (str.equals(givenStr)) {
                        break ;
                    }

                    char[] chars = givenStr.toCharArray();
                    for (int i = 0; i < chars.length; i++) {
                        whiteBoardArray[row][i] = chars[i];
                        noOfClicks++;
                        if (String.valueOf(new char[]{whiteBoardArray[row][0], whiteBoardArray[row][1], whiteBoardArray[row][2]}).equals(String.valueOf(chars))) {
                            shouldBreak = true;
                            break ;
                        }
                    }
                    if(shouldBreak) {
                        break;
                    }

                }

                System.out.println(noOfClicks);
                count++;
            
        }

    }
}
