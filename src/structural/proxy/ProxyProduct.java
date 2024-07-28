package structural.proxy;

public class ProxyProduct implements Product{
    private RealProduct product;
    private DbContext context;

    public ProxyProduct(RealProduct product, DbContext context) {
        this.product = product;
        this.context = context;
    }

    @Override
    public void setName(String name) {
        product.setName(name);
        context.markAsChanged(product);
    }
}
