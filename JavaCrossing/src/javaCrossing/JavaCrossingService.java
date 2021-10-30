package javaCrossing;

import java.util.*;

public class JavaCrossingService implements JavaCrossingInterface{

	// 캐릭터 생성
	// 매개변수 : List<CharacterDTO>, List<FruitDTO>
	// 리턴 : characterList
	@Override
	public List<CharacterDTO> newJoin(List<CharacterDTO> characterList, List<FruitDTO> fruitList, List<PriceDTO> priceList) {
		if (characterList.size() < 1) {
			Scanner scan = new Scanner(System.in);
			System.out.print("이름 입력 : ");
			String name = scan.next();
			CharacterDTO join = new CharacterDTO(name);
			characterList.add(join);
			System.out.println("\n" + "╭╼|══════════════════════|╾╮");
			System.out.println("   " + characterList.get(0).getName() + "님의 입주를 환영합니다.");
			System.out.println("╰╼|══════════════════════|╾╯" + "\n");
			FruitDTO fruit = new FruitDTO(1, true, 5);
			fruitList.add(fruit);
			CharacterDTO cha = new CharacterDTO();
			cha = characterList.get(0);
			cha.setPay(415);
			cha.setRun(true);
			PriceDTO price = new PriceDTO();
			price.setDay(0);
			price.setPrice((int) (Math.random() * 100) + 1);
			priceList.add(price);
		} else {
			System.out.println("\n" + "╭╼|══════════════════════|╾╮");
			System.out.println(" 캐릭터를 더이상 생성할 수 없습니다.");
			System.out.println("╰╼|══════════════════════|╾╯" + "\n");

		}
		return characterList;
	}

	// 나무 심기
	// 매개변수 : List<FruitDTO>, List<CharacterDTO>
	// 리턴 : fruitList
	@Override
	public List<FruitDTO> newTree(List<FruitDTO> fruitList, List<CharacterDTO> characterList) {
		if (characterList.get(0).getInventory() > 0 && fruitList.size() < 3) {
			characterList.get(0).setInventory(characterList.get(0).getInventory() - 1);
			FruitDTO fruit = new FruitDTO();
			fruit.setTree(fruitList.size() + 1);
			fruit.setFruit(false);
			fruit.setTreeDay(0);
			fruitList.add(fruit);
			System.out.println("\n" + "╭╼|═════════════|╾╮");
			System.out.println("   나무를 심었습니다.");
			System.out.println("╰╼|═════════════|╾╯" + "\n");
			System.out.println("\n" + "╭╼|════════════════════|╾╮");
			System.out.println("   현재 과일나무 갯수 : " + fruitList.size() + "그루");
			System.out.println("╰╼|════════════════════|╾╯" + "\n");
		} else if (fruitList.size() == 3) {
			System.out.println("\n" + "╭╼|══════════════════|╾╮");
			System.out.println("   더이상 심을 수 없습니다.");
			System.out.println("╰╼|══════════════════|╾╯" + "\n");
		} else if (characterList.get(0).getInventory() == 0) {
			System.out.println("\n" + "╭╼|═════════════|╾╮");
			System.out.println("   과일이 부족합니다.");
			System.out.println("╰╼|═════════════|╾╯" + "\n");
		}
		return fruitList;
	}

	// 정보 확인
	// 매개변수 : List<FruitDTO>, List<CharacterDTO>
	// 리턴 : void
	@Override
	public void informationView(List<FruitDTO> fruitList, List<CharacterDTO> characterList, List<PriceDTO> priceList) {
		if (characterList.size() > 0) {
			System.out.println("\n" + "╭╼|════════════════════════════════════════════════════════════════════════|╾╮");
			System.out.println("   캐릭터 정보");
			System.out.println("   " + characterList.get(0) + "\n");
			System.out.println("   나무 정보");
			for (int i = 0; i < fruitList.size(); i++) {
				System.out.println("   " + fruitList.get(i));
			}
			System.out.println("\n" + "   과일 가격");
			System.out.println("   " + priceList.get(0));
			System.out.println("╰╼|════════════════════════════════════════════════════════════════════════|╾╯" + "\n");
		} else {
			System.out.println("\n"+"╭╼|════════════════════|╾╮");
			System.out.println("   캐릭터를 먼저 생성해주세요!");
			System.out.println("╰╼|════════════════════|╾╯"+"\n");
		}
	}

	// 과일 채집
	// 매개변수 : List<FruitDTO>, List<CharacterDTO>
	// 리턴 : fruitList
	@Override
	public List<FruitDTO> getFruit(List<FruitDTO> fruitList, List<CharacterDTO> characterList, List<PriceDTO> priceList) {
		if(characterList.size()>0) {
			Scanner scan = new Scanner(System.in);
			treePrint(fruitList);
			System.out.print("\n" + "채집할 나무번호 선택> ");
			int select = scan.nextInt();
			if (0 < select && select <= fruitList.size()) {
				if (fruitList.get(select - 1).isFruit()) {
					System.out.println("\n" + "╭╼|═══════|╾╮");
					System.out.println("   채집 완료");
					System.out.println("╰╼|═══════|╾╯" + "\n");
					fruitList.get(select - 1).setFruit(false);
					characterList.get(0).setInventory(characterList.get(0).getInventory() + 1);
					priceList.get(0).setFruitTotal(priceList.get(0).getFruitTotal() + 1);
				} else {
					System.out.println("\n" + "╭╼|═══════════|╾╮");
					System.out.println("   과일이 없습니다");
					System.out.println("╰╼|═══════════|╾╯" + "\n");
				}
			} else {
				System.out.println("\n" + "╭╼|══════════════════|╾╮");
				System.out.println("   있는 나무를 선택해주세요.");
				System.out.println("╰╼|══════════════════|╾╯" + "\n");
			}
		} else {
			System.out.println("\n"+"╭╼|════════════════════|╾╮");
			System.out.println("   캐릭터를 먼저 생성해주세요!");
			System.out.println("╰╼|════════════════════|╾╯"+"\n");
		}
		return fruitList;
	}

	// 과일 팔기
	// 매개변수 : List<CharacterDTO>
	// 리턴 : characterList
	@Override
	public List<CharacterDTO> sellFruit(List<CharacterDTO> characterList, List<PriceDTO> priceList) {
		Scanner scan = new Scanner(System.in);
		CharacterDTO cha = new CharacterDTO();
		cha = characterList.get(0);
		System.out.println("\n" + "╭╼|═══════════════════════|╾╮");
		System.out.println("   현재 과일 시세 : " + priceList.get(0).getPrice() + "원");
		System.out.println("   현재 갖고있는 과일 갯수 : " + characterList.get(0).getInventory()+"개");
		System.out.println("╰╼|═══════════════════════|╾╯" + "\n");
		System.out.print("팔 과일의 갯수 입력 : ");
		int count = scan.nextInt();
		int price = priceList.get(0).getPrice();
		if (cha.getInventory() > 0 && cha.getInventory() >= count && count != 0) {
			int sum = count * price;
			cha.setInventory(cha.getInventory() - count);
			cha.setMoney(cha.getMoney() + sum);
			priceList.get(0).setTotal(priceList.get(0).getTotal() + sum);
			System.out.println("\n" + "╭╼|═══════|╾╮");
			System.out.println("   판매 완료");
			System.out.println("╰╼|═══════|╾╯" + "\n");
			System.out.println("\n" + "╭╼|══════════════|╾╮");
			System.out.println("   "+sum+"원을 벌었습니다.");
			System.out.println("╰╼|══════════════|╾╯" + "\n");
			System.out.println("\n" + "╭╼|══════════════|╾╮");
			System.out.println("   현재 잔고 : "+cha.getMoney()+"원.");
			System.out.println("╰╼|══════════════|╾╯" + "\n");
		} else if(count == 0) {
			System.out.println("\n" + "╭╼|════════════|╾╮");
			System.out.println("   다시 입력하세요.");
			System.out.println("╰╼|════════════|╾╯" + "\n");
		} else {
			System.out.println("\n" + "╭╼|══════════════|╾╮");
			System.out.println("   과일이 부족합니다.");
			System.out.println("╰╼|══════════════|╾╯" + "\n");

		}
		return characterList;
	}

	// 잠자기
	// 매개변수 : List<CharacterDTO>, List<FruitDTO>
	// 리턴 : characterList
	@Override
	public List<CharacterDTO> sleep(List<CharacterDTO> characterList, List<FruitDTO> fruitList, List<PriceDTO> priceList) {
		CharacterDTO cha = new CharacterDTO();
		cha = characterList.get(0);
		cha.setCharacterDay(cha.getCharaterDay() + 1);
		PriceDTO price = new PriceDTO();
		price.setDay(price.getDay() + 1);
		price.setPrice((int) (Math.random() * 100) + 1);
		priceList.add(0, price);
		priceList.get(0).setDay(cha.getCharaterDay());
		priceList.get(0).setFruitTotal(priceList.get(1).getFruitTotal());
		priceList.get(0).setTotal(priceList.get(1).getTotal());
		priceList.remove(1);
		FruitDTO fru = new FruitDTO();
		for (int i = 0; i < fruitList.size(); i++) {
			fru = fruitList.get(i);
			fru.setTreeDay(fru.getTreeDay() + 1);
			if (fru.getTreeDay() > 0 && fru.getTreeDay() % 3 == 0) {
				fru.setFruit(true);
			}
		}
		System.out.println("\n" + "╭╼|════════════|╾╮");
		System.out.println("   잠자는중zzzzz" + "\n" + "\n" + "\n" + "\n" + "   날이 밝았습니다.");
		System.out.println("╰╼|═════════════|╾╯"+"\n");
		return characterList;
	}

	// 빚갚기
	// 매개변수 : List<CharacterDTO>
	// 리턴 : characterList
	@Override
	public List<CharacterDTO> rePay(List<CharacterDTO> characterList, List<PriceDTO> priceList) {
		if(characterList.size()>0) {
			Scanner scan = new Scanner(System.in);
			CharacterDTO cha = new CharacterDTO();
			cha = characterList.get(0);
			System.out.println("\n" + "╭╼|════════════════════|╾╮");
			System.out.println("   현재 가지고 있는 돈 : " + cha.getMoney() +"원");
			System.out.println("╰╼|════════════════════|╾╯"+"\n");
			System.out.print("갚을 금액을 입력하세요 : ");
			int money = scan.nextInt();
			if (cha.getMoney() >= money) {
				cha.setMoney(cha.getMoney() - money);
				cha.setPay(cha.getPay() - money);
				System.out.println("\n" + "╭╼|════════════════════════|╾╮");
				System.out.println("   "+money + "원 만큼의 금액을 갚았습니다.");
				System.out.println("╰╼|════════════════════════|╾╯" + "\n");
				System.out.println("\n" + "╭╼|══════════════|╾╮");
				System.out.println("   현재 잔고 : "+cha.getMoney()+"원.");
				System.out.println("╰╼|══════════════|╾╯" + "\n");
				System.out.println("\n" + "╭╼|═══════════════|╾╮");
				System.out.println("   남은 빚 : "+ characterList.get(0).getPay() + "원");
				System.out.println("╰╼|═══════════════|╾╯" + "\n");
				if(cha.getPay()<=0) {
					cha.setRun(false);
					gameEnd(characterList, priceList);
					JavaCrossingHOF call = new JavaCrossingHOF();
					call.endingFile(characterList, priceList);
				}
			} else {
				System.out.println("\n" + "╭╼|═══════════════════════|╾╮");
				System.out.println("   가지고 있는 돈이 더 적습니다.");
				System.out.println("╰╼|═══════════════════════|╾╯" + "\n");
			}
		}
		return characterList;
	}

	// 나무그림 출력
	// 매개변수 : List<FruitDTO>
	// 리턴 : void
	@Override
	public void treePrint(List<FruitDTO> fruitList) {
		PrintDTO tree = new PrintDTO();
		if (fruitList.size() == 1) {
			if (fruitList.get(0).isFruit()) {
				tree.tree1o();
			} else {
				tree.tree1x();
			}
		} else if (fruitList.size() == 2) {
			if (fruitList.get(0).isFruit()) {
				if (fruitList.get(1).isFruit()) {
					tree.tree1o2o();
				} else {
					tree.tree1o2x();
				}
			} else {
				if (fruitList.get(1).isFruit()) {
					tree.tree1x2o();
				} else {
					tree.tree1x2x();
				}
			}
		} else if (fruitList.size() == 3) {
			if (fruitList.get(0).isFruit()) {
				if (fruitList.get(1).isFruit()) {
					if (fruitList.get(2).isFruit()) {
						tree.tree1o2o3o();
					} else {
						tree.tree1o2o3x();
					}
				} else {
					if (fruitList.get(2).isFruit()) {
						tree.tree1o2x3o();
					} else {
						tree.tree1o2x3x();
					}
				}
			} else {
				if (fruitList.get(1).isFruit()) {
					if (fruitList.get(2).isFruit()) {
						tree.tree1x2o3o();
					} else {
						tree.tree1x2o3x();
					}
				} else {
					if (fruitList.get(2).isFruit()) {
						tree.tree1x2x3o();
					} else {
						tree.tree1x2x3x();
					}
				}
			}
		}
	}

	// 엔딩용 메서드
	// 매개변수 : List<CharacterDTO>, List<PriceDTO>
	// 리턴 : void
	@Override
	public void gameEnd(List<CharacterDTO> characterList, List<PriceDTO> priceList) {
		CharacterDTO cha = new CharacterDTO();
		cha = characterList.get(0);
		PriceDTO total = new PriceDTO();
		total = priceList.get(0);
		System.out.println("\n" + "╭╼|═══════════════════════════|╾╮");
		System.out.println("   축하드립니다!! 빚을 다 갚으셨습니다!"+"\n");
		System.out.println("   "+cha.getName() + "님의 스토리");
		System.out.println("   "+cha.getName() + "님이 마을에서 지낸 시간 : " + cha.getCharaterDay());
		System.out.println("   "+cha.getName() + "님이 채집한 과일 : " + total.getFruitTotal());
		System.out.println("   과일 총 판매 금액 : " + total.getTotal());
		System.out.println("\n"+"   자바의 숲을 즐겨주셔서 감사합니다.");
		System.out.println("╰╼|═══════════════════════════|╾╯" + "\n");
	}	
	
	// JavaCrossingService 끝
}
