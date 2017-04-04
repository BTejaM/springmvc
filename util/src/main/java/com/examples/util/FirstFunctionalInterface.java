package com.examples.util;

@FunctionalInterface
public interface FirstFunctionalInterface extends SampleFunctionalInterface {

	/*public static void main(String[] args) {
		FirstFunctionalInterface inf = new FirstFunctionalInterface();
		System.out.println(inf.getName());
	}*/
	default String getName() {
		return "FirstFunctionalInterface";
	}

}
