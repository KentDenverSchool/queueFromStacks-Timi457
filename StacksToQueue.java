/*
  * StacksToQueu  Ryan 9/30/18 /
 */
 
public class StacksToQueue{
    private Stack in;
    private Stack out;

    public StacksToQueue(){
        in = new Stack();
        out = new Stack();
    }

void enqueue(Object o){
    in.push(o);
}  //add an element

Object dequeue() {
    if(out.isEmpty()){
        move();
        return out.pop();
    }else if(isEmpty()){
        System.out.println("The stack is empty. No dequeing");
        return null;
    }else{
        return out.pop();
    }
}               
//remove and return the least recent element
boolean isEmpty() {
    return (size() == 0);
}

int size(){
    return in.size() + out.size();
}

                //look at the least recent element without removing

private void move(){
    while(in.size() != 0){
        out.push(in.pop());
    }
}

}