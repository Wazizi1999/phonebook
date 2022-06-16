package phonebookproject;

import java.util.Scanner;

public class phonebookMain {

	public static void main(String[] args) {
		Person p1 = new Person(3143271584L, "Wahidullah", "Azizi", new Address("Mo", "Anchor dr", "St.Louis", 8948,"63123"));
		// p1.addAddress(8948, "Anchor dr", "St.Louis", "Mo","63123");
		Directory d1 = new Directory();
		d1.addperson(p1);
		
		// menu(
		//loop
		//
		Scanner input = new Scanner(System.in);
		System.out.println("Enter something");
		switch(input.nextInt()) {
		case 1:
			System.out.println("Add person here");
			break;
		case 2:
			System.out.println("please enter the phonenumber of the person you want to delete");
			long case2 = input.nextLong();
			// d1.printDirectory();
			break;
			case 3:
				System.out.println("Enter the first name of the person you are searhing for");
				String case3 = input.next();
			//	d1.printpersonArray(d1.getByFirstName(case3));
				break;
			case 4:
				System.out.println("Enter the full Name of the person you are searhing fpr");
				String case4 = input.next();
			//	d1.printpersonArray(d1.getByLastName(case4));
				break;
			case 5:
				System.out.println("Enter the last Name you searhing for");
				String case5 = input.nextLine();
				// d1.printpersonArray(d1.getByFullName(case5));
				break;
				case 6:
					System.out.println("Enter the phonenumber of the person you are searhing for");
					long tempNumber = input.nextLong();
					// d1.searhByphone(tempNumber).printperson();

					
					
					
				
					
				}
		}
		
		
		

	}



	
