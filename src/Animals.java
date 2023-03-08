public class Animals{
    int Legs;
    int Eyes;

    public int getEyes() {
        return Eyes;
    }

    public int getLegs() {
        return Legs;
    }

    public void setEyes(int eyes) {
        Eyes = eyes;
    }

    public void setLegs(int legs) {
        Legs = legs;
    }
}



 class Dog extends Animals {
    String Name;
    int Age;

     public String getName() {
         return Name;
     }
     public int getAge(){
         return Age;
     }
 }

class Terrier extends Dog{
    int NoseLen;

    public Terrier(String name, int age){
         Name = name;
         Age = age;
    }

    public int getNoseLen(){
        return NoseLen;
    }

    public void setNoseLen(int len){
        NoseLen = len;
    }

}

class Puppy extends Dog{
    int weight;
    int length;
    int height;

    public Puppy(int w, int l, int h, int eyes){

        weight = w;
        length = l;
        height = h;
        Eyes = eyes;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int getEyes() {
        return super.getEyes();
    }
}
