package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection{
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Iterator<Product> createIterator(){
        return new ListIterator(products);
    }

    private class ListIterator implements Iterator<Product>{
        private List<Product> products;
        private int index;

        public ListIterator(List<Product> products) {
            this.products = products;
        }

        @Override
        public boolean hasNext() {
            return index < products.size();
        }

        @Override
        public Product current() {
            return products.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
