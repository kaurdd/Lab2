class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int num = 55;
    System.out.println("M&M's in each bag:" + num);
    

    double blue, brown, green, orange, red, yellow;

    blue = .24;
    brown = .13;
    green = .16;
    orange = .20;
    red = .13;
    yellow = .14;

    System.out.println("% of blue M&M in each bag: " + (blue*100));
    System.out.println("% of brown M&M in each bag: " +(brown*100));
    System.out.println("% of green M&M in each bag: " +(green*100));
    System.out.println("% of orange M&M in each bag: " + (orange*100));
    System.out.println("% of red M&M in each bag: " + (red*100));
    System.out.println("% of yellow M&M in each bag: " + (yellow*100));
    
  
    int bags = 10;
    System.out.println("number of bags: " + bags);

    int total = bags*num;

    System.out.println("Total M&M's: " + total);

    double totalblue = blue*total;
    double totalbrown = brown*total;
    double totalgreen = green*total;
    double totalorange = orange*total;
    double totalred = red*total;
    double totalyellow = yellow*total;

    System.out.println("total blue M&M: " + totalblue);
    System.out.println("total brown M&M: " + totalbrown);
    System.out.println("total green M&M: " + totalgreen);
    System.out.println("Total orange M&M: " + totalorange);
    System.out.println("total red M&M: " + totalred);
    System.out.println("total yellow M&M: " + totalyellow); 

    double sum = totalblue+totalbrown+totalgreen+totalorange+totalred+totalyellow;
    
    System.out.println("sum " + sum);

  System.out.println("Blue over brown: " + (blue>brown) + " and green over orange: " + (green>orange));
  System.out.println("Brown is less than or equal to Red: " + (brown<=red));
  System.out.println("numbers match: " + (sum==total));




  }
}