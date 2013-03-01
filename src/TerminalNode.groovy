// +,-,*,/ internal nodes will have 2 children (arity 2)
// sin, cos, exponents, log, ln, e will all have arity of 1
//terminals are either constants or variables (no lists of any sort involve)

//List of what we need to do:
//Make a node class (which have parents, children)
//Make a function that creates the tree (given list of terminals, list of variables)
//Make a function to evalute the tree (function must take all variables defined)

class TerminalNode implements Node{

    //values such as x
    
    TerminalNode(parent){
        this.parent = parent
    }

    @Override
    public Node root() {
        if(this.parent != null){
            this.parent.root()
        }
        return this
    }
    
    @Override
    String toString() {
        value
    }

}
