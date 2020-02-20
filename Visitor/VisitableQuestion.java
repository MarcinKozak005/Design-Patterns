package Visitor;

public class VisitableQuestion implements Visitable {

    private String str;

    public String getStr(){
        return this.str;
    }

    VisitableQuestion(String str){
        this.str = str;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
