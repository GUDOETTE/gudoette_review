package main.java;

public final class Item {
        public int key;
        //constructor
        public Item(int keyValue) { 
                key = keyValue;
        }
        // further components and methods
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
}