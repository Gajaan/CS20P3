package Skillbuilders;

public class squares {
    public static void main(String[] args) {
        
        int[] squares = new int[5];
        
        for (int i = 0; i < 5; i++) {
            squares[i] = i * i;
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println(squares[i]);
        }
    }
}