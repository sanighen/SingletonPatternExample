
class Box {

	private static Box instance;
	private Object value;

	/*
	 * какие типы данных могут попасть внутрь "Box" ? 
	 * int, float, double, String, char, array, list
	 */

	/*
	 * Так как пример у нас простейший, то я выбрал самую простую реализацию данного
	 * паттерна, главный недостаток которого заключается в том, что он не работает в
	 * многопоточной среде (я даже не знаю, что такое многопоточная среда)
	 * 
	 * Я считаю, что использовать другие более сложные реализации этого паттерна
	 * необходимо в намного более сложных задачах
	 */

	private Box(Object value) {
		this.value = value;
	}

	public static Box getInstance(Object value) {
		if (instance == null) {
			instance = new Box(value);
		}
		return instance;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Box [value=" + value + "]";
	}

}
