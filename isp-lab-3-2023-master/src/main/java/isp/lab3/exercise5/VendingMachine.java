package isp.lab3.exercise5;

public class VendingMachine {

    public int numberOfProducts;
    public String[] products = new String[numberOfProducts];
    public int[] prices = new int[numberOfProducts];
    public int currentCredit;


    public VendingMachine(int numberOfProducts, String[] products, int[] prices, int currentCredit) {
        this.numberOfProducts = numberOfProducts;
        this.products = products;
        this.prices = prices;
        this.currentCredit = currentCredit;
    }

    public void displayProducts(){

        for(int i = 0; i < numberOfProducts; i++){
            System.out.println(products[i] + " costs " + prices[i] + " lei");
        }
    }

    public int insertCoin(int value){
        currentCredit+=value;
        return currentCredit;

    }

    public String selectProduct(int id){
        if(id > numberOfProducts){
            System.out.println("The product with number " + id + "does not exist");
            return null;
        }
        if(prices[id] > currentCredit){
            System.out.println("Insufficient credit");
            return null;
        }

        currentCredit-= prices[id];
        return products[id];
    }


    public void displayCredit(){
        System.out.println("Current credit is: " + currentCredit);
    }

    public void userMenu(){

        System.out.println("The number of products is: " + numberOfProducts);
        System.out.println("Products available: ");
        displayProducts();
        displayCredit();
        if(currentCredit == 0){
            System.out.println("Introduce coin");

        }

    }

    public static void main(String[] args) {
    int n = 5;
    String s[] = new String[n];
    int p[] = new int[n];
    s[0] = "Coke"; p[0] = 5;
    s[1] = "Pepsi"; p[1] = 4;
    s[2] = "water"; p[2] = 3;
    s[3] = "KitKat"; p[3] = 4;
    s[4] = "Lays"; p[4] = 6;
    VendingMachine vm = new VendingMachine(n,s,p,0);
    vm.userMenu();
    int c = vm.insertCoin(10);
    vm.displayCredit();
    String prod = vm.selectProduct(3);
    System.out.println("Your product is: " + prod);
    vm.displayCredit();


    }
}
