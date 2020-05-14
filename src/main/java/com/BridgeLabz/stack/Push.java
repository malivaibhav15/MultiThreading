package com.BridgeLabz.stack;

import java.util.Stack;

public class Push extends PushNPop implements Runnable {
    @Override
    public void run() {

        stack.push("AB");
        printStack(stack);
        stack.push("CD");
        printStack(stack);
        stack.push("EF");
        printStack(stack);
        stack.push("GH");
        printStack(stack);
        stack.push("IJ");
        printStack(stack);
        stack.push("KL");
        printStack(stack);
        stack.push("YZ");
        printStack(stack);

        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
    }

    private void printStack(Stack<String> stack) {
        if (stack.isEmpty())
            System.out.println("Stack is empty");
        System.out.println(stack);
    }

}
