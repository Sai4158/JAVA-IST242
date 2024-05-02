package Model;

public class Model {
    //instance variables
    private String S1, S2, S3;

    public Model(){
        S1 = "This text for button 1";
        S2 = "This text button 2";
        S3 = "This text button 3";
    }

    //get and seters
    public String getS1() {
        return S1;
    }

    public void setS1(String s1) {
        S1 = s1;
    }

    public String getS2() {
        return S2;
    }

    public void setS2(String s2) {
        S2 = s2;
    }

    public String getS3() {
        return S3;
    }

    public void setS3(String s3) {
        S3 = s3;
    }
}
