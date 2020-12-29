
public class FavoriteMedia<M>{//generic class 
	M name;//M is where whatever type you want would go
	public FavoriteMedia(M name) {//constructor
		this.name = name; 
	}
	public void display() {//display function
		System.out.println(name);
	}

}
