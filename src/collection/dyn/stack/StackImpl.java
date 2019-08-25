package collection.dyn.stack;

public class StackImpl implements Stack {
    private int top = 0;
    int[] stack = new int[1];

    public void push(int value) {
        if (top >= stack.length) {
            int[] tempStack = new int[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                tempStack[i] = stack[i];
            }
            stack=tempStack;
        }
        stack[top] = value;
            top++;
    }
        public void pop () {
            if (top!=0) {
                int f = top-1;
                stack[f] = 0;
                top--;
            }
            else System.out.println("Стэк пуст");
        }

//        public void show(){
//            for (int i = 0; i < stack.length; i++) {
//                System.out.println(stack[i]);
//            }
//        }
}
