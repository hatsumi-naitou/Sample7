package sample;

public class Parent implements Human{
	
	//１回作ったインスタンスで武田さんをずっと保持させるには？
	
	public String name_;		//name_はインスタンス変数
	
	public Parent(String name){		//インスタンスに保持させるとすると？name_に引数nameを呼び出す
		this.name_ = name;
	}
	
	public String getName(){
		return this.name_;
	}
	
	public static void showType(){
		System.out.println("Parent");
	}
}

