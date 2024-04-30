
import java.lang.Math;

import java.util.Random;
public class Athlete extends Person implements Contract {

    private double height;

    private int age;

    private double weight;

    private NationalTeam nationalTeam;


    public Athlete(int dni, String name, double height, int age, double weight) {
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public NationalTeam getNationalTeam() {
        return nationalTeam;
    }

    public void setNationalTeam(NationalTeam nationalTeam) {
        this.nationalTeam = nationalTeam;
    }


    @Override
    public double calculateIMC() {
        return weight / Math.pow(height,2.0);
    }

    @Override
    public boolean thereIsEsxtraWeight(double IMC) {
        if (IMC > 24.9) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double takePulsations() {
        Random rand = new Random();
        return rand.nextInt((60 - 40) + 1) + 40;
    }




}
