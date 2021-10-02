import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private static String s;
    private static int i;



    public static void main(String[] args) {

        File in = new File("input.txt");
        File out = new File("output.txt");

        try (Scanner scan = new Scanner(in);
             PrintWriter pw = new PrintWriter(new FileWriter(out, true))) {

            while (scan.hasNext()) {
                s = scan.next();
                i=0;
                pw.println(parse());
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }

    }

    private static String parse() {
        if (A() && i == s.length()) {
            return "The string \"" + s + "\" is in the language.";
        }
        else {
            return "The string \"" + s + "\" is not in the language.";
        }
    }

    private static boolean A() {
        if (I()) {
            if (i < s.length() && s.charAt(i) == '=') {
                ++i;
                if (E()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean E() {

        if (P()) {
            if (O()) {
                if (P()) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    private static boolean O() {
        if(i+1 < s.length() && (s.charAt(i) == '*'&&s.charAt(i+1) =='*')) {
            i+=2;
            return true;
        } else if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-' ||s.charAt(i) == '*' ||s.charAt(i) == '/')) {
            ++i;
            return true;
        }

        return false;

    }

    private static boolean P() {

        if (I()) {
            return true;
        } else if (L()) {
            return true;
        } else if (U()) {
            if (I() || L()) {
                return true;
            }
        } else if (i < s.length() && s.charAt(i) == '(') {
            i++;
            if (E()) {
                if (i < s.length() && s.charAt(i) == ')') {
                    i++;
                    return true;
                }
            }
        }

        return false;
    }


    private static boolean U() {
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-' ||s.charAt(i) == '!' )) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean I(){
        if(C())
        {
            if(I()){
                return true;
            } else {
                return true;
            }
        }
        return false;
    }

    private static boolean C() {

        if (i < s.length() && s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
            ++i;
            return true;
        }

        return false;
    }

    private static boolean L(){
        if(D())
        {
            if(L()){
                return true;
            } else {
                return true;
            }
        }
        return false;
    }

    private static boolean D() {

        if (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            ++i;
            return true;
        }

        return false;
    }




}

