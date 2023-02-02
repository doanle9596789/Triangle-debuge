package a;

public class IllegalTriangleException extends Exception {
    String mesenge;

    public IllegalTriangleException(String mesenge) {
        this.mesenge = mesenge;

    }

    public IllegalTriangleException() {

    }

    public String getMesenge() {
        return mesenge;
    }

    public void setMesenge(String mesenge) {
        this.mesenge = mesenge;
    }
}