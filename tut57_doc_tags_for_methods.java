package com.company;


/**
 * <p>Are you feeling good?</p><p>You will surly feel after this:-)</p>EnJoYyYyYyYyY...........................
 * {@code This is class #107.}
 */
public class JavaDocMethodTags_107 {
    /**
     * @param args These are arguments supplies to the command line.
     */
    public static void main(String[] args) {
        System.out.println("I ma main method.");
    }

    /**
     * Hello this is a method, AND this is a most beautiful method of this class.
     * @param i This is first number to add.
     * @param j This is second number to add.
     * @return This returns sum of two numbers.
     * @throws Exception if i==0.
     * @deprecated This method is deprecated please use Addition operator.
     */
    public int add(int i ,int j) throws Exception {
        if (i==0){
            throw new Exception();
        }
        return i+j;}
}
