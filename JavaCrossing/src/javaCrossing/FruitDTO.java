package javaCrossing;

public class FruitDTO {

	private int tree;
	private boolean fruit=true;
	private int treeDay;
	
	public FruitDTO() {
		
	}

	public FruitDTO(int tree, boolean fruit, int treeDay) {
		this.tree = tree;
		this.fruit = fruit;
		this.treeDay = treeDay;
	}

	public int getTree() {
		return tree;
	}

	public void setTree(int tree) {
		this.tree = tree;
	}

	public boolean isFruit() {
		return fruit;
	}

	public void setFruit(boolean fruit) {
		this.fruit = fruit;
	}

	public int getTreeDay() {
		return treeDay;
	}

	public void setTreeDay(int treeDay) {
		this.treeDay = treeDay;
	}

	@Override
	public String toString() {
		return "FruitDTO [tree=" + tree + ", fruit=" + fruit + ", treeDay=" + treeDay + "]";
	}
	
}
