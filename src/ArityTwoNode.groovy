class ArityTwoNode implements Node{

    // *,-, +, /
    def value
    
    ArityTwoNode(value){
        this.value = value
    }
    
    ArityTwoNode(value, parent){
        this.parent = parent
        this.value = value
    }

    ArityTwoNode(value, parent, leftChild, rightChild){
        this.value = value
        this.parent = parent
        this.leftChild = leftChild
        this.rightChild = rightChild
    }

    @Override
    public Node root() {
        if(this.parent != null){
            this.parent.root()
        }
        return this
    }
    
//    operate{
//        
//    }
//    
//    mult
//    add
//    subtract
//    divide
    
    @Override
    String toString() {
        value
    }
}