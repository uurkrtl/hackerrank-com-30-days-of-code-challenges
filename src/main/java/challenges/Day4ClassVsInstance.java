package challenges;

public class Day4ClassVsInstance {
    private int age;
    private String message;

    public Day4ClassVsInstance(int initialAge) {
        // Add some more code to run some checks on initialAge
        this.age = initialAge;
        if (age < 0){
            message = "Age is not valid, setting age to 0.";
            System.out.println(message);
            age = 0;
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if (age>=0 && age<13) message = "You are young.";
        if (age>=13 && age<18) message = "You are a teenager.";
        if (age>=18) message = "You are old.";
        System.out.println(message);

    }

    public void yearPasses() {
        age++;
    }
}
