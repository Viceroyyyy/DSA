// package Accenture;

public class passwordChecker {
    public static int CheckPassword(String str, int n){
        if(n<4)
        return 0;
        if(str.charAt(0)>= '0' && str.charAt(0)<='9'){
            return 0;
        }
        int num_digit=0,cap_letter=0;
        for(int i=1; i<n; i++){
            if(str.charAt(i)== ' ' || str.charAt(i)== '/'){
                return 0;
            }
            else{
                if(str.charAt(i)>= '0' && str.charAt(i)<='9'){
                    num_digit++;
                }else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                    cap_letter++;
                }
            }
        }

        if(num_digit>=1 && cap_letter>=1)
        return 1;
        else 
        return 0;
    }

    public static void main(String[] args) {
        String password = "a987 abC012";
        int n = password.length();

        int result = CheckPassword(password, n);

        if (result == 1) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
    }
}
