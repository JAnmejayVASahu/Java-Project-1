import java.util.Scanner;

public class numSys {
/* BinaryToDecimal */
    public static long  BinaryToDecimal(long num){

        long reminder = 0, power = 1, answer = 0;
        
        while(0 < num){
            reminder = num % 2;
            answer = answer + reminder * power;
            power = power * 10;
            num = num / 2;
        }return answer;
    }

/* DecimalToBinary */
    public static int DecimalToBinary(int num){

        int reminder, power = 1, ans = 0;
        while(num > 0){
            reminder = num % 10;
            ans =  ans + (reminder * power);
            power = power * 2;
            num = num / 10;
        }return ans;
    }
/* DecimalToOctal */
    public static int DecimalToOctal(int num){
        int reminder = 0, power = 1, answer = 0;
        
        while(0 < num){
            reminder = num % 8;
            answer = answer + reminder * power;
            power = power * 10;
            num = num / 8;
        }return answer;
    }

/* OctalToDecimal */
    public static int OctalToDecimal(int num){

        int reminder, power = 1, ans = 0;
        while(num > 0){
            reminder = num % 10;
            ans =  ans + (reminder * power);
            power = power * 8;
            num = num / 10;
        }return ans;
    }

/* OctalToBinary */
    public static int OctalToBinary(int num){

        num = OctalToDecimal(num);

        int reminder, power = 1, ans = 0;
        while(num > 0){
            reminder = num % 2;
            ans =  ans + (reminder * power);
            power = power * 10;
            num = num / 2;
        }return ans;
    }

/* Hexa_DecimalToDecimal */
    public static int Hexa_DecimalToDecimal(String num){

        int power = 1, ans = 0;
        for(int i = num.length()-1; i>= 0; i--){
            char digit = num.charAt(i);

            if(Character.isDigit(digit)){
                ans += (digit - '0') * power;
            }
            else{
                ans += (digit - 'A' + 10)*power;
            }
            power *= 16;
        }
        return ans;
    }

/* DecimalToHexa_Decimal */
    public static String DecimalToHexa_Decimal(int num){

        StringBuilder hex = new StringBuilder(); 

        while (num > 0) {
            int remainder = num % 16;
            if (remainder < 10) {
                hex.insert(0, (char) ('0' + remainder));
            } else {
                hex.insert(0, (char) ('A' + remainder - 10));
            }
            num /= 16;
        }return hex.toString();
    }

/* Hexa_DecimalToBinary */
public static String Hexa_DecimalToBinary(String hex) {
    StringBuilder binary = new StringBuilder();
    
    for (int i = 0; i < hex.length(); i++) {
        char hexDigit = hex.charAt(i);
        
        // Convert each hexadecimal digit to its binary representation
        String binaryDigit = Integer.toBinaryString(
            Integer.parseInt(String.valueOf(hexDigit), 16)
        );
        
        // Ensure that each binary representation is 4 bits long (pad with leading zeros if needed)
        while (binaryDigit.length() < 4) {
            binaryDigit = "0" + binaryDigit;
        }
        
        binary.append(binaryDigit);
    }
    
    return binary.toString();
}

/* Hexa_DecimalToOctal */
    public static int Hexa_DecimalToOctal(String hex){
        int x = Hexa_DecimalToDecimal(hex);

        return DecimalToOctal(x);
    }

/* BinaryToOctal */
    public static int  BinaryToOctal(int num){

        int reminder = 0, power = 1, octDigit = 0,answer = 0;
        
        while(0 < num){
            reminder = num % 1000;
            octDigit = DecimalToOctal(DecimalToBinary(reminder));
            answer = octDigit  * power + answer;
            power = power * 10;
            num = num / 1000;
        }return answer;
    }

/* BinaryToHexa_Decimal */
    public static String BinaryToHexa_Decimal(int num){

        StringBuilder hex = new StringBuilder();
        int decimalValue = 0;

        String hexDigit, btyStr = String.format("%04d", num);
        
        for(int i=0; i<btyStr.length(); i = i+4){
            hexDigit = btyStr.substring(i, i+4);
            decimalValue = Integer.parseInt(hexDigit, 2);
            hex.append(Integer.toHexString(decimalValue));
        }
        return hex.toString().toUpperCase();
    }

/* OctalToHexa_Decimal */
    public static String OctalToHexa_Decimal(int oct){

        int x = OctalToDecimal(oct);
        String y = DecimalToHexa_Decimal(x);

        return y;
    }

    public static void main(String[] args) {

        System.err.println("\nYou can coose your operation based on the serial number provided below.\n");

        System.err.println("01.Binary to Decimal Conversion.\n");
        System.err.println("02.Binary to Octal Conversion.\n");
        System.err.println("03.Binary to Hexa_Decimal Conversion\n");
        System.err.println("04.Octial to Decimal Conversion.\n");
        System.err.println("05.Octal to Binary Conversion.\n");
        System.err.println("06.Octal to Hexa_Decimal Conversion.\n");
        System.err.println("07.Decimal to Binary Conversion.\n");
        System.err.println("08.Decimal to Octal Conversion.\n");
        System.err.println("09.Decimal to Hexa_Decimal Conversion.\n");
        System.err.println("10.Hexa_Decimal to Decimal Conversion.\n");
        System.err.println("11.Hexa_Decimal to Binary Conversion.\n");
        System.err.println("12.Hexa_Decimal to Octal Conversion.\n");

        System.err.println("* * * * * * * * * Operation Start * * * * * * * * *");
        
        Scanner scan = new Scanner(System.in);
        System.err.print("\nEnter your choice -> ");
        int choise = scan.nextInt();

        switch(choise){
            case 1:
                System.err.println("- - - - - - - - - - - - - - - - - - - - - - -");
                System.err.println("|- - - -Binary to Decimal Conversion - - - -|");
                System.err.println("- - - - - - - - - - - - - - - - - - - - - - -");

                System.err.println("\nEnter a Binary number -> ");
                int number2 = scan.nextInt();
                
                System.err.println(DecimalToBinary(number2));
            break;

            case 2:
                System.err.println("\n  - - - - - - - - - - - - - - - - - - - - - - -");
                System.err.println("|- - -Binary to Octal Conversion - - - -|");
                System.err.println(" - - - - - - - - - - - - - - - - - - - - - - -");

                System.err.print("\nEnter a Binary number -> ");
                int  numberA = scan.nextInt();

                System.out.println("\nThe Octal conversion from Binary is -> " + BinaryToOctal(numberA) + "\n");
            break;

            case 3:
                System.err.println("\n  - - - - - - - - - - - - - - - - - - - - - - -");
                System.err.println("|- - -Binary to Hexa_Decimal Conversion - - - -|");
                System.err.println(" - - - - - - - - - - - - - - - - - - - - - - -");

                System.err.print("\nEnter a Binary number -> ");
                int  numberB = scan.nextInt();

                System.out.println("\nThe Hexa_Decimal conversion from Binary is -> " + BinaryToHexa_Decimal(numberB) + "\n");
            break;
            
            case 4:
                System.err.println("\n - - - - - - - - - - - - - - - - - - - - - - -");
                System.err.println("|- - - - -Octial to Decimal Conversion - - - -|");
                System.err.println(" - - - - - - - - - - - - - - - - - - - - - - -");

                System.err.print("\nEnter a Octal number -> ");
                int number4 = scan.nextInt();

                System.err.println(OctalToDecimal(number4));
            break;

            case 5:
                System.err.println("\n - - - - - - - - - - - - - - - - - - - - - - -");
                System.err.println("|- - - - - -Octal to Binary Conversion - - - -|");
                System.err.println(" - - - - - - - - - - - - - - - - - - - - - - -");

                System.err.print("\nEnter a Octal number -> ");
                int number5 = scan.nextInt();

                System.err.println("\nThis octal number's decimal form is -> " + OctalToBinary(number5));
            break;

            case 6:
                System.err.println("\n  - - - - - - - - - - - - - - - - - - - - - - -");
                System.err.println("|- - -Octal to Hexa_Decimal Conversion - - - -|");
                System.err.println(" - - - - - - - - - - - - - - - - - - - - - - -");
                System.err.print("\nEnter a Octal number -> ");
                int  numberC = scan.nextInt();

                System.out.println("\nThe Hexa_Decimal conversion from Octal is -> " + OctalToHexa_Decimal(numberC) + "\n");
            break;

            case 7:
                System.err.println(" - - - - - - - - - - - - - - - - - - - - -");
                System.err.println("|- - -Decimal to Binary Conversion - - - -|");
                System.err.println(" - - - - - - - - - - - - - - - - - - - - -");

                System.err.println("\nEnter a Decimal number -> ");
                int number1 = scan.nextInt();
                
                System.err.println(BinaryToDecimal(number1));
            break;

            case 8:
                System.err.println("\n - - - - - - - - - - - - - - - - - - - - - - -");
                System.err.println("|- - - -Decimal to Octal Conversion - -  - - -|");
                System.err.println(" - - - - - - - - - - - - - - - - - - - - - - -");

                System.err.print("\nEnter a Decimal number -> ");
                int number3 = scan.nextInt();

                System.err.println(DecimalToOctal(number3));
            break;

            case 9:
                System.err.println("\n - - - - - - - - - - - - - - - - - - - - - - -");
                System.err.println("|- - -Decimal to Hexa_Decimal Conversion - - -|");
                System.err.println(" - - - - - - - - - - - - - - - - - - - - - - -");

                System.err.print("\nEnter a Decimal number -> ");
                int number7 = scan.nextInt();

                System.err.println(DecimalToHexa_Decimal(number7));
            break;

            case 10:
                System.err.println("\n - - - - - - - - - - - - - - - - - - - - - - -");
                System.err.println("|- - -Hexa_Decimal to Decimal Conversion - - -|");
                System.err.println(" - - - - - - - - - - - - - - - - - - - - - - -");

                System.err.print("\nEnter a Hexa_Decimal number -> ");
                String number6 = scan.next();

                System.err.println(Hexa_DecimalToDecimal(number6));
            break;

            case 11:
                System.err.println("\n  - - - - - - - - - - - - - - - - - - - - - - -");
                System.err.println("|- - -Hexa_Decimal to Binary Conversion - - - -|");
                System.err.println(" - - - - - - - - - - - - - - - - - - - - - - -");

                System.err.print("\nEnter a Hexa_Decimal number -> ");
                String  number8 = scan.next();

                System.out.println(Hexa_DecimalToBinary(number8));
            break;

            case 12:
                System.err.println("\n  - - - - - - - - - - - - - - - - - - - - - - -");
                System.err.println("|- - -Hexa_Decimal to Octal Conversion - - - -|");
                System.err.println(" - - - - - - - - - - - - - - - - - - - - - - -");

                System.err.print("\nEnter a Hexa_Decimal number -> ");
                String  number9 = scan.next();

                System.out.println("\nThe Octal conversion from Hexa_Decimal is -> "+Hexa_DecimalToOctal(number9) + "\n");
            break;

            default:
                System.err.println("\nHey user, the serial number you chose is not currently available. If it becomes available in the future, it can be used for your idea.\n");
            break;
        }
        
    }
}
