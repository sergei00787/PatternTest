package prototype_pattern;

import java.util.Objects;

public abstract class CsPrototype {

    int i1;
    int i2;
    String s1;
    String s2;

    public CsPrototype(){
    }

    public CsPrototype(CsPrototype prototype) {
        if (prototype != null){
            this.i1 = prototype.i1;
            this.i2 = prototype.i2;
            this.s1 = prototype.s1;
            this.s2 = prototype.s2;
        }
    }

    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public int getI2() {
        return i2;
    }

    public void setI2(int i2) {
        this.i2 = i2;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public abstract CsPrototype clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CsPrototype)) return false;
        CsPrototype that = (CsPrototype) o;
        return i1 == that.i1 && i2 == that.i2 && Objects.equals(s1, that.s1) && Objects.equals(s2, that.s2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i1, i2, s1, s2);
    }
}
