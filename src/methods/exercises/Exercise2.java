package methods.exercises;

/**
 * Exercise 2: Modifiers
 * ----------------------
 * 1. Create one method with each access modifier:
 *    - public, protected, default, private
 * 2. Create one static method and one final method.
 * 3. Try calling them inside main().
 */

public class Exercise2
{
    public static void main(String[] args)
    {
        Exercise2 obj = new Exercise2();

        // Example usage
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        obj.privateMethod();
        Exercise2.staticMethod();
        obj.finalMethod();
    }

    // TODO: Call other methods here
    
    // Example: public method
    public void publicMethod()
    {
        System.out.println("Public method called");
    }

    // TODO: Add protectedMethod()
    protected void protectedMethod()
    {
        System.out.println("Protected method called");
    }

    // TODO: Add defaultMethod()
    void defaultMethod()
    {
        System.out.println("Default method called");
    }

    // TODO: Add privateMethod()
    private void privateMethod()
    {
        System.out.println("Private method called");
    }

    // TODO: Add staticMethod()
    public static void staticMethod()
    {
        System.out.println("Static method called");
    }

    // TODO: Add finalMethod()
    public final void finalMethod()
    {
        System.out.println("Final method called");
    }

}
