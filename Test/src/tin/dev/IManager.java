package tin.dev;

import java.util.List;

public interface IManager {
	void add(Fruit fruit);
	void remove(String name);
	void sort();
	List<Fruit> all();
	void edit(Fruit fruit);
	
}
