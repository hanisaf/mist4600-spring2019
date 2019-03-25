
public class Main2 {

	public static void main(String[] args) {
		Client client1 = new Client("Mardom");
		Client client2 = new Client("Singh", client1);
		Client client3 = new Client("Lamis", client2);
		
		System.out.println(client1);
		System.out.println(client2);
		System.out.println(client3);
		
//		client1.transact(-100);
//		client2.transact(-50);
//		System.out.println(client1);
//		System.out.println(client2);
//		System.out.println(client3);
		
//		client3.transact(-10.5);
//		System.out.println(client1);
//		System.out.println(client2);
//		System.out.println(client3);
		

	}

}
