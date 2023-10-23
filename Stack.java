public class Stack<T> implements StackInterface<T> {
	
	private Node<T> top;
	private int size;
	
	public void push(T item) {
      if(item == null) {
           throw new IllegalArgumentException();
      }
		// save the prev. node in a "temp" variable
		Node prevNode = top;
		// initialize 'top' to a new node and pass in item and prevNode
		top = new Node(item, prevNode);
		size++;
	}
	
	public T pop() {
      if(isEmpty()) {
         throw new IllegalArgumentException();
         }
		// save the item thats on top of the stack into a temp. variable
		T itemToReturn = top.getItem();
		// reassign top to the next node
		top = top.getNext();
		size--;
		return itemToReturn;
	}
	
	public T peek() {
		// get the item on top of the stack
		if(size > 0) {
			return top.getItem();
		}
		else {
			return null;
		}
	}
	
	public boolean isEmpty() {
      if(size == 0) {
         return true;
         }
      else {
		   return false; 
         }
      }

	public int size() {
      return size;
      }
	
	public boolean contains(T item) {
		// use a temp. variable and initialize to top
      	Node nextNode = top;
		// using the temp. variable, loop until next node is not null (while loop is common for this)
      	while (nextNode != null) {
        // and check if a match is found for this item
        if (nextNode.getItem().equals(item)) {
            return true;
        }
          nextNode = nextNode.getNext();
        }
      // return true if item found, false otherwise
		return false; 
	}

}