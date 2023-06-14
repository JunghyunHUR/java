package sec09.ch04;

public class Button {

	//static interface
	public static interface ClickListener {
		//추상 method
		void onClick();
	}
	
	//field
	private ClickListener clickListener;
	
	//method
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	//Button이 클릭 되었을 때 실행되는 method 선언
	public void click() {
		this.clickListener.onClick();
	}
	
}
