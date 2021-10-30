package javaCrossing;

import java.util.*;

public class JavaCrossingMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<CharacterDTO> characterList = new ArrayList<>();
		List<FruitDTO> fruitList = new ArrayList<>();
		List<PriceDTO> priceList = new ArrayList<>();
		JavaCrossingInterface call = new JavaCrossingService();
		
		boolean run = true;
		int select;
		
		System.out.println("\n"+"╭╼|══════════════════════|╾╮"+"\n");
		System.out.println("        모여봐요"+"\n");
		System.out.println("             자바의숲"+"\n");
		System.out.println("       -Java Crossing-      ");
		System.out.println("╰╼|══════════════════════|╾╯"+"\n");
		System.out.println("     -"+"아무 키나 입력해주세요-");
		while(run) {
			scan.nextLine();
			System.out.println("====================================================================================");
			System.out.println("| 1.캐릭터 생성 | 2.나무 심기 | 3.정보 보기 | 4.과일 채집 | 5.팔기 | 6.잠자기 | 7.빚갚기 | 8.종료 |");
			System.out.println("====================================================================================");
			System.out.print("선택> ");
			try {
				select = scan.nextInt();
				if(select==1) {
					characterList=call.newJoin(characterList, fruitList, priceList);
				} else if(select==2) {
					fruitList=call.newTree(fruitList, characterList);
				} else if(select==3) {
					call.informationView(fruitList, characterList, priceList);
				} else if(select==4) {
					fruitList=call.getFruit(fruitList, characterList, priceList);
				} else if(select==5) {
					characterList=call.sellFruit(characterList, priceList);
				} else if(select==6) {
					characterList=call.sleep(characterList, fruitList, priceList);
				} else if(select==7) {
					characterList = call.rePay(characterList, priceList);
					run = characterList.get(0).isRun();
				} else if(select==8) {
					System.out.println("\n"+"╭╼|═══|╾╮");
					System.out.println("   종료");
					System.out.println("╰╼|═══|╾╯"+"\n");

					run = false;
				} else {
					System.out.println("\n"+"╭╼|════════════|╾╮");
					System.out.println("   다시 입력하세요.");
					System.out.println("╰╼|════════════|╾╯"+"\n");
				}
			} catch(IndexOutOfBoundsException e) {
				System.out.println("\n"+"╭╼|════════════════════|╾╮");
				System.out.println("   캐릭터를 먼저 생성해주세요!");
				System.out.println("╰╼|════════════════════|╾╯"+"\n");
			} catch(Exception e) {
				System.out.println("\n"+"╭╼|═══════════════════|╾╮");
				System.out.println("   올바른 값을 입력해주세요.");
				System.out.println("╰╼|═══════════════════|╾╯"+"\n");
			}
		}

	}

}
