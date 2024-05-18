//признаюсь честно, я не понимаю как добавить римские -> арабские числа и наоборот без сторонних библиотек, я траил через классы(как я думал функции) но ниче не получилось, сам калькулятор родился быстро
//большая часть времени была затрачена на конвертер, который так и не вышел, ии подсказывал через стороннии библиотеки, но я хотел сделать чистым файлом без проекта и созданных сред



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
