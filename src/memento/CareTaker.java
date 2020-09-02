package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	
	private List<Memento> savedArticles = new ArrayList<Memento>();
	
	public void addMemento(Memento memento) {
		savedArticles.add(memento);
	}
	
	public Memento getMemento(int index) {
		return savedArticles.get(index);
	}
}
