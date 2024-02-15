

public class eMT {
    public static void main(String[] args) {
        ExerciseMethods1 yep = new ExerciseMethods1();
        // intRange(1,2,3,4) returns 3
		// intRange(8,6,4,2) returns 6
		// intRange(-1,-9,-7,-5) returns 8
		// intRange(7,-10,10,8) returns 20
		// intRange(1,1,1,1) returns 0
        

        System.out.println(yep.intRange(1,2,3,4) + " returns 3");

        System.out.println(yep.intReverse(4321) + " returns 1234");
    }
}
