
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ManagerOfficer managerOfficer = new ManagerOfficer();
        
        while (true) {
            System.out.println("Application Manager Officer");
            System.out.println("Enter 1: To insert officer");
            System.out.println("Enter 2: To search officer by name: ");
            System.out.println("Enter 3: To show information officers");
            System.out.println("Enter 4: To exit:");
            System.out.println("Input: ");
            
            String line = sc.nextLine();
            switch(line) {
                case "1" : {
                    System.out.println("Enter a: to insert Engineer");
                    System.out.println("Enter b: to insert Worker");
                    System.out.println("Enter c : to insert Staff");
                     System.out.println("---------------------------");
                    String type = sc.nextLine();
                    switch(type) {
                        case "a" : {
                                System.out.print("Enter name: ");
                                String name = sc.nextLine();
                                System.out.print("Enter age:");
                                int age = sc.nextInt();
                                System.out.print("Enter gender: ");
                                sc.nextLine();
                                String gender = sc.nextLine();
                                 System.out.print("Enter address: ");
                                String address = sc.nextLine();
                                System.out.print("Enter branch: ");
                                String branch = sc.nextLine();
                                Officer engineer = new Engineer(name,age,gender,address,branch);
                                 managerOfficer.addOfficer(engineer);
                                System.out.println(engineer.toString());
                                 System.out.println("---------------------------");
                                break;
                        }
                        
                        case"b": {
                            System.out.print("Enter name: ");
                            String name = sc.nextLine();
                            System.out.print("Enter age:");
                            int age = sc.nextInt();
                            System.out.print("Enter gender: ");
                            sc.nextLine();
                            String gender = sc.nextLine();
                            System.out.print("Enter address: ");
                            String address = sc.nextLine();
                            System.out.print("Enter level: ");
                            int level = sc.nextInt();
                            Officer worker = new Worker(name,age,gender,address,level);
                            managerOfficer.addOfficer(worker);
                            System.out.println(worker.toString());
                             System.out.println("---------------------------");
                            break;
                        }
                        case "c" : {
                            System.out.print("Enter name: ");
                            String name = sc.nextLine();
                            System.out.print("Enter age: ");
                            int age = sc.nextInt();
                            System.out.print("Enter gender: ");
                            sc.nextLine();
                            String gender = sc.nextLine();
                            System.out.print("Enter address: ");
                            String address = sc.nextLine();
                            System.out.print("Enter task: ");
                            String task = sc.nextLine();
                            Officer staff = new Staff(name, age, gender, address, task);
                            managerOfficer.addOfficer(staff);
                            System.out.println(staff.toString());
                             System.out.println("---------------------------");
                            break;

                        }
                        default:
                            System.out.println("invalid");
                           
                    
                    }
                   
                   break;
                }
                
                
                
                case "2": 
                    System.out.print("Enter name to search: ");
                    
                    String name = sc.nextLine();
                    managerOfficer.searchOfficerByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                            break;

                
                case "3": {
                    managerOfficer.showListInfoOfficer();
                    break;
                }
                case "4":
                    return ;
                default:
                    System.out.println("INvalid");
                    continue;
            }
            
    }
    
}
}
