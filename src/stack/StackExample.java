package stack;

import java.util.ArrayList;
import java.util.List;

public class StackExample implements StackInterface {

	private List<Object> stackSample = new ArrayList<Object>();

	@Override
	public boolean isEmpty() {

		if (stackSample.isEmpty()) {
			return true;
		}

		return false;
	}

	@Override
	public void push(Object objectToPushInStack) {

		stackSample.add(objectToPushInStack);

	}

	@Override
	public Object peek() {
		Object objectOnTop = null;
		try {
			if (isEmpty() == true) {
				System.out.println("Stack is empty");
				return objectOnTop;
			} else {
				int sizeOfStack = stackSample.size();
				objectOnTop = stackSample.get(sizeOfStack - 1);
				return objectOnTop;
			}

		} catch (Exception e) {
			System.out.println("Stack is Empty");

		}
		return objectOnTop;
	}

	@Override
	public Object pop() {
		Object objectOnTop = null;
		try {
			if (isEmpty() == true) {
				System.out.println("Stack is empty");
				return objectOnTop;
			} else {
				int sizeOfStack = stackSample.size();
				objectOnTop = stackSample.get(sizeOfStack - 1);
				stackSample.remove(objectOnTop);
				return objectOnTop;
			}

		} catch (Exception e) {
			System.out.println("Stack is Empty");

		}
		return objectOnTop;

	}

	@Override
	public Object search(Object objectToSearch) {
		Object objectInStack = null;

		if (isEmpty() != true) {

			for (Object a : stackSample) {
				if (a.equals(objectToSearch)) {
					objectInStack = a;
					return a;
				}
			}
		} else {
			System.out.println("Stack is empty");
			return objectInStack;

		}

		return objectInStack;

	}
}
