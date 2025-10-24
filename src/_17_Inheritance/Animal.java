package _17_Inheritance;

public class Animal {
    String animalName;
    int animalAge;

    // AllArgs 생성자 하나 생성, getter/setter 생성
    // 메소드에 move 만들기
    // 움직입니다. 출력

    public Animal(String animalName,int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public void move() {
        System.out.println("움직입니다.");
    }
}
