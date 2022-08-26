package com.javachamp.memoryleak;

import java.util.ArrayList;
import java.util.List;

public class OOMExample {

	public static void main(String[] args) {
		
		List<Brick> list = new ArrayList<>();
		
		while (true) {
			list.add(new Brick());
		}
	}

}
