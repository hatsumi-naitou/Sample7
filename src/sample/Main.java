package sample;

public class Main {
	
	public static void main(String[] args){
		System.out.println("hello");
		Parent takeda = new Parent("���c����");
		Parent wada = new Parent("�a�c����");
		
		Child gondo = new Child("��������");
		Main.showName(gondo);						//showName��Parent�^�ɑ΂��Ẵ��\�b�h�����A�p�����Ă���Child�N���X�Ɏg���Ă����v�B
		
		Main.showName(takeda);
		Main.showName(wada);
		
		/*
		System.out.println(gondo.getName());
		System.out.println(gondo.getName());		//getChildName �̂Ƃ�child�^�Ȃ̂ŁAJr.��������ɂ��BgetName�ł�����jr.�����B�p�����Ă邩��B
		System.out.println(takeda.getName());			//Parent�^�Ȃ̂ŁAgetChildName�͌ĂׂȂ��B�g���Ȃ��B
		System.out.println(wada.getName());					//�e�N���X�́A�q�N���X�łǂ�Ȓ�`������Ă��邩�m�������Ƃł͂Ȃ��B
		 */
		
		Parent.showType();								//�Ăяo�����̓N���X��.���\�b�h
		//Child.showType();								//�������O�Ȃ̂ŁA�^�Ɉˑ����Ă��郁�\�b�h���Ăяo���Ƃ��A�������O������Ƃǂ���Ă�ł��邩�킩��Ȃ����Ƃ�����B
														//
	}
	
	public static void showName(Human parent){			//showName�Ƃ������\�b�h���`�B�r���Œ�`�������̂́A��`�O�ł̒i�K�ł��g����B
		System.out.println(parent.getName());			//�Ӗ��́Aparent�^��getName���Ăяo���B Child�^�����͌Ăяo����B�p�����Ă��邩��B
		//parent.familyName();
		//Parent.showType();								//�Ăѕ������������Ԉ���Ă���B�C���X�^���X�Ƃ��ČĂяo���Ă͂����܂���B�N���X���\�b�h�B
		}
}
