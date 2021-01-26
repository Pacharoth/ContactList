public class Telephone {
    String phonenumber,purpose;
    public Telephone(){

    }
    public Telephone(String phonenumber,String purpose){
        boolean initial=false;
        for(int i=0;i<phonenumber.length();i++){
            if(phonenumber.charAt(i)>='0'&&phonenumber.charAt(i)<='9'|| phonenumber.charAt(0)=='+'){
                initial=true;
            }
        }
        if(initial)this.phonenumber=phonenumber;
        else {
            System.out.println("please input number[0-9] or + first digit");     
            this.phonenumber=null;   
        }
        this.purpose=purpose;
    }
    public void setPhoneNumber(String phoneNumber){

        this.phonenumber=phoneNumber;
    }
    public void setPurpose(String purpose){
        this.purpose = purpose;
    }
    public String getPhoneNumber(){
        return phonenumber;
    }
    public String getPurpose(){
        return purpose;
    }
    @Override
    public String toString(){
        return "\nphone number: "+phonenumber+" for "+purpose+"\n";
    }

}
