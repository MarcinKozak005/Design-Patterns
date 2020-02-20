package Visitor;

public class VisitableExclamation implements Visitable {

    private String str;

    public String getStr(){
        return this.str;
    }

    VisitableExclamation(String str){
        this.str = str;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
