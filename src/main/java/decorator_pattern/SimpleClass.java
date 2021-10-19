package decorator_pattern;

public class SimpleClass implements ISimpleClass{
    private int i;
    private int j;
    private SimpleClass child;

    public SimpleClass(int i, int j, SimpleClass child) {
        this.i = i;
        this.j = j;
        this.child = child;
    }

    @Override
    public void doJob(){
        System.out.println("Do simple Job");
    }
}
