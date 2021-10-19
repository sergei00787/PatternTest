package decorator_pattern;

public class ConcreteDecorator extends SimpleClassBaseDecorator{
    public ConcreteDecorator(SimpleClass wrappedClass) {
        super(wrappedClass);
    }

    public void doOtherWork(){
        System.out.println("Do other work in concrete decorator");
    }

    @Override
    public void doJob() {
        doOtherWork();
        super.doJob();
    }
}
