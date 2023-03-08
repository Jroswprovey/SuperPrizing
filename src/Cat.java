public class Cat extends Animals{
    String Claws;
    String Color;
    String Weight;


    public void Cat(String claws, String color, String weight){
        Claws = claws;
        Color = color;
        Weight = weight;
    }


    public String getClaws() {
        return Claws;
    }

    public String getColor() {
        return Color;
    }

    public String getWeight() {
        return Weight;
    }

}
