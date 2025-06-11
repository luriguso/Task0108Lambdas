package level2.exercise3.classManagement;

import level2.exercise3.interfaces.OperationInterface;

public class OperationMathManagement {
    public void operationMath(){
        OperationInterface addition = (a, b) -> a + b;
        OperationInterface subtraction  = (a, b) -> a - b;
        OperationInterface multiplication  = (a, b) -> b==0 ? 0 : a * b;
        OperationInterface division    = (a, b) -> a / b;

        System.out.println("Addition is: " + addition.operation(3, 4));
        System.out.println("Subtraction is: " + subtraction.operation(3, 4));
        System.out.println("Multiplication is: " + multiplication.operation(3, 4));
        System.out.println("Division is: " + division.operation(3, 4));
    }
}
