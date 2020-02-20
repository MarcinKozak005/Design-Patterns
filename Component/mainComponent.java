package Component;


//Add option Leaf->Composer?
public class mainComponent
{
    public static void main(String[] args) {
        Composer wholeTree = new Composer();

        wholeTree.add(new Leaf(12));
        wholeTree.add(new Leaf(15));

        Composer subTree = new Composer();
        subTree.add(new Leaf(23));
        subTree.add(new Leaf(21));
        subTree.add(new Leaf(29));

        wholeTree.add(subTree);

        wholeTree.operation();

    }
}
