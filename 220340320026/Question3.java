import java.util.*;

class TwoStackSingleArray{
	int size;
	int top1;
	int top2;
	int[] arr;
	
	public TwoStackSingleArray(int sizeOfStack){
		this.arr = new int[sizeOfStack * 2];
		this.size = sizeOfStack;
		top1 = -1;
		top2 = sizeOfStack - 1;
	}
	
	public void push1(int value){
		if (top1 >= size){
			throw new RuntimeException("Stack1 is full");
		}
		top1++;
		arr[top1] = value;
	}
	
	public void push2(int value){
		top2++;
		arr[top2] = value;
	}
	
	public int pop1(){
		return arr[top1--];
	}
	
	public int pop2(){
		return arr[top2--];
	}
	
	public void print(){
		System.out.println(Arrays.toString(arr));
	}
}

public class Question3{
	public static void main(String[] args){
		TwoStackSingleArray ts = new TwoStackSingleArray(5);
		
		ts.push1(5);
		ts.push2(10);
		ts.push2(15);
		ts.push1(11);
		ts.push2(7);
		ts.push2(40);
		
		System.out.println("Popped element from stack1 is: "+ts.pop1());
		System.out.println("Popped element from stack2 is: "+ts.pop2());
		
	} 
}