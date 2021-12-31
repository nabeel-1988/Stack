package stack;

public interface StackInterface {
	
	boolean isEmpty();
	void push(Object objectToPushInStack);
	Object peek();
	Object pop();
	Object search(Object objectToSearch);

}
