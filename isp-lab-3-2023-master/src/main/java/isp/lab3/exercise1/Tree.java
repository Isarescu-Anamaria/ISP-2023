package isp.lab3.exercise1;

public class Tree {
//class Tree
   private int height;

//constructor
    public Tree() {
        height = 15;
    }

    public int getHeight() {
        return height;
    }
    public void grow(int meters){
        if(meters >= 1){
            height+=meters;
            System.out.println("height= "+ height);
        }
        else{
            System.out.println("Cannot add");
        }
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                '}';
    }
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        tree1.grow(2);
        System.out.println(tree1);
        String string = tree1.toString();
        System.out.println(string);

    }
}
