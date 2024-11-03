public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double distance(){
        return roundedToHundredth(Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
    }
    public double yIntercept(){
        return y1 - ((double) (y2 - y1) / (x2 - x1) * x1);
    }
    public double slope(){
        double x =  (x2 - x1);
        double y = (y2 - y1);
        return roundedToHundredth(y/x);
    }
    public String equation(){
        if (y1 == y2){
            return "y = " + yIntercept();
        }
        return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x" + " + " +  yIntercept();
    }
    public String coordinateForX(double x){
        System.out.println();
        double y = slope() * x + yIntercept();
        return "(" + x + ", " + y + ")";
    }
    public String lineInfo(){
        return ("The two points are: " + "("+ x1 + ", " + y1 + ")" + " and " + "("+ x2 + ", " + y2 + ")") + "\n" +
                ("The equation of the line between these points is: " + equation()) + "\n" +
                ("The y-intercept of the line is: " + yIntercept()) + "\n" +
                ("The slope of this line is: " + slope()) + "\n" +
                ("The distance between the two points is: " + distance());
    }
    private double roundedToHundredth(double toRound){
        return Math.round(toRound * 100) / 100.0;
    }

}
