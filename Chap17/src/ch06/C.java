package ch06;

import java.util.Objects;

public class C {
	int data;

	public C(int data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return data;
	}

	@Override
	public boolean equals(Object obj) {
		return data == ((C)obj).data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "C [data=" + data + "]";
	}
}
