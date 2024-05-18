import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("???: ");
        String str = in.nextLine();
        String[] asd = str.split(" ");
        if (asd.length != 3) {
            System.out.println("throws Exception");
        } else {
            int value1 = Integer.parseInt(asd[0]);
            int value3 = Integer.parseInt(asd[2]);
            
            String value2 = asd[1];
            if (value1 <= 10 && value3 <= 10) {
            
                if (value2.contains("+")) {
                    System.out.println(value1 + value3);
                }
                if (value2.contains("-")) {
                    System.out.println(value1 - value3);
                }
                if (value2.contains("*")) {
                    System.out.println(value1 * value3);
                }
                if (value2.contains("/")) {
                    System.out.println(value1 / value3);
                } else {
                    System.out.println("throws Exception"); 
                }
            } else {
                System.out.println("throws Exception");
            }
    
                

            
    
            }
        }
        
    }