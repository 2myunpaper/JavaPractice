/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 * 		|_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 *
 * @author		: 2304 김동현
 * @version		: 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone i = new IPhone("iPhone 6", "애플", 700000);
		SmartPhone g = new Galaxy("갤럭시 S6", "삼성", 6500000);
		
		System.out.println(i);
		i.turnOn();
		i.pay();
		i.useSpecialFunction();
		i.turnOff();
		
		System.out.println();
		
		System.out.println(g);
		g.turnOn();
		g.pay();
		g.useSpecialFunction();
		g.turnOff();
		
	}
}
