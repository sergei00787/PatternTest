package prototype_pattern;

public class Mein {
    public static void main(String[] args) {
        ConcreteProto concreteProto = new ConcreteProto(4);
        concreteProto.setI1(1);
        concreteProto.setI2(2);
        concreteProto.setS1("s1");
        concreteProto.setS2("s2");
        ConcreteProto cloneConcreteProto = (ConcreteProto) concreteProto.clone();

        ConcreteProto2 concreteProto2 = new ConcreteProto2(12, 13);
        ConcreteProto2 cloneConcreteProto2 = (ConcreteProto2) concreteProto2.clone();

        System.out.println(concreteProto.hashCode());
        System.out.println(cloneConcreteProto.hashCode());

        System.out.println(concreteProto2.hashCode());
        System.out.println(cloneConcreteProto2.hashCode());

        System.out.println(concreteProto);
        System.out.println(cloneConcreteProto);
        System.out.println(concreteProto2);
        System.out.println(cloneConcreteProto2);


        System.out.println(cloneConcreteProto.getI3());
        System.out.println(cloneConcreteProto2.getWidth());
        System.out.println(cloneConcreteProto2.getHeight());


    }
}
