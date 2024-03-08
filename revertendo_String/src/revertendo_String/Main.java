package revertendo_String;

public class Main {

    public static void main(String[] args) {

        String original = "Hello, world!";

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + inverterString(original));
    }

    public static String inverterString(String str) {
    
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}
