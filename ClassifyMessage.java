/*
 * ClassifyMessage.java
 * Author: Emily Ockerman
 * Submission Date: September 12, 2018
 *
 * Purpose: This program takes an input message and puts it into categories and makes
 * it easier for the reader to discern information from the message.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.
 */

import java.util.Scanner;

public class ClassifyMessage {
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//prompting user input
		System.out.println("Please enter a formatted message:");

		//category
		MessageCategory category;
		String catString = input.next().trim();
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) 
		{
			category = MessageCategory.ALERT;
			System.out.println("Category:\t" + category);
		} 
		else if (catString.equalsIgnoreCase("need")) 
		{
			category = MessageCategory.NEED;
			System.out.println("Category:\t" + category);
		} 
		else if (catString.equalsIgnoreCase("offer")) 
		{
			category = MessageCategory.OFFER;
			System.out.println("Category:\t" + category);
		} 
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
		{
			category = MessageCategory.INFO;
			System.out.println("Category:\t" + category);
		} 
		else 
		{
			category = MessageCategory.UNKNOWN;
			System.out.println("Category:\t" + category);
		}

		//raw category
		System.out.println("Raw Cat:\t" + catString);

		//latitude declaration and initialization
		double latitude = input.nextDouble();

		//longitude declaration and initialization
		double longitude = input.nextDouble();

		//message
		String payLoad = input.nextLine().trim();
		System.out.println("Message:\t" + payLoad);

		//latitude output
		System.out.println("Latitude:\t" + latitude);

		//longitude output
		System.out.println("Longitude:\t" + longitude);

		//in range declaration and output
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		boolean isInRange = (latitude >= south && latitude <= north && longitude >= west && longitude <= east);
		if (isInRange) 
		{
			System.out.println("In Range:\ttrue");
		}
		else
		{
			System.out.println("In Range:\tfalse");
		}
	}}







