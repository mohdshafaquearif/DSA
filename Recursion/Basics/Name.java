
public class Name {
    public static void name(int count){
        if(count==5)return;
        System.out.println("Arif");
        count++;
        name(count);
    }
    public static void main(String[] args) {
        name(0);
    }
}
