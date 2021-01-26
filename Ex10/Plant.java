public class Plant {
    String type,size,name;
    double price;
    int quantity;
    public Plant(){}
    public Plant(String type,String name,String size,int quantity,double price){
        if(type.equalsIgnoreCase("herb")
        ||type.equalsIgnoreCase("shrub")
        ||type.equalsIgnoreCase("Tree")
        ||type.equalsIgnoreCase("Climber")
        ||type.equalsIgnoreCase("Creeper"))
        this.type=type;
        else{
            System.out.println("There only type herb scrub tree climber or creepers");
            this.type= null;
        }
        if(size.equalsIgnoreCase("medium")||
        size.equalsIgnoreCase("small")||
        size.equalsIgnoreCase("large")){
            this.size=size;
        }else{
            System.out.println("Invalid size there only smalll medium large");
            this.size = null;
        }
        this.quantity=quantity;
        this.price=price;
        this.name = name;
    }    
    public void setPrice(double price){
        this.price = price;
    
    }
    public void setSize(String size){
        if(size.equalsIgnoreCase("medium")||
        size.equalsIgnoreCase("small")||
        size.equalsIgnoreCase("large")){
            this.size=size;
        }else{
            System.out.println("Invalid size there only smalll medium large");
            this.size = null;
        }
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setType(String type){
        if(type.equalsIgnoreCase("herb")
        ||type.equalsIgnoreCase("shrub")
        ||type.equalsIgnoreCase("Tree")
        ||type.equalsIgnoreCase("Climber")
        ||type.equalsIgnoreCase("Creeper"))
        this.type=type;
        else{
            System.out.println("There only type herb scrub tree climber or creepers");
            this.type= null;
        }
    }
    @Override
    public String toString(){
        return "Name:"+name+" Type:"+type+" size:"+size+" quantity:"+quantity+" priceperOne:"+price+"\n";
    }
    public String getPlantName(){
        return name;
    }


}
