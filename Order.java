public class Order{
	
	private Arraylist<Object> contents;

	public Order(){
		contents = new Arraylist<Object>();
	}

	public add(Object o){
		contents.add(o);
	}

	public remove(Object o){
		for(int i = 0; i < contents.length; i++){
			if(contents[i] == o)
				contents[i] == null;
		}
	}

	public displayOrder(){
		for(int i = 0; i < contents.length; i++)
			System.out.print(contents[i]);
	}
}