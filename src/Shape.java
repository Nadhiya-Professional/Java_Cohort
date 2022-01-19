public class Shape {

    public void print(){
        System.out.println("Printing Shape");
    }
    public static class Rectangle extends Shape{
        public void print(){
            super.print();
            System.out.println("Printing rectangle");
        }
    }
    public static class Circle extends Shape{

        public void print(){
            super.print();
            System.out.println("Printing Circle");
        }
    }
    public static class triangle extends Shape{
        public void print(){
            System.out.println("Printing Circle");
        }
    }
    public static void main(String args[]){
        Rectangle rect = new Rectangle();
        rect.print();
        Shape circ = new Circle();
        circ.print();


    }
}
