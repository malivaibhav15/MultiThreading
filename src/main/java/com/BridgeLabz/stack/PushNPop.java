package com.BridgeLabz.stack;

import java.util.Stack;

public class PushNPop {
    Stack<String> stack = new Stack<>();

    public static void main(String[] args) {
        Push push = new Push();
        Pop pop = new Pop();
        Thread threadPush = new Thread(push);
        Thread threadPop = new Thread(pop);
        threadPop.start();
        threadPush.start();
    }
}
