package com.org;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for(int i=1;i<=100;i++){
			myList.add(i);
		}
			Stream<Integer> mySequenceStream = myList.stream();
			
			Stream<Integer> highStream = mySequenceStream.filter(p -> p>90);
			
		//	highStream.forEach(highnum-> System.out.println(highnum));
			
			
			Stream<Integer> parallelstream = myList.parallelStream();
			
			Stream<Integer> parallelHighStream = parallelstream.filter(p -> p>90);
			parallelHighStream.forEach(highParallelnum -> System.out.println(highParallelnum));
			
			
		
	}

}
