package isp.lab6.exercise3;

public class UserInterface {
    private LoginSystem loginSyst = new LoginSystem();
    private OnlineStore store = new OnlineStore();

    //methods
    public void loadInterface(){
        loginSyst.register("Leanne Dane","123456");
        boolean var = loginSyst.login("Leanne Dane","123456");
        if(var == true){
            System.out.println("Logged in");
        }
        else{
            System.out.println("Already logged in");
        }
        Product product1 = new Product("book",37.35);
        store.addToCart("Leanne Dane",product1,1);
        Product product2 = new Product("pencil",1.29);
        store.addToCart("Leanne Dane",product2,3);
        Product product3 = new Product("eraser",1.70);
        store.addToCart("Leanne Dane",product3,1);
        store.checkout("Leanne Dane");
        var = loginSyst.logout("Leanne Dane");
        if(var == true){
            System.out.println("Logged out");
        }
    }

}
