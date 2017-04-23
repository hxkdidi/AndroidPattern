package com.didi.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.didi.demo.abstractfactory.interfaces.A8Factory;
import com.didi.demo.abstractfactory.interfaces.BMWFactory;
import com.didi.demo.adapterpattern.AudioPlayer;
import com.didi.demo.bridgepattern.Bridge;
import com.didi.demo.bridgepattern.StoneBridge;
import com.didi.demo.bridgepattern.WoodBridge;
import com.didi.demo.builderpattern.User;
import com.didi.demo.builderpattern.UserManager;
import com.didi.demo.decoratorpattern.Circle;
import com.didi.demo.decoratorpattern.Rectangle;
import com.didi.demo.decoratorpattern.RedShapeDecorator;
import com.didi.demo.facadepttern.ToolManager;
import com.didi.demo.flyweightpattern.GirlFactory;
import com.didi.demo.flyweightpattern.SexyGirl;
import com.didi.demo.mediatorpattern.Chatter;
import com.didi.demo.observerpattern.BinaryObserver;
import com.didi.demo.observerpattern.OctalObserver;
import com.didi.demo.observerpattern.Subject;
import com.didi.demo.prototypepattern.Shape;
import com.didi.demo.prototypepattern.ShapeCache;
import com.didi.demo.proxrypattern.Image;
import com.didi.demo.proxrypattern.ProxyImage;
import com.didi.demo.simplefactory.DBHandler;
import com.didi.demo.simplefactory.IOFactory;
import com.didi.demo.strategypattern.Context;
import com.didi.demo.strategypattern.OperationAdd;
import com.didi.demo.strategypattern.OperationMultiply;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testAbstractFactory();
        testSimpleFactory();
        testPrototypePattern();
        testBuilderPattern();
        testProxyPattern();
        testDecoratorPattern();
        testAdapterPattern();
        testObserverPattern();
        testFlyWeightPattern();
        testBridgePattern();
        testStrategyPattern();
        testMediatorPattern();
        testFacadePattern();
    }

    /**
     * 外观模式
     */
    private void testFacadePattern() {
        ToolManager toolManager = new ToolManager();
        toolManager.mediumTool();
        toolManager.seniorTool();
        toolManager.superTool();
    }

    /**
     * 中介者模式
     */
    private void testMediatorPattern() {
        Chatter hello = new Chatter("hello");
        hello.sendMessage("Hi,hello");
    }

    /**
     * 策略模式
     */
    private void testStrategyPattern() {
        Context context = new Context(new OperationAdd());
        int i = context.executeStrategy(10, 5);
        System.out.println(i + "=10-5");
        context = new Context(new OperationMultiply());
        int i1 = context.executeStrategy(10, 5);
        System.out.println(i1 + "=10*5");
    }

    /**
     * 桥接模式
     */
    private void testBridgePattern() {
        Bridge stoneBridge = new Bridge(new StoneBridge(), 100, 50, 300);
        stoneBridge.build();
        Bridge woodBridge = new Bridge(new WoodBridge(), 200, 300, 400);
        woodBridge.build();
    }

    /**
     * 享元模式
     */
    private void testFlyWeightPattern() {

        final String names[] =
                {"Red", "Green", "Blue", "White", "Black"};

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            SexyGirl sexyGirl = (SexyGirl) GirlFactory.getSexyGirl(names[random.nextInt(names.length)]);
            sexyGirl.setAge(15);
            sexyGirl.setHeight(165);
            sexyGirl.setWeight(52);
            sexyGirl.hook();
        }
    }

    /**
     * 观察者模式
     */
    private void testObserverPattern() {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        subject.setState(15);
    }

    /**
     * 适配器模式
     */
    private void testAdapterPattern() {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "beyond the horizon.mp4");
        audioPlayer.play("vlc", "beyond the horizon.vlc");
        audioPlayer.play("avi", "beyond the horizon.avi");
    }

    /**
     * 装饰模式
     */
    private void testDecoratorPattern() {
        Circle circle = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }

    /**
     * Proxy代理模式
     */
    private void testProxyPattern() {
        Image image = new ProxyImage("test.png");
        image.display();
    }

    /**
     * Builder模式
     */
    private void testBuilderPattern() {
        User qqq = new User.Builder().setId("1").setUserName("qqq").create();
        UserManager.getInstance().init(qqq);
    }

    /**
     * 原型模式的实现(浅拷贝),相对于Serializable(深拷贝)
     */
    private void testPrototypePattern() {

        ShapeCache.loadCache();

        Shape shape = ShapeCache.getShape("1");
        String type = shape.getType();

        Shape shape1 = ShapeCache.getShape("2");
        String type1 = shape1.getType();

        Shape shape2 = ShapeCache.getShape("3");
        String type2 = shape2.getType();

        System.out.println(type + "_" + type1 + "_" + type2);

    }


    /**
     * 简单工厂方法的实现
     */
    private void testSimpleFactory() {
        /**
         * 使用数据库方式存储
         */
        DBHandler ioHandler = IOFactory.getIOHandler(DBHandler.class);
        ioHandler.add("1", "test");
    }

    /**
     * 抽象工厂方法
     */
    private void testAbstractFactory() {
        /**
         * 生产一辆宝马
         */
        BMWFactory bmwFactory = new BMWFactory();
        bmwFactory.createTire().tire();
        bmwFactory.createEngine().engine();
        bmwFactory.creteBrake().brake();

        /**
         * 生产一辆奥迪A8
         *
         */
        A8Factory a8Factory = new A8Factory();
        a8Factory.createTire().tire();
        a8Factory.createEngine().engine();
        a8Factory.creteBrake().brake();
    }
}
