/*=============================================================================

==============================================================================*/
package findclosestelement;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author zach
 */
public class FindClosestElement 
{
    //Constant array
    static final int[] array = {-14,-9,-4,1, 6, 11,16};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        char restart = 'Y';
        Scanner scan = new Scanner(System.in);

        try 
        {
           while(restart == 'Y' || restart == 'y')
            {
                int userNum = 0;

                System.out.println("This program has created an array of sorted integers:"
                        +Arrays.toString(array)+"\n Type in a value between -14 and 16 "
                        + "and the program will guess the closest number in the "
                        + "sorted array to your number: ");
                userNum = scan.nextInt();
                
                while(userNum<-14 || userNum>16)
                {
                    System.out.println("Please enter a number less than or equal "
                            + "to  16 or greater than or equal to -14");
                    userNum = scan.nextInt();
                }

                System.out.println("The closest number to your nubmer in the array is: "
                                   +findClosestNum(userNum)+ "\n Try again? (Y/N)");
                restart = scan.next().charAt(0);
                while((restart != 'y') || (restart != 'Y') || (restart != 'n') || (restart != 'N'))
                {
                    System.out.println("Please enter valid input (Y/N)");
                    restart = scan.next().charAt(0);
                }

            } 
        }
        
        catch (InputMismatchException e) 
        {
            System.out.println("Please input an integer from -14 to 16 \n");
            
        }       
    }
    
    /**
     * 
     * @param userNum
     * @return closestElement
     */
    public static int findClosestNum(int userNum)
    {
        int closestElem = 0;
        
        if((userNum >=-16) && (userNum<=-12))
            closestElem = -14;
        if((userNum >=-11) && (userNum<=-7))
            closestElem = -9;
        if((userNum >=-6) && (userNum<=-2))
            closestElem = -4;
        if((userNum >=-1) && (userNum<=3))
            closestElem = 1;
        if((userNum >=4) && (userNum<=8))
            closestElem = 6;
        if((userNum >=9) && (userNum<=13))
            closestElem = 11;
        if((userNum >=14) && (userNum<=18))
            closestElem = 16;
        
        return closestElem;       
    }
    
}
