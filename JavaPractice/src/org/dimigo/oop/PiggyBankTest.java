/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ PiggyBankTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 16.
 * </pre>
 *
 * @author		: 2304 김동현
 * @version		: 1.0
 */
public class PiggyBankTest {
	public static void main(String[] args) {
		
		FamilyMember[] fam = {
				new FamilyMember("아빠"), new FamilyMember("엄마"), new FamilyMember("나"),
				new FamilyMember("남동생")
		};
		
		FamilyMember.printMemberCnt();
		
		System.out.println();
		PiggyBank.putMoney(fam[0], 10000);
		PiggyBank.putMoney(fam[1], 8000);
		PiggyBank.putMoney(fam[2], 6000);
		PiggyBank.putMoney(fam[3], 4000);
		
		System.out.println();
		PiggyBank.printBalance();
		
		System.out.println();
		PiggyBank.putMoney(fam[2], 2000);
		
		System.out.println();
		PiggyBank.printBalance();
	}
}
