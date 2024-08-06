package CollectionFramework;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        Stack<String> animal = new Stack<>();

        // pushing animals in Stack
        animal.push("Horse");
        animal.push("lion");
        animal.push("dog");
        animal.push("cat");

        System.out.println("Stack:" + animal);

        //finding peek animals in stack by peek function
        System.out.println(animal.peek());

        // pop function
        animal.pop();
        System.out.println(animal.peek());
    }
}
