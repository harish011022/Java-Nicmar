class Priva{
    private int secretcode = 222;
    private void showcode(){
        System.out.println(secretcode);
    }
    public void display(){
        showcode();
    }
}

public class Privat{
    public static void main(String[] args) {
        Priva obj = new Priva();
        obj.display();
    }
}