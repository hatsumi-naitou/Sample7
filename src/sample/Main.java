package sample;

public class Main {
	
	public static void main(String[] args){
		System.out.println("hello");
		Parent takeda = new Parent("武田さん");
		Parent wada = new Parent("和田さん");
		
		Child gondo = new Child("権藤さん");
		Main.showName(gondo);						//showNameはParent型に対してのメソッドだが、継承しているChildクラスに使っても大丈夫。
		
		Main.showName(takeda);
		Main.showName(wada);
		
		/*
		System.out.println(gondo.getName());
		System.out.println(gondo.getName());		//getChildName のときchild型なので、Jr.がうしろにつく。getNameでも後ろにjr.がつく。継承してるから。
		System.out.println(takeda.getName());			//Parent型なので、getChildNameは呼べない。使えない。
		System.out.println(wada.getName());					//親クラスは、子クラスでどんな定義がされているか知ったことではない。
		 */
		
		Parent.showType();								//呼び出し方はクラス名.メソッド
		//Child.showType();								//同じ名前なので、型に依存しているメソッドを呼び出すとき、同じ名前があるとどれを呼んでいるかわからないことがある。
														//
	}
	
	public static void showName(Human parent){			//showNameというメソッドを定義。途中で定義したものは、定義前での段階でも使える。
		System.out.println(parent.getName());			//意味は、parent型のgetNameを呼び出す。 Child型も実は呼び出せる。継承しているから。
		//parent.familyName();
		//Parent.showType();								//呼び方がそもそも間違っている。インスタンスとして呼び出してはいけません。クラスメソッド。
		}
}
