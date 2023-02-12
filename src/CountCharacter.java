import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String yourString = scanner.nextLine();
        System.out.println("Chuoi cua ban la: " + yourString);

        char[] arrayOfString = yourString.toCharArray();
        System.out.println("Nhap ky tu:");
        char yourChar = scanner.nextLine().charAt(0);

        int count = 0;
        for(int i = 0; i < arrayOfString.length; i++) {
            if(yourChar == arrayOfString[i]) {
                count ++;
            }
        }

        System.out.println("Ky tu " + yourChar + " xuat hien " + count + " lan");
    }
}