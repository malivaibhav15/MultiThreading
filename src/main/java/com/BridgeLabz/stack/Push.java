package com.BridgeLabz.stack;

import java.util.Stack;

public class Push extends PushNPop implements Runnable {
    @Override
    public void run() {

    }

    private void printStack(Stack<String> stack) {
        if (stack.isEmpty())
            System.out.println("Stack is empty");
        System.out.println(stack.peek());
    }

}
