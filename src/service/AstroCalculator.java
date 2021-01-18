package service;

import java.time.LocalDate;
import java.time.Period;

import model.User;
// Type your code
public class AstroCalculator
{
	//returns zodiac sign of user
	public String findSign(User user)
	{
		String birthSign="";
		int dayOfBirth=0;
		int monthOfBirth=0;
		int yearOfBirth=0;
		
		
		
		try
		{
			//Finding day of birth
			dayOfBirth=findDayFromDate(user.getDateOfBirth());
			
			//Finding month of birth
			monthOfBirth=findMonthFromDate(user.getDateOfBirth());
			
			//Finding year of birth
			yearOfBirth=findYearFromDate(user.getDateOfBirth());
		}
		catch(Exception exception)
		{
			System.out.println("Please give appopriate date");
		}
		switch(monthOfBirth)
		{
		case 1:
			if(dayOfBirth<=20)
			{
				birthSign+="Capricorn";
				break;
			}
			else
			{
				birthSign+="Aquarius";
				break;
			}
		case 2:
			if(dayOfBirth<=18)
			{
				birthSign+="Aquarius";
				break;
			}
			else
			{
				birthSign+="Pisces";
				break;
			}
		case 3:
			if(dayOfBirth<=20)
			{
				birthSign+="Pisces";
				break;
			}
			else
			{
				birthSign+="Aries";
				break;
			}
		case 4:
			if(dayOfBirth<=20)
			{
				birthSign+="Aries";
				break;
			}
			else
			{
				birthSign+="Taurus";
				break;
			}
		case 5:
			if(dayOfBirth<=21)
			{
				birthSign+="Taurus";
				break;
			}
			else
			{
				birthSign+="Gemini";
				break;
			}
		case 6:
			if(dayOfBirth<=21)
			{
				birthSign+="Gemini";
				break;
			}
			else
			{
				birthSign+="Cancer";
				break;
			}
		case 7:
			if(dayOfBirth<=20)
			{
				birthSign+="Cancer";
				break;
			}
			else
			{
				birthSign+="Leo";
				break;
			}
		case 8:
			if(dayOfBirth<=23)
			{
				birthSign+="Leo";
				break;
			}
			else
			{
				birthSign+="Virgo";
				break;
			}
		case 9:
			if(dayOfBirth<=22)
			{
				birthSign+="Virgo";
				break;
			}
			else
			{
				birthSign+="Libra";
				break;
			}
		case 10:
			if(dayOfBirth<=23)
			{
				birthSign+="Libra";
				break;
			}
			else
			{
				birthSign+="Scorpio";
				break;
			}
		case 11:
			if(dayOfBirth<=22)
			{
				birthSign+="Scorpio";
				break;
			}
			else
			{
				birthSign+="Sagittarius";
				break;
			}
		case 12:
			if(dayOfBirth<=21)
			{
				birthSign+="Sagittarius";
				break;
			}
			else
			{
				birthSign+="Capricorn";
				break;
			}
		}
		
		return birthSign;
	}
	
	//Calculates age of user
		private int findAge(User user) {
			String dateOfBirth=user.getDateOfBirth();
			LocalDate currentDate = LocalDate.of(findYearFromDate(dateOfBirth), findMonthFromDate(dateOfBirth), findDayFromDate(dateOfBirth)); //Creates current date
			  LocalDate now = LocalDate.now(); //gets localDate
			  Period diff = Period.between(currentDate, now); //difference between the dates is calculated
			  int age=diff.getYears();
			
			return age;
		}
	
	//Returns day from date
	private int findDayFromDate(String dateOfBirth) {
		int day=Integer.parseInt(dateOfBirth.split("[-]")[0]);
		return day ;
	}
	
	//Returns month from date
	private int findMonthFromDate(String dateOfBirth) {
		int month=Integer.parseInt(dateOfBirth.split("[-]")[1]);
		return month;
	}
	
	//Returns year from date
	private int findYearFromDate(String dateOfBirth) {
		int year=Integer.parseInt(dateOfBirth.split("[-]")[2]);
		return year ;
	}
	
	
	//Prints sign of the user on console
	public void printAstroSign(User user) {
		System.out.println("Sign :" + findSign(user));
		System.out.println("Age :"+findAge(user));
		
	}
	
	
	
}