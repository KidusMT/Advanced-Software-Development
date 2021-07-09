package main;

public class Leaf extends Component {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
