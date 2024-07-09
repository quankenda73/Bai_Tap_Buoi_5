package BT_Buoi_5;

public class Bai4 {

    // Phương thức checkSubString để kiểm tra xem subString có nằm trong mainString hay không
    public boolean checkSubString(String mainString, String subString) {
        return mainString.contains(subString);
    }

    // Phương thức countCharInString để đếm số lần xuất hiện của searchChar trong mainString
    public int countCharInString(String mainString, char searchChar) {
        int count = 0;
        for (char c : mainString.toCharArray()) {
            if (c == searchChar) {
                count++;
            }
        }
        return count;
    }

    // Phương thức upperCaseToString để chuyển đổi tất cả các ký tự trong một chuỗi thành chữ hoa
    public String upperCaseToString(String mainString) {
        return mainString.toUpperCase();
    }

    // Phương thức isPalindrome để kiểm tra xem chuỗi có phải là chuỗi đối xứng hay không
    public boolean isPalindrome(String mainString) {
        int length = mainString.length();
        for (int i = 0; i < length / 2; i++) {
            if (mainString.charAt(i) != mainString.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Bai4 app = new Bai4(); // Tạo đối tượng của lớp Bai4

        // Kiểm tra phương thức checkSubString
        String mainString1 = "Hello, welcome to the Java world!";
        String subString1 = "Java";
        String subString2 = "Python";
        System.out.println("mainString: " + mainString1);
        System.out.println("subString1: " + subString1 + " - " + (app.checkSubString(mainString1, subString1) ? "Found" : "Not Found"));
        System.out.println("subString2: " + subString2 + " - " + (app.checkSubString(mainString1, subString2) ? "Found" : "Not Found"));

        // Kiểm tra phương thức countCharInString
        char searchChar1 = 'o';
        char searchChar2 = 'a';
        System.out.println("mainString: " + mainString1);
        System.out.println("searchChar1: " + searchChar1 + " - Count: " + app.countCharInString(mainString1, searchChar1));
        System.out.println("searchChar2: " + searchChar2 + " - Count: " + app.countCharInString(mainString1, searchChar2));

        // Kiểm tra phương thức upperCaseToString
        String upperCaseString = app.upperCaseToString(mainString1);
        System.out.println("mainString (upper case): " + upperCaseString);

        // Kiểm tra phương thức isPalindrome
        String palindromeString1 = "radar";
        String palindromeString2 = "hello";
        System.out.println("palindromeString1: " + palindromeString1 + " - " + (app.isPalindrome(palindromeString1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("palindromeString2: " + palindromeString2 + " - " + (app.isPalindrome(palindromeString2) ? "Palindrome" : "Not Palindrome"));
    }
}

