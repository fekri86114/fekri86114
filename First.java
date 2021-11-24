public class First{
    public static void main(String[] args) {
                double weightofEachePerson = 75.5;
                int numberofPeople = 16;
                double  totalWeight = weightofEachePerson * numberofPeople;
                double First = 750;
                System.out.println(numberofPeople + "People get on!!");
                if (totalWeight <= First) {
                    System.out.println("The door can be closed!");
                }else {
                    System.out.println("The number of people is more than elevtor capacity and the door can't be closed!");
                }
    }
}