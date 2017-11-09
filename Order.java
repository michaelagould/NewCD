public class Order{
	
	private Arraylist<MenuItems> contents;

	public Order(){
		contents = new Arraylist<MenuItems>();
	}

	public add(MenuItems o){
		contents.add(o);
	}

	public remove(MenuItems o){
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