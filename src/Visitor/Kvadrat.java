package Visitor;

public class Kvadrat implements Shape{
    int uzunluq ;
    int en;
    public Kvadrat(int uzunluq,int en) {
        this.en = en;
        this.uzunluq = uzunluq;
    }

    public int getUzunluq() {
        return uzunluq;
    }

    public void setUzunluq(int uzunluq) {
        this.uzunluq = uzunluq;
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
