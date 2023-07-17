public class BMI {
    private int weight;
    private double height;
    public BMI(int weight, double height){
        this.weight = weight;
        if(height > 100) { // For best user experience.
            this.height = height/100;
        } else {
            this.height = height;
        }
    }
    public double getBMI(){
        return weight/(height*height);
    }
    
    public String getStatus(){
        if (getBMI() >= 0 && getBMI() <= 18.4) {
            return "underweight";
        } else if (getBMI() > 18.4 && getBMI() <= 25.4) {
            return "healthy";
        } else if (getBMI() > 25.4 && getBMI() <= 30.0) {
            return "overweight";
        } else {
            return "obese";
        }
    }
}
