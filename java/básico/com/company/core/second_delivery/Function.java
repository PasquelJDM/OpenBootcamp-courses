import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("This program will make the IVA calculus");
        System.out.println("=======================================");
        
        System.out.println("The total price (with IVA included) is: " + totalPrice());
    }   
    private static int totalPrice() {
        int price = intReader();
        int iva = ivaCalculus(price, 16);
        return price + iva;
    }
    private static int ivaCalculus(int price, int ivaPercent) {
        return (price * ivaPercent) / 100;
    }
    private static int intReader() {
        int number = -1;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Digit the price: ");
            number = input.nextInt();
        }catch(Exception e){
            e.printStackTrace();
        }
        return number;
    } 
}
