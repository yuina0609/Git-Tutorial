class Test201{
	public static void main(String[] args){
		String sen1 = "今日の日付は";
		String sen2 = "2月21日ですよね";
		mymethod(sen1);
		mymethod(sen2);
	}
	
	static void mymethod(String get){
		System.out.println("#" + get + "?");
	}
}
