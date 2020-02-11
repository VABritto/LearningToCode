package pessoal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

	static List<Client> clients = new ArrayList<Client>();
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		bankInterface();
		scanner.close();
		
	}
	
	static void bankInterface() {
		System.out.println("=========== BANK MAIN MENU =============");
		System.out.println("1 - Register new client\n2 - View client register\n3 - Edit Client register\n4 - Delete client register\n5 - Exit program");
		
		System.out.print("Choose option (1, 2, 3, 4, 5): ");
		int decision = scanner.nextInt();
		scanner.nextLine(); // Consumes new line leftover.
		
		switch (decision) {
		case 1: {
			newClient();
			break;
		}
		case 2: {
			getClient();
			break;
		}
		case 3: {
			editClient();
			break;
		}
		case 4: {
			deleteClient();
			break;
		}
		default: {
			System.out.println("Exiting Program...");
			break;
		}
		}		
	}
	
	static void	newClient() {
		
		System.out.print("Do you wish to register a new client (y/n)? ");
		String newClient = scanner.next();
		
		if (newClient.equalsIgnoreCase("y")) {
			System.out.print("Insert unique client ID Number: ");
			int id = scanner.nextInt();
			scanner.nextLine(); // Consumes new line leftover.
			System.out.print("Insert the client's name: ");
			String name = scanner.nextLine();
			System.out.print("Insert the client's initial account sum: ");
			double sum = scanner.nextDouble();
			System.out.printf("Client ID: %d\nClient Name: %s\nCurrent Sum: $%.2f\n\nIs this data correct (y/n)? ", id, name, sum);
			String verifyData = scanner.next();
			
			if (verifyData.equalsIgnoreCase("y")) {
				System.out.println("Adding information...");
				clients.add(new Client(id, name, sum));
				System.out.println("Information added successfully!\n");
			} else {
				System.out.println("The client data was not registered.");
			}
		}
		
		System.out.println("Returning to the Main Menu...");
		bankInterface();
		
		
	}
	
	static void getClient() {
		
		System.out.println("Do you wish to view a client? (y/n)");
		String viewClient = scanner.next();
		
		if(viewClient.equalsIgnoreCase("y")) {
			System.out.print("Insert client's ID Number: ");
			int chosenClient = scanner.nextInt();
			scanner.nextLine(); // Consumes new line leftover.
			
			for (int i = 0; i < clients.size(); i++) {
				Client client = clients.get(i);
				if (client.id == chosenClient) {
					System.out.printf("\nClient ID: %d\nClient Name: %s\nClient Bank Sum: $%.2f\n\n", client.id, client.name, client.sum);
				} else {
					System.out.println("There is no client with that ID...");
				}
			}
		}
		
		System.out.println("Returning to the Main Menu...");
		bankInterface();
		
		
	}
	
	static void editClient() {
		System.out.print("Do you wish to edit a client register (y/n)? ");
		String editClient = scanner.next();
		
		if(editClient.equalsIgnoreCase("y")) {
			System.out.print("Insert client's ID Number: ");
			int chosenClient = scanner.nextInt();
			scanner.nextLine(); // Consumes new line leftover.
			
			for (int i = 0; i < clients.size(); i++) {
				Client client = clients.get(i);
				if (client.id == chosenClient) {
					System.out.printf("\nClient ID: %d\nClient Name: %s\nClient Bank Sum: $%.2f\n\n", client.id, client.name, client.sum);
					System.out.println("1 - Change ID\n2 - Change Name\n3 - Change Bank Sum");
					System.out.print("Choose procedure (1, 2 or 3): ");
					int chooseEdit = scanner.nextInt();
					scanner.nextLine(); // Consumes new line leftover.
					
					switch (chooseEdit) {
					case 1: {
						System.out.print("\nChoose new ID: ");
						client.id = scanner.nextInt();
						scanner.nextLine(); // Consumes new line leftover.
						break;
					}
					case 2: {
						System.out.print("\nChoose new name: ");
						client.name = scanner.nextLine();
						break;
					}
					case 3: {
						System.out.print("\nChoose new sum: ");
						client.sum = scanner.nextDouble();
						break;
					}
					}
					System.out.println("New client register: ");
					System.out.printf("\nClient ID: %d\nClient Name: %s\nClient Bank Sum: $%.2f\n\n", client.id, client.name, client.sum);
				} else {
					System.out.println("There is no client with that ID...");
				}
			}
		}
		
		System.out.println("Returning to the Main Menu...");
		bankInterface();
	}
	
	static void deleteClient() {
		System.out.print("Do you wish to delete a client register (y/n)? ");
		String deleteClient = scanner.next();
		
		if(deleteClient.equalsIgnoreCase("y")) {
			System.out.print("Insert client's ID Number: ");
			int chosenClient = scanner.nextInt();
			scanner.nextLine(); // Consumes new line leftover.
			
			for (int i = 0; i < clients.size(); i++) {
				Client client = clients.get(i);
				if (client.id == chosenClient) {
					System.out.printf("\nClient ID: %d\nClient Name: %s\nClient Bank Sum: $%.2f\n\n", client.id, client.name, client.sum);
					System.out.print("Delete this client register (y/n)? ");
					String chooseDelete = scanner.next();
					if (chooseDelete.equalsIgnoreCase("y")) {
						clients.remove(client);
						System.out.println("Client register deleted!");
					}
				} else {
					System.out.println("There is no client with that ID...");
				}
			}
		}
		
		System.out.println("Returning to the Main Menu...");
		bankInterface();
	}
	
}
