package Visitor;

public interface Visitor {
    String visit(VisitableQuestion vQ);
    String visit(VisitableExclamation vE);

}
