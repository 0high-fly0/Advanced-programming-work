package lab06;

public class GenericStack<E> {
	  private java.util.ArrayList<E> list = new java.util.ArrayList<E> ();
	  
	  public int getSize() {
		  return list.size();
	  }
	  // get peek of the stack
	  public E peek() {
		  return list.get(getSize() - 1);
	  }
	  // push an E element into stack
	  public void push(E o) {
		  list.add(o);
	  }
	  
	  // pop and get peek Element
	  public E pop() {
		  E o = list.get(getSize()-1);
		  list.remove(getSize()-1);
		  return o;
	  }
	  
	  public boolean isEmpty() {
		  return list.isEmpty();
	  }
	}
