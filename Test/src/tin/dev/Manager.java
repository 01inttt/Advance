package tin.dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager implements IManager {
	List<Fruit> fruits = new ArrayList<>();

	@Override
	public void add(Fruit fruit) {
		// TODO Auto-generated method stub
		fruits.add(fruit);
	}

	@Override
	public void remove(String name) {
		// TODO Auto-generated method stub
		for (int i = 0; i < fruits.size(); i++) {
			if(fruits.get(i).getName().equals(name)) {
				fruits.remove(i);
				System.out.println("Đã Xóa " + name );
			}else {
				System.out.println("Không Tìm Thấy " + name);
			}
		}
		
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		Collections.sort(fruits, new Comparator<Fruit>() {

			@Override
			public int compare(Fruit o1, Fruit o2) {
				// TODO Auto-generated method stub
				if (o1.getKg() > o2.getKg())
					return 1;
				if (o1.getKg() < o2.getKg())
					return -1;
				return 0;
			}
		});
	}

	@Override
	public List<Fruit> all() {
		// TODO Auto-generated method stub
		return fruits;
	}

	@Override
	public void edit(Fruit fruit) {
		// TODO Auto-generated method stub
	}

}
