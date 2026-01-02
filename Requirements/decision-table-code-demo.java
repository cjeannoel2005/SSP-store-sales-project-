import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        boolean accountCreation = true;
        boolean accountlogin = true;
        
        
         Scanner scanner = new Scanner(System.in);
          System.out.println("do you have an account ? ");
         String customerInput1 = scanner.nextLine();
        System.out.println("what type of account do you have or wish to create ?");
         String customerInput2 = scanner.nextLine();
         
          if ( customerInput1.equals("yes") || customerInput2.equals("customer") ) {
             accountCreation = false;
             accountlogin = true;
               System.out.println("please enter your credentials to login");
               
               // after login you will be taken to the main page then will be able to checkout and so on
               
          }
          else if ( customerInput1.equals("no") || customerInput2.equals("customer")) {
              System.out.println("Please follow the appropriate steps to create an account");
              accountCreation = true;
              accountlogin = false;
          }
          else if ( customerInput1.equals("yes") || customerInput2.equals("admin")) {
              accountCreation = false;
              accountlogin = true;
               System.out.println("please click on either of the following pages to view them");
               System.out.println(" report page and export to csv");
          }
          
        }


}
