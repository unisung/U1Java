package ch06;

public class Button {
	OnClickListener ocl;
	void setOnClickListener(OnClickListener ocl) {
		this.ocl = ocl;
	}
 interface OnClickListener{
	 void onClick();
 }
 
 void click() {
	 ocl.onClick();
 }
}
