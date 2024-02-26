package isp.lab3.exercise1;
import isp.lab3.exercise5.VendingMachine;
import org.junit.Test;
import static org.junit.Assert.*;
public class VendingMachineTest {

    @Test
    public void testDisplayProducts(){

        int n = 5;
        String s[] = new String[n];
        int p[] = new int[n];
        s[0] = "Coke"; p[0] = 5;
        s[1] = "Pepsi"; p[1] = 4;
        s[2] = "water"; p[2] = 3;
        s[3] = "KitKat"; p[3] = 4;
        s[4] = "Lays"; p[4] = 6;
        VendingMachine vm = new VendingMachine(n,s,p,0);

        assertEquals("Coke costs 5 lei" +
                "Pepsi costs 4 lei" +
                "water costs 3 lei" +
                "KitKat costs 4 lei" +
                "Lays costs 6 lei", vm.displayProducts());


    }

}
