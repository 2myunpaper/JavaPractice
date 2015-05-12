/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 *
 * @author		: 2304 김동현
 * @version		: 1.0
 */
public class Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer;
		
		System.out.println("가장 좋아하는 가수는?");
		answer = scanner.nextLine();
		if("빅뱅".equals(answer)) {
			System.out.println("정답입니다!! ^^");
			System.out.println();
		} else {
			System.out.println("틀렸습니다!! ㅠㅠ");
			System.out.println();
		}
		
		System.out.println("가장 좋아하는 드라마는?");
		answer = scanner.nextLine();
		if("닥터후".equals(answer)) {
			System.out.println("정답입니다!! ^^");
			System.out.println();
		} else {
			System.out.println("틀렸습니다!! ㅠㅠ");
			System.out.println();
		}
		
		System.out.println("가장 좋아하는 과목은?");
		answer = scanner.nextLine();
		if("자바".equals(answer)) {
			System.out.println("정답입니다!! ^^");
			System.out.println();
		} else {
			System.out.println("틀렸습니다!! ㅠㅠ");
			System.out.println();
		}
	}
}
