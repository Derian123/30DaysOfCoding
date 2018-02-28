/**
 * Created by derianescobar on 2/27/18.
 */
class Student extends Person{
    private int[] testScores;
    String firstName;
    String lastName;
    int id;

    public Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        testScores = scores;
    }
    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here

    public char calculate(){
        int total = 0;
        for(int i = 0; i < testScores.length; i++){

            total += testScores[i];
        }
        total /= testScores.length;
        if(total >= 90 && total <= 100){

            return 'O';
        }
        if(total < 90 && total >= 80){

            return 'E';
        }
        if(total < 80 && total >= 70){

            return 'A';
        }
        if(total < 70 && total >= 55){

            return 'P';
        }
        if(total < 55 && total >= 40){

            return 'D';
        }
        else{
            return 'T';
        }
    }
    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
}