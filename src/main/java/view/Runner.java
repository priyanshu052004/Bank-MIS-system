package view;

import controller.CustomerController;
import controller.HeadOfficeController;
import controller.StateOfficeController;
import model.CustomerEntity;
import model.HeadOfficeEntity;
import model.StateOfficeEntity;
import utils.PrintTable;

import java.util.Scanner;

public class Runner {

    private static Scanner scStr;
    private static Scanner scNum;
    private static StateOfficeController stateOfficeController;
    private static HeadOfficeController headOfficeController;
    private static CustomerController customerController;

    public static void main(String[] args) {
        init();
        System.out.println("***************** Welcome to Bank Management Portal *****************");

        while (true) {
            System.out.println("\n1. Add State Office record");
            System.out.println("2. Add Head Office record");
            System.out.println("3. Add Customer record");
            System.out.println("4. Update State Office Address");
            System.out.println("5. Delete State Office");
            System.out.println("6. Update customer record");
            System.out.println("7. print database");
            System.out.println("8. Delete customer record");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");


            int input = scNum.nextInt();



            switch (input) {
                case 0:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                    break;

                case 1:
                    StateOfficeEntity stateOfficeEntity = new StateOfficeEntity();
                    System.out.print("Enter the name of State Office: ");
                    stateOfficeEntity.setStateOfficeName(scStr.nextLine());

                    System.out.print("Enter the Address: ");
                    stateOfficeEntity.setAddress(scStr.nextLine());

                    System.out.print("Enter Pincode: ");
                    stateOfficeEntity.setPincode(scStr.nextLine());

                    System.out.print("Enter City: ");
                    stateOfficeEntity.setCity(scStr.nextLine());

                    stateOfficeController.createStateOffRecord(stateOfficeEntity);
                    break;

                case 2:
                    HeadOfficeEntity headOfficeEntity = new HeadOfficeEntity();
                    System.out.print("Enter the Headoffice name : ");
                    headOfficeEntity.setHeadOfficeName(scStr.nextLine());

                    System.out.print("Enter the Address: ");
                    headOfficeEntity.setaddress(scStr.nextLine());

                    System.out.print("Enter the contact number : ");
                    headOfficeEntity.setcontact(scStr.nextInt());

                    System.out.print("Enter the Sid : ");
                    headOfficeEntity.setcontact(scStr.nextInt());

                    headOfficeController.createHeadOffRecord(headOfficeEntity);

//
                    break;
                case 3:
                    CustomerEntity customerEntity = new CustomerEntity();
                    System.out.print("Enter the customer name : ");
                    customerEntity.setCname(scStr.nextLine());

                    System.out.print("Enter the Address: ");
                    customerEntity.setAddress(scStr.nextLine());

                    System.out.print("Enter Balance: ");
                    customerEntity.setBalance(scStr.nextInt());

                    System.out.print("Enter Account Number: ");
                    customerEntity.setAccountnumber(scStr.nextInt());

                    System.out.print("Enter Contact Number: ");
                    customerEntity.setContact(scStr.nextInt());

                    System.out.print("Enter Bid : ");
                    customerEntity.setBid(scStr.nextInt());

                    customerController.createCustomerRecord(customerEntity);
                    break;
                case 4:
                    stateOfficeEntity = new StateOfficeEntity();
                    System.out.println("enter the address:");
                    stateOfficeEntity.setAddress(scStr.nextLine());
                    System.out.println("enter the pincode:");
                    stateOfficeEntity.setPincode(scStr.nextLine());
                    System.out.println("enter city name :");
                    stateOfficeEntity.setCity(scStr.nextLine());
                    System.out.println("enter the sid: ");
                    stateOfficeEntity.setsId(scNum.nextInt());
                    stateOfficeController.updateAdd(stateOfficeEntity);
                    break;
                case 5:
                    stateOfficeEntity = new StateOfficeEntity();
                    System.out.println("enter the sid of the state office you want to delete: ");
                    stateOfficeEntity.setsId(scNum.nextInt());
                    stateOfficeController.delete(stateOfficeEntity);

                    break;
//                case 7:
//                    System.out.println("**************************List of table Name *********************");
//                    System.out.println("StateOffice");
//                    System.out.println("Customer");
//                    System.out.println("HeadOffice");
//                    System.out.println("Branch");
//                    System.out.println("*******************************************************************");
//                    System.out.println("Enter your Table Name: ");
//                    String  choose  = scStr.nextLine();
//                    switch (choose.toLowerCase()){
//                        case("stateoffice"):
//                            PrintTable.displayAllRecords(stateOfficeController.getCon(), choose);
//                            break;
//                        case("Customer"):
//                            PrintTable.displayAllRecords(customerController.getCon(), choose);
//                            break;
//                        case("HeadOffice"):
//                            PrintTable.displayAllRecords(headOfficeController.getCon(), choose);
//                            break;
//                        default:
//                            System.out.println("Invalid choice. Please try again.");
//                            break;
//
//                    }
//                    System.out.println("enter the name of table");
//                   String tableName = scStr.nextLine();
//                    PrintTable.displayAllRecords(stateOfficeController.getCon(), tableName);
//                    HeadOfficeController.displayAllRecords();
//                    customerController.displayAllRecords();
//                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void init() {
        scStr = new Scanner(System.in);
        scNum = new Scanner(System.in);
//        stateOfficeController = new StateOfficeController();
//        headOfficeController = new HeadOfficeController();
        customerController = new CustomerController();

    }
}
