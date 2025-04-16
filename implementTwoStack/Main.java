class TwoStacks {
    int[] arr;
    int top1, top2, size;

    public TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    public void push1(int value) {
        if (top1 + 1 == top2) return;
        arr[++top1] = value;
    }

    public void push2(int value) {
        if (top1 + 1 == top2) return;
        arr[--top2] = value;
    }

    public int pop1() {
        if (top1 == -1) return -1;
        return arr[top1--];
    }

    public int pop2() {
        if (top2 == size) return -1;
        return arr[top2++];
    }

    public int peek1() {
        if (top1 == -1) return -1;
        return arr[top1];
    }

    public int peek2() {
        if (top2 == size) return -1;
        return arr[top2];
    }
}

public class Main {
    public static void main(String[] args) {
        TwoStacks stacks = new TwoStacks(5);
        stacks.push1(10);
        stacks.push1(20);
        stacks.push2(30);
        stacks.push2(40);
        System.out.println(stacks.pop1());
        System.out.println(stacks.pop2());
    }
}
