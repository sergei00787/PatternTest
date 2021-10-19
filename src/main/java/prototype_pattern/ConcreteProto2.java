package prototype_pattern;

import java.util.Objects;

public class ConcreteProto2 extends ConcreteProto{
    private int width;
    private int height;

    public ConcreteProto2() {
    }

    public ConcreteProto2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public ConcreteProto2(ConcreteProto2 concreteProto) {
        super(concreteProto);
        if (concreteProto != null) {
            this.width = concreteProto.width;
            this.height = concreteProto.height;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public CsPrototype clone() {
        return new ConcreteProto2(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConcreteProto2)) return false;
        if (!super.equals(o)) return false;
        ConcreteProto2 that = (ConcreteProto2) o;
        return width == that.width && height == that.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }
}
