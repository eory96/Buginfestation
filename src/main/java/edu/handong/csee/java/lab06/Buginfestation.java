package edu.handong.csee.java.lab06;//this is a package name

import java.util.Scanner;//import for using scanner class
/**
 * This calculate how many roaches fill your house
 * and how much time taken.
 * @author samsung
 *
 */

public class Buginfestation {//class name BugInsfestation
	
	final double ONE_BUG_VOLUME=0.002;//define member variable about bug volume
	final double GROWTH_RATE=0.95;//define member variable about growth rate of roaches

	/**
	 * this method is main method and activated by calling a another method
	 * @param args
	 */
	public static void main(String[] args) {//this is main method
		
		Buginfestation result = new Buginfestation();//instantiation of class file
		
		result.mCalculateBug();//call a method from result that is instantiation of BugInsfestation
	}
	/**
	 * this method calculate weeks, amount of bug, and bug's cubic volume
	 */
	public void mCalculateBug() {// this is method for calculate
		int startPopulation;//declare startPopulation
		double houseVolume;//declare houseVolume type is double
		double newBugs=0;//declare newBugs to calculate amount of bug;
		double newBugVolume=0;//declare newVolume to calculate amount of bug's volume;
		int countWeeks=0;//declare countWeeks to calculate weeks;
		
		Scanner keyboard=new Scanner(System.in);//to receive input from keyboard
		System.out.println("Enter the total volume of your house");//printout a sentence "Enter the total volume of your house"
		System.out.print("in cubic feet : ");//printout a sentence "in cubic feet : "
		houseVolume = keyboard.nextInt();//receive value from keyboard and value mean beginning house volume
		System.out.println("Enter the estimated number of");//printout a sentence "Enter the estimated number of"
		System.out.print("roaches in your house : ");//printout a sentence "roaches in your house : "
		startPopulation = keyboard.nextInt();//receive value from keyboard and value mean beginning roches's population
		System.out.println("Starting with a roach population of "+startPopulation);//printout a sentence "Starting with a roach population of "+startPopulation's value
		System.out.println("and a house wiht a volume of " +houseVolume+"cubic feet,");//printout a sentence "and a house with a volume of " +houseVolume's value +"cubic feet,"
		double population = startPopulation;//declare population and define population
		double totalBugVolume = population*ONE_BUG_VOLUME;//declare totalBugVolume and define totalBugVolume
		
		while(totalBugVolume<houseVolume) {//loop for calculating about bug and bug's volume
			newBugs = population * GROWTH_RATE;//define newBugs
			newBugVolume = newBugs * ONE_BUG_VOLUME;//define newBugVolume
			population = population + newBugs;//define population that increase
			totalBugVolume = totalBugVolume + newBugVolume;//define totalBugVolume that increase
			countWeeks++;//+1 week(count week)
		}
		System.out.println("after "+countWeeks+"weeks,");//printout a sentence "after "+countWeeks value+"weeks,"
		System.out.println("the house will be filled with "+(int)population+" roaches.");//printout a sentence "the house will be filled with "+(int)population value(change type of population to int)+" roaches."
		System.out.println("They will fill a volume of " +(int)totalBugVolume+" cubic feet.");//printout a sentence "They will fill a volume of " +(int)totalBugVolume value(change type of totalBugVolume to int)+" cubic feet." 
		System.out.println("Better call Debugging Expers Inc");//printout a sentence "Better call Debugging Expers Inc"
	}

}
