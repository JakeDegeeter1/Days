class Main{
   public static void main(String[] args){
      Day bDay = new Day(2008, 7, 3);
      Day currentDay = new Day(2023, 10, 16);
      Day ApTest = new Day(2024, 5, 8);
      System.out.println(":i have been alive for " + -bDay.daysFrom(currentDay) + " days");
      System.out.println("There are " + -currentDay.daysFrom(ApTest) + " till the Ap computer science test");
      }
}