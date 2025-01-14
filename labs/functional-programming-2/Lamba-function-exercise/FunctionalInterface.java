// Java program to demonstrate functional interface

class Polygon {
    public void display(){
        System.out.println("Inside the Polygon Class");
    }
}


class FunctionalInterface {
    public void createClass(){
        Polygon p1 = new Polygon(){
            public void display(){
                System.out.println("Inside an annonymus class.");
            }
        };
        p1.display();
    }

    public static void main(String args[]) {
        // create anonymous inner class object
        FunctionalInterface fi = new FunctionalInterface();
        fi.createClass();

    }
}
