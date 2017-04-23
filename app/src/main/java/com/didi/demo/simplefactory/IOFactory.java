package com.didi.demo.simplefactory;

/**
 * Created by map on 2017/3/26.
 */

public class IOFactory {
    /**
     * 获取IO处理者
     *
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T extends IOHandler> T getIOHandler(Class<T> tClass) {
        IOHandler ioHandler = null;
        try {
            ioHandler = (IOHandler) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) ioHandler;
    }
}
