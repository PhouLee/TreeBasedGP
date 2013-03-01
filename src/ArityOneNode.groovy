class ArityOneNode implements Node{

    // sin cos roots log e
    def value
    
    ArityOneNode(value){
        this.value = value
    }
    
    ArityOneNode(parent, value){
        this.parent = parent
        this.value = value
    }

    ArityOneNode(parent, leftChild, value){
        this.parent = parent
        this.leftChild = leftChild
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
