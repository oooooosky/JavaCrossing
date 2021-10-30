package javaCrossing;

import java.io.*;
import java.util.*;

public class JavaCrossingHOF{
	
	
	public void endingFile(List<CharacterDTO> characterList, List<PriceDTO> priceList) {
		
		JavaCrossingService call = new JavaCrossingService();
		
		System.out.println("역대 명예의 마을 주민으로 등록되셨습니다!");
		try {
		// 파일 객체 생성
			File file = new File("/Users/sky/EclipseJava/source/JavaCrossing/src/javaCrossing/Ending.txt");
			// 입력 스트림 생성
			FileReader file_reader = new FileReader(file);
			int cur = 0;
			while((cur = file_reader.read())!=-1) {
				System.out.println((char)cur);
			}
			file_reader.close();
		} catch(FileNotFoundException e) {
			e.getStackTrace();
		} catch(IOException e) {
			e.getStackTrace();
		}
	
		CharacterDTO cha = new CharacterDTO();
		PriceDTO total = new PriceDTO();
		cha = characterList.get(0);
		total = priceList.get(0);
		
		try {
			OutputStream output = new FileOutputStream("/Users/sky/EclipseJava/source/JavaCrossing/src/javaCrossing/Ending.txt", true);
				String str = "\n" + "   "+cha.getName() + "님의 스토리"+"\n"+"   "+cha.getName() + "님이 마을에서 지낸 시간 : " + cha.getCharaterDay()+"\n"+"   "+cha.getName() + "님이 채집한 과일 : " + total.getFruitTotal()+"\n" + "   과일 총 판매 금액 : " + total.getTotal();
				byte[] by = str.getBytes();
				output.write(by);
		} catch(Exception e) {
			e.getStackTrace();
		}
	}
	
}
