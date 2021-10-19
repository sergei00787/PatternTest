package decorator_pattern;

public class Main {
    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass(1,2, null);
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(simpleClass);
        concreteDecorator.doJob();
    }

}
