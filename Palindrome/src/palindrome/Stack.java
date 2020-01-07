/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
/**
 *
 * @author abans tangalle
 */
public class Stack {
    private final int Maxi_Size;
    private final long[] Stack_Array;
    private int Top;
        public Stack(int s) {
            Maxi_Size = s;
            Stack_Array = new long[Maxi_Size];
            Top = -1;
        }
        public void push(long j) {
            
            Stack_Array[++Top] = j;          
        }
        public long pop() {
            
            return Stack_Array[Top--];         
        }
        public long peek() {
            
            return Stack_Array[Top];
        }
        public boolean isEmpty() {
            
            return (Top == -1);           
        }
        public boolean isFull() {
            
            return (Top == Maxi_Size - 1);         
        }
}
