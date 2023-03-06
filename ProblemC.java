import java.util.Scanner;

public class ProblemC {
    public static void main(String args[]){
        int totalDistance, distancePerSecBeforeCoffee,distancePerSecAfterCoffee,waitForCoffee,totalTimeToDrinkCoffee, noOfCoffeeCart;
        int [] arrayDistanceCoffee;
        Scanner scanner = new Scanner(System.in);
        totalDistance = scanner.nextInt();
        distancePerSecBeforeCoffee = scanner.nextInt();
        distancePerSecAfterCoffee = scanner.nextInt();
        waitForCoffee = scanner.nextInt();
        totalTimeToDrinkCoffee = scanner.nextInt();
        scanner.nextLine();
        noOfCoffeeCart = scanner.nextInt();
        scanner.nextLine();
        arrayDistanceCoffee = new int[noOfCoffeeCart];
        for(int index=0; index < noOfCoffeeCart; index++){
            int coffeeDistance = scanner.nextInt();
            arrayDistanceCoffee[index] = coffeeDistance;
        }

        int coffeDrunken = 0;
        String coffeDrunkShop = "";
        int distanceCovered = 0,timeCovered=0;
        for ( int indx = 0; indx < arrayDistanceCoffee.length;indx++){
            if(arrayDistanceCoffee[indx] <=totalDistance){
                if(arrayDistanceCoffee[indx]>distanceCovered) {
                    coffeDrunken++;
                    coffeDrunkShop = coffeDrunkShop + " " + String.valueOf(indx) ;
                    distanceCovered = arrayDistanceCoffee[indx] + (distancePerSecAfterCoffee * totalTimeToDrinkCoffee) + (waitForCoffee * distancePerSecBeforeCoffee);
                    timeCovered = (arrayDistanceCoffee[indx]/distancePerSecBeforeCoffee) + waitForCoffee + totalTimeToDrinkCoffee;
                }

            }


        }
        System.out.println(coffeDrunken);
        System.out.println(coffeDrunkShop);


    }
}
