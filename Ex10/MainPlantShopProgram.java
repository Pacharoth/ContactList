import java.util.Scanner;
public class MainPlantShopProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlantListInStock plants = new PlantListInStock();
        int choice;
        do{
            plants.readMenu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    plants.listAllproduct();
                    break;
                case 2:
                    plants.addProduct();
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.println("Bye! Bye!");
                    break;
                default:
                    System.out.println("Wrong Operation!");
                    break;
            }
        }while(choice!=4);
    }
}
