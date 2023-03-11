package com.mcqs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		CentralizeClass cc= new CentralizeClass();
		System.out.println("Register YourSelf ");
		System.out.println("Enter Your First Name");
		String fname = br.readLine().concat(" ");
		System.out.println("Enter Your Last Name");
		String lname = br.readLine();
		String email="";
		while(true) {
			System.out.println("Enter Your Email ID");
			 email = br.readLine();
			if(email.contains("@gmail.com")) {
				break;
			}
			else {
				System.out.println("Please enter valid Email ID");
			}			
		}
		System.out.println("Enter your mobile number");
		String mobile = br.readLine();
		System.out.println("Enter Your Age");
		int age = Integer.parseInt(br.readLine());
		int sum =0;
	
		System.out.println("--------------------Let's Start With Quiz \n Press Ok To Start -----------------------------");
		String confirm = br.readLine();
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		int count7=0;
		int count8=0;
		int count9=0;
		int count10=0;
		int cans=0;
		int inans=0;
		String ans1 ="";
		String ans2 ="";
		String ans3 ="";
		String ans4 ="";
		String ans5 ="";
		String ans6 ="";
		String ans7 ="";
		String ans8 ="";
		String ans9 ="";
		String ans10 ="";
		int att=0;
		while(true) {
			System.out.println("Press to see the Questions \n1 \n2 \n3 \n4 \n5 \n6 \n7 \n8 \n9 \n10 \n11.Review All Questions \n12.Show Result");
			int ch = Integer.parseInt(br.readLine());
			
			if(ch==1) {
				
				count1++;
				if(count1<2) {
					att++;
					System.out.println("What is  the full form of SDLC ? \na.Software Designer Lifecycle \nb.System Development Lifecycle \nc.Software Development Lifecycle \nd.System Designer Lifecycle");
					ans1 = br.readLine();
					if(ans1.equalsIgnoreCase("c")) {
						sum=sum+4;
						cans++;
					}
					else {
						sum--;
						inans++;
					}
				}else {
					System.out.println("What is  the full form of SDLC ? \na.Software Designer Lifecycle \nb.System Development Lifecycle \nc.Software Development Lifecycle \nd.System Designer Lifecycle");
					ans1 = br.readLine();
					if(ans1.equalsIgnoreCase("c")) {
						sum=sum+5;
						inans--;
						cans++;
					}
					else {
						sum=sum-5;
						inans++;
						cans--;
					}
				}
				
			}
			else if(ch==2) {
				
				count2++;
				if(count2<2) {
					att++;
					System.out.println("Which of the following contains both date and time ? \na.java.io.date \nb.java.sql.date \nc.java.util.date \nd.java.util.datetime ");
					ans2 = br.readLine();
					if(ans2.equalsIgnoreCase("d")) {
						sum=sum+4;
						cans++;
					}
					else {
						sum--;
						inans++;
					}
				}else {
					System.out.println("Which of the following contains both date and time ? \na.java.io.date \nb.java.sql.date \nc.java.util.date \nd.java.util.datetime ");
					ans2 = br.readLine();
					if(ans2.equalsIgnoreCase("d")) {
						sum=sum+5;
						inans--;
						cans++;
					}
					else {
						sum=sum-5;
						inans++;
						cans--;
					}
				}
			
			}
			else if(ch==3) {
				
				count3++;
				if(count3<2) {
					att++;
					System.out.println("Which of the following contains date information? \na.java.sql.timestamp \nb.java.sql.time \nc.java.io.time \nd.java.io.timestamp ");
					ans3 = br.readLine();
					if(ans3.equalsIgnoreCase("a")) {
						sum=sum+4;
						cans++;
					}
					else {
						sum--;
						inans++;
					}
				}else {
					System.out.println("Which of the following contains date information? \na.java.sql.timestamp \nb.java.sql.time \nc.java.io.time \nd.java.io.timestamp ");
					ans3 = br.readLine();
					if(ans3.equalsIgnoreCase("a")) {
						sum=sum+5;
						inans--;
						cans++;
					}
					else {
						sum=sum-5;
						inans++;
						cans--;
					}
				}
			
			}
			else if(ch==4) {
				
				count4++;
				if(count4<2) {
					att++;
					System.out.println("Which of the following is not the java features? \na.Dynamic \nb.Architecture Neutral \nc.Use of Pointer \nd.Object-Oriented");
					ans4 = br.readLine();
					if(ans4.equalsIgnoreCase("c")) {
						sum=sum+4;
						cans++;
					}
					else {
						sum--;
						inans++;
					}
				}else {
					System.out.println("Which of the following is not the java features? \na.Dynamic \nb.Architecture Neutral \nc.Use of Pointer \nd.Object-Oriented");
					ans4 = br.readLine();
					if(ans4.equalsIgnoreCase("c")) {
						sum=sum+5;
						inans--;
						cans++;
					}
					else {
						sum=sum-5;
						inans++;
						cans--;
					}
				}
			
			}
			else if(ch==5) {
				
				count5++;
				if(count5<2) {
					att++;
					System.out.println("What is the extension of java code files? \na..js \nb..txt \nc..class \nd..java ");
					ans5 = br.readLine();
					if(ans5.equalsIgnoreCase("d")) {
						sum=sum+4;
						cans++;
					}
					else {
						sum--;
						inans++;
					}
				}else {
					System.out.println("What is the extension of java code files? \na..js \nb..txt \nc..class \nd..java ");
					 ans5 = br.readLine();
					if(ans5.equalsIgnoreCase("d")) {
						sum=sum+5;
						inans--;
						cans++;
					}
					else {
						sum=sum-5;
						inans++;
						cans--;
					}
				}
			}
			else if(ch==6) {
				
				count6++;
				if(count6<2) {
					att++;
					System.out.println("_____is used to find and fix bugs int the java program \na.JVM \nb.JRE \nc.JDK \nd.JDB");
					ans6 = br.readLine();
					if(ans6.equalsIgnoreCase("d")) {
						sum=sum+4;
						cans++;
					}
					else {
						sum--;
						inans++;
					}
				}else {
					System.out.println("_____is used to find and fix bugs int the java program \na.JVM \nb.JRE \nc.JDK \nd.JDB");
					ans6 = br.readLine();
					if(ans6.equalsIgnoreCase("d")) {
						sum=sum+5;
						inans--;
						cans++;
					}
					else {
						sum=sum-5;
						inans++;
						cans--;
					}
				}
			}
			else if(ch==7) {
				
				count7++;
				if(count7<2) {
					att++;
					System.out.println(" In which process, a local variable has the same name as one of the instance variables?  \na.Serialization \nb.Variable shadowing \nc.Abstraction \nd.Multi-threading");
					ans7 = br.readLine();
					if(ans7.equalsIgnoreCase("b")) {
						sum=sum+4;
						cans++;
					}
					else {
						sum--;
						inans++;
					}
				}else {
					System.out.println("In which process, a local variable has the same name as one of the instance variables?  \na.Serialization \nb.Variable shadowing \nc.Abstraction \nd.Multi-threading");
					ans7 = br.readLine();
					if(ans7.equalsIgnoreCase("b")) {
						sum=sum+5;
						inans--;
						cans++;
					}
					else {
						sum=sum-5;
						inans++;
						cans--;
					}
				}
			}
			else if(ch==8) {
				
				count8++;
				if(count8<2) {
					att++;
					System.out.println("What is the return type of the hashCode() method in the Object Class  \na.Object \nb.int \nc.long \nd.void");
					ans8 = br.readLine();
					if(ans8.equalsIgnoreCase("b")) {
						sum=sum+4;
						cans++;
					}
					else {
						sum--;
						inans++;
					}
				}else {
					System.out.println("What is the return type of the hashCode() method in the Object Class  \na.Object \nb.int \nc.long \nd.void");
					ans8 = br.readLine();
					if(ans8.equalsIgnoreCase("b")) {
						sum=sum+5;
						inans--;
						cans++;
					}
					else {
						sum=sum-5;
						inans++;
						cans--;
					}
				}
			
			}
			else if(ch==9) {
				
				count9++;
				if(count9<2) {
					att++;
					System.out.println("What does the exception float a = 35/0 return? \na.0 \nb.Not a Number \nc.Infinity \nd.Run Time Exception");
					ans9 = br.readLine();
					if(ans9.equalsIgnoreCase("c")) {
						sum=sum+4;
						cans++;
					}
					else {
						sum--;
						inans++;
					}
				}else {
					System.out.println("What does the exception float a = 35/0 return? \na.0 \nb.Not a Number \nc.Infinity \nd.Run Time Exception");
					ans9 = br.readLine();
					if(ans9.equalsIgnoreCase("c")) {
						sum=sum+5;
						inans--;
						cans++;
					}
					else {
						sum=sum-5;
						inans++;
						cans--;
					}
				}
			}
			else if(ch==10) {
			
				count10++;
				if(count10<2) {
					att++;
					System.out.println("Which of the following is reserved keyword in java? \na.object \nb.strictfp \nc.main \nd.system");
					ans10 = br.readLine();
					if(ans10.equalsIgnoreCase("c")) {
						sum=sum+4;
						cans++;
					}
					else {
						sum--;
						inans++;
					}
				}else {
					System.out.println("Which of the following is reserved keyword in java? \na.object \nb.strictfp \nc.main \nd.system");
					ans10 = br.readLine();
					if(ans10.equalsIgnoreCase("c")) {
						sum=sum+5;
						inans--;
						cans++;
					}
					else {
						sum=sum-5;
						inans++;
						cans--;
					}
				}
			}
			else if(ch==11) {
				System.out.println("What is  the full form of SDLC ?                                                         "+ans1);
				System.out.println("Which of the following contains both date and time ?           					         "+ans2);
				System.out.println("Which of the following contains date information?               					      "+ans3);
				System.out.println("Which of the following is not the java features?                					      "+ans4);
				System.out.println("What is the extension of java code files?               			             	      "+ans5);
				System.out.println("_____is used to find and fix bugs int the java program                                    "+ans6);
				System.out.println("In which process, a local variable has the same name as one of the instance variables?    "+ans7);
				System.out.println("What is the return type of the hashCode() method in the Object Class  			       	  "+ans8);
				System.out.println("What does the exception float a = 35/0 return?                        					  "+ans9);
				System.out.println("Which of the following is reserved keyword in java?                   				      "+ans10);
			}
			else if(ch==12) {
				System.out.println("Total Score is "+sum);
				CalculateMark bc = cc.getClass("marks");
				bc.marks();
				double res = bc.calculate(sum);
				Date date = new Date();
				SimpleDateFormat fm = new SimpleDateFormat("dd-mm-yy");
				String dt = fm.format(date);
				System.out.println("-----------------------------------------------");
				System.out.println("----------------SCORE CARD---------------------");
				System.out.println("|     Name     :  "+fname.concat(lname));
				System.out.println("|     Email    :  "+email);
				System.out.println("|     Mobile   :  "+mobile);
				System.out.println("|     Age      :  "+age);
				System.out.println("| Total Number of Question 10");
				System.out.println("| Number of question attempted   "+att);
				System.out.println("| Correct Answer                 "+cans);
				System.out.println("| InCorrect Answer               "+inans);
				System.out.println("| Total Score                    "+sum);
				System.out.println("| Total Percentage               "+res);
				System.out.println("-----------------------------------------------");
				if(res>90) {
					System.out.println("-----------------------------------------------");
					System.out.println("			Excellent Grade A+  "+res);
					System.out.println("-----------------------------------------------");
				}
				else if((res<90)&&(res>75)) {
					System.out.println("-----------------------------------------------");
					System.out.println("			Fair Grade A  "+res);
					System.out.println("-----------------------------------------------");
				}
				else if((res<75)&&(res>50)){
					System.out.println("-----------------------------------------------");
					System.out.println("			Good Grade B  "+res);
					System.out.println("-----------------------------------------------");
				}
				else {
					System.out.println("-----------------------------------------------");
					System.out.println("           	Fail Grade C  "+res);
					System.out.println("-----------------------------------------------");
				}
				System.out.println("Review All Answer ");
				System.out.println("1.Review All Answer \n2.Exit");
				int vv = Integer.parseInt(br.readLine());
				if(vv==1) {
					System.out.println("-----------------------------------------------");
					System.out.println("What is  the full form of SDLC ?                                                         "+ans1);
					System.out.println("Which of the following contains both date and time ?           					         "+ans2);
					System.out.println("Which of the following contains date information?               					      "+ans3);
					System.out.println("Which of the following is not the java features?                					      "+ans4);
					System.out.println("What is the extension of java code files?                   			        	      "+ans5);
					System.out.println("_____is used to find and fix bugs int the java program                                    "+ans6);
					System.out.println("In which process, a local variable has the same name as one of the instance variables?    "+ans7);
					System.out.println("What is the return type of the hashCode() method in the Object Class  			       	  "+ans8);
					System.out.println("What does the exception float a = 35/0 return?                        					  "+ans9);
					System.out.println("Which of the following is reserved keyword in java?                   				      "+ans10);
					System.out.println("-----------------------------------------------");
					break;
				}
				else if(vv==2) {
					break;
				}
			}
			else {
				System.out.println("Press Valid Key");
			}
		}
	}
}
