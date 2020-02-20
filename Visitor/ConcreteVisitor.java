package Visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public String visit(VisitableQuestion vQ) {
        StringBuilder sb = new StringBuilder(vQ.getStr());
        return sb.append(" ?").toString();
    }

    @Override
    public String visit(VisitableExclamation vE){
        StringBuilder sb = new StringBuilder(vE.getStr());
        return sb.append(" !").toString();
    }
}
