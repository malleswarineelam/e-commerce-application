
import com.stschool.ecommerce.controller.CustomerController;
import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.ui.CustomerMenu;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("1.Signup");
        System.out.println("Enter your choice : ");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                CustomerMenu customerMenu=new CustomerMenu();
                Customer customer= customerMenu.inputCustomerSignUpData();
                CustomerController customerController=new CustomerController();
                customerController.handleSignUp(customer);
                break;

        }



        }
    }
