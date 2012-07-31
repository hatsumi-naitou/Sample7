package sample;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		Integer devNum = Integer.getInteger(args[1]);
		Device device = null;
		switch(Integer.getInteger(args[0])){ //���͂����l���������Ă���
		
		case 1:
			device.play();
			break;
		case 2:
			device.stop();
			break;			
		case 3:
			device.fastForward();
			break;
		case 4:
			device.rewind();
		break;
		}
	}
	
	public static Device getDevice(Integer num){
		Device dev = null;
		switch(num){
		case 0:     //���̂Ƃ���CD
			dev = new CD();
			break;
		case 1:     //���̂Ƃ��ɃJ�Z�b�g
			dev = new Record();
			break;
		case 2:     //���̂Ƃ��Ƀu���[���C
			dev = new BlueRay();
			break;
		case 3:
			dev = new Casette();
			break;
		}
		return dev;
	}
	
}
