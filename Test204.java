class Book{
	String name;
	int page;

	void disp(){
		System.out.println(name);
		System.out.println(page);
	}
}

class Test204{
	public static void main(String[] args){
		Book dt = new Book();
		dt.name = "デート・ア・ライブの最新刊は";
		dt.page = 15;
		dt.disp();
	}
}
