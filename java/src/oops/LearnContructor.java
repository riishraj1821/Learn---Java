package oops;

public class LearnContructor {

    static class  Complex {

        int a,b;

        public Complex() {
            a = 1;
            b = 2;
        }

        void print(){
            System.out.println(a +"," +b +"i");

        }
    }


    public static void main(String[] args) {
        Complex obj = new Complex();
        obj.print();

    }
}
