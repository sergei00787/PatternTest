package prototype_pattern;

import java.util.Objects;

public class ConcreteProto extends CsPrototype{
    private int i3;

    public ConcreteProto(int i3) {
        this.i3 = i3;
    }

    public ConcreteProto() {
    }

    public ConcreteProto(ConcreteProto concreteProto) {
        super(concreteProto);
        if (concreteProto != null) this.i3 = concreteProto.i3;
    }

    @Override
    public CsPrototype clone() {
        return new ConcreteProto(this);
    }

    public int getI3() {
        return i3;
    }

    public void setI3(int i3) {
        this.i3 = i3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConcreteProto)) return false;
        if (!super.equals(o)) return false;
        ConcreteProto that = (ConcreteProto) o;
        return i3 == that.i3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), i3);
    }
}
