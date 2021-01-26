import java.util.ArrayList;
import java.util.Scanner;
public class PlantListInStock {
    Scanner sc = new Scanner(System.in);
    ArrayList<Plant> plants = new ArrayList<>();
    public PlantListInStock(){
        
    }
    public void readMenu(){
        System.out.println("-------Planting shop--------");
        System.out.println("1. List Product in stock:");
        System.out.println("2. Add/update product plant in stock");
        System.out.println("3.Buy/delete product from shop:");
        System.out.println("4.quit");
        System.out.print("Choice:");
        
    }
    public void addProduct(){
        double price=0;
        System.out.println("Please add name type size quantity price");
        System.out.print("Search Product name if no add new");
        String name = sc.nextLine();
        Plant plant = findProductByName(name);
        if(plant==null){
            System.out.print("Enter name:");
            name = sc.nextLine();
            System.out.print("type(HerbsShrub/Tree/Climber/Creeper):");
            String type= sc.nextLine();
            System.out.print("Size()");
        }else{
            System.out.println("quantity:");
            int quantity = Integer.parseInt(sc.nextLine());
            System.out.println("price:");
            price = Double.parseDouble(sc.nextLine());
            if(price!=0)plant.setPrice(price);
            plant.setQuantity(quantity);
        }
    }
    public Plant findProductByName(String name){
        for(Plant plant: plants){
            if(name.equalsIgnoreCase(name)){
                return plant;
            }    
        }
        return null;
    }
}
