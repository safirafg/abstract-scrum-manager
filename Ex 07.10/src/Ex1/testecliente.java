package Ex1;

public class testecliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cliente[] lista = new cliente [4];
		
		lista [0] = new cliente ("Maria", 150 );
		lista [1] = new cliente ("Carolina", 20);
		lista [2] = new cliente ("Maria Carolina", 1500);
		lista [3] = new cliente ("Carolina Maria", 70);
		
		for (cliente roda: lista) {
			roda.imprimir();
		}
		System.out.println("\n***********************************************************");
		
		for(cliente roda:lista) {
			roda.ganhaBonus(- 5);
			roda.imprimir();
		}
	}

}
