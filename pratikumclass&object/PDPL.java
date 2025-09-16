
public class PDPL {
    private String geekName;
    private int geekRoll;
    private int geekAge;

    //method ggetter
    public int geekAge(){
        return geekAge;
    }

    public String geekName(){
        return geekName;
    }

    public int geekRoll(){
        return geekRoll;
    }

    //method setter

    public void setAge(int newAge){
        geekAge = newAge;
    }
    public void setName(String newName){
        geekName= newName;
    }
    public void setRoll(int newRoll){
        geekRoll= newRoll;
    }
}
