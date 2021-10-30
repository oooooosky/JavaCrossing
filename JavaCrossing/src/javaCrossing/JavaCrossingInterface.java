package javaCrossing;

import java.util.*;

public interface JavaCrossingInterface {

	List<CharacterDTO> newJoin(List<CharacterDTO> characterList, List<FruitDTO> fruitList, List<PriceDTO> priceList);
	
	List<FruitDTO> newTree(List<FruitDTO> fruitList, List<CharacterDTO> characterList);
	
	void informationView(List<FruitDTO> fruitList, List<CharacterDTO> characterList, List<PriceDTO> priceList);
	
	List<FruitDTO> getFruit(List<FruitDTO> fruitList, List<CharacterDTO> characterList, List<PriceDTO> priceList);
	
	List<CharacterDTO> sellFruit(List<CharacterDTO> characterList, List<PriceDTO> priceList);
	
	List<CharacterDTO> sleep(List<CharacterDTO> characterList, List<FruitDTO> fruitList, List<PriceDTO> priceList);
	
	List<CharacterDTO> rePay(List<CharacterDTO> characterList, List<PriceDTO> priceList);
	
	void treePrint(List<FruitDTO> fruitList);
	
	void gameEnd(List<CharacterDTO> characterList, List<PriceDTO> priceList);

}
