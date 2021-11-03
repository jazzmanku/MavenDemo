package Intro;

public class Functions {

    public static void main(String[] args) {
        sum(10,20);
        sum(120,2320);
        sum(104354,22320);
        sum(156450,23650);

        subtract(104354,22320);
        subtract(156450,23650);

    }

    public static void sum(int a, int b){
        int sum = a + b;
        System.out.println("Sum is = " + sum);
    }


    public static void subtract(int a, int b){
        int diff = a - b;
        System.out.println("Difference is = " + diff);
    }

    /*
    #1
    product - a,b
	Div		- a,b = a/b
		with condition
		     if b =0 , print error message

	#2
	Loops, functions

	Multiplication table and make it Dynamic
	printTable(tableOf, maxList);

	printTable(5,15)
	5x1=5
	.
	.
	5x15=75
	printTable(6,10)
	6x1=6
	.
	.
	6x10=60

    #3 Intro.Greetings
    for 5 people
    5 people data = Array
    function, Intro.Arrays, Loops, conditions
    Inputs:
    fName, lastName, gender, age
    if age <10 - Jr
        if not, gender = m => Mr,
                        f => Ms.
     */

}
