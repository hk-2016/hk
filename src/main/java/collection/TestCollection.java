package main.java.collection;

import java.util.ArrayList;

public class TestCollection {

	public static void main(String[] args) {
		HkArrayList list =new HkArrayList();
		ArrayList ll = new ArrayList<>();
		ll.add(333);Object o;
		System.out.println(ll);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2, "2位置是我先添加进来的");
		list.add("sdjkhfkjsak");
		list.add("sdjkhfkjsak1111");
		list.add("sdjkhfkjsak2222");
		list.add("sdjkhfkjsak3333");
		System.out.println(list.size());
		System.out.println(list);
	}

}
