package ua.kiev.prog.hw1;

public class Responder {
    private String firstName;
    private String lastName;
    private int age;
    private Response question1;
    private Response question2;

    public Responder(String firstName, String lastName, int age, Response question1, Response question2) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.question1 = question1;
        this.question2 = question2;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Response getQuestion1() {
        return question1;
    }

    public Response getQuestion2() {
        return question2;
    }

    public enum Response {
        RESPONSE1, RESPONSE2
    }
}
