package week7;

public class SecondOop {
    public static void main(String[] args) {
        Human p = new Human();
        p.name = "Hari";
        p.age = 19;

        p.HumanInfo();

        Human p2 = new Human();
        p2.name = "Shyam";
        p2.age = 15;
        p2.HumanInfo();
        // p2.phNumber = "9562"; // you cannot do this

        Football f1 = new Football();
        f1.homeTeam = "England";
        f1.awayTeam = "Spain";
        f1.time = 90;
        f1.setGoal(3);
        f1.setWinner("England");
        f1.detail();
    }

}

class Human {
    String name;
    int age;
    // access modifier, it is "default" if not specified
    private String phNumber;
    public int salary;

    void HumanInfo() {
        System.out.println(name);
    }

    void setPhNumber() {
        this.phNumber = "9090";
    }

    void setNewphNumber(String num) {
        this.phNumber = num;
    }

    String getPhNumber() {
        return phNumber;
    }

    void setThisNUmber(String phNumber) {
        this.phNumber = phNumber;
    }
}

// Task
// create a class Football
// make two attribute
// String hometeam and awayTeam
// make another attribute time
// make private attribute goal
// make a setter for goal
// make a getter for goal
// make private attribute winner as string
// make only setter for winner
// make function detail() - > print winner name, time and total goal
// make object of football and fill all the attribute

class Football {
    String homeTeam;
    String awayTeam;
    int time;
    private int goal;
    private String winner;

    void setGoal(int goal) {
        this.goal = goal;
    }

    int getGoal() {
        return this.goal;
    }

    void setWinner(String winner) {
        this.winner = winner;
    }

    void detail() {
        System.out.println("Winner:" + winner + " Time:" + time + " Goals:" + goal);
    }

}
