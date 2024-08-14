public class AbstractFactoryDemo {

    public static void main(String[] args) {

        ShapeFactoryProducer factoryProducer = new ShapeFactoryProducer();

        AbstractShapeFactory factory = factoryProducer.getFactory(false);

        Shape shape1 = factory.getShape("rectangle");
        shape1.draw();

        Shape shape2 = factory.getShape("square");
        shape2.draw();

        AbstractShapeFactory roundedFactory = factoryProducer.getFactory(true);

        Shape shape3 = roundedFactory.getShape("rectangle");
        shape3.draw();

        Shape shape4 = roundedFactory.getShape("square");
        shape4.draw();
    }
}
