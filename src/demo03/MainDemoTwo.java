package demo03;

import demo03.exceptions.InvalidMobileNoException;

public class MainDemoTwo {
    public static void main(String[] args) {

        String mobileNo = "077123456";

        if(mobileNo.length() != 10){
            try {
                throw new InvalidMobileNoException();
            } catch (InvalidMobileNoException e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("Valid mobile number");
        }

    }
}
