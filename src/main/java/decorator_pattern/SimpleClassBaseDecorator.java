package decorator_pattern;

public class SimpleClassBaseDecorator implements ISimpleClass{
    SimpleClass wrappedClass;

    public SimpleClassBaseDecorator(SimpleClass wrappedClass) {
        this.wrappedClass = wrappedClass;
    }

    @Override
    public void doJob() {
        System.out.println("Do job in Base Decorator");
        wrappedClass.doJob();
    }
}
