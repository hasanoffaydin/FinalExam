package Visitor;

public class Calculate implements Visitor{
    @Override
    public void visit(Cycle circle) {
        System.out.println("Radiusu : " + circle.getRadius());
    }

    @Override
    public void visit(Kvadrat kvadrat) {
        System.out.println("Eni ve uzunlugu : " + kvadrat.getEn() + kvadrat.getUzunluq());
    }
}
