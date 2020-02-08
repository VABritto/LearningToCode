package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data();
		Data data2 = new Data(13, 4, 1992);

		System.out.printf("Data: %s. \n", data1.dataString());
		System.out.printf("Data: %s. \n", data2.dataString());
		
	}
}
