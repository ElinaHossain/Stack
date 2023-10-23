public class Driver {
	
	public static void main(String[] args) {
	
		// declare/initialize a Stack object
		Stack<Game> stack = new Stack<Game>(); // empty stack
		
		Game game1 = new Game("Mario", 50);
		Game game2 = new Game("Sonic", 60);
		Game game3 = new Game("MK", 70);
      Game game4 = new Game("Minecraft", 25);
      Game game5 = new Game("Fortnite", 0);
      
		
		// currently our stack is empty with size 0
		info(stack);
      boolean IsEmpty = stack.isEmpty();
      System.out.println("Is the stack Empty? " + IsEmpty);
		// add a game to the stack
		stack.push(game1);
      stack.peek();
		info(stack);
      IsEmpty = stack.isEmpty();
      System.out.println("Is the stack Empty? " + IsEmpty);
      stack.pop();
      info(stack);
      IsEmpty = stack.isEmpty();
      System.out.println("Is the stack Empty? " + IsEmpty);
		// add another game onto our stack
		stack.push(game5);
      info(stack);
		stack.push(game4);
      info(stack);
      stack.push(game3);
      info(stack);
      stack.push(game2);
      info(stack);
      stack.push(game1);
      info(stack);	
      //contains
      boolean containsItem = stack.contains(game1);
      System.out.println("Does the stack contain game1?: " + containsItem);
      
		info(stack);
		stack.pop();
		stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
		info(stack);
		
	}
	
	public static void info(Stack stack) {
		System.out.println("Item on top of the stack: " + stack.peek());		
		System.out.println("           size of stack: " + stack.size());		
	}

}