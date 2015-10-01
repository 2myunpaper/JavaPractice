/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 * 		|_ MelonChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 25.
 * </pre>
 *
 * @author		: 2304 김동현
 * @version		: 1.0
 */
public class MelonChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Music> list = new ArrayList<Music>();
		
		System.out.println("-- << 멜론 차트 >> --");
		list.add(new Music("바람이나 좀 쐐", "개리"));
		list.add(new Music("보통연애", "박경"));
		list.add(new Music("취향저격", "iKON"));
		printChart(list);
		
		System.out.println("-- << 2위 곡 추가 >> --");
		list.add(1,new Music("레옹", "이유갓지"));
		printChart(list);
		
		System.out.println("-- << 3위 곡 변경 >> --");
		list.set(2, new Music("맙소사", "황태지"));
		printChart(list);
		
		System.out.println("-- << 4위 곡 삭제 >> --");
		list.remove(3);
		printChart(list);
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		list.clear();
		printChart(list);
	}
	
	public static void printChart(List<Music> list) {
		int i = 0;
		for(Music m : list) {
			i++;
			System.out.println(i + ". " +m.toString());
		} 
		System.out.println();
	}

}
