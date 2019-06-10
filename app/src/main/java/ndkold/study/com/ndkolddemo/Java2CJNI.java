package ndkold.study.com.ndkolddemo;

/**
 * 描述当前版本功能
 *
 * @Project: NDKOldDemo
 * @author: cjx
 * @date: 2019-06-10 09:53  星期一
 */
public class Java2CJNI {
//    先加载so文件，注意这里的libname是Java2C,不是 libJava2C.so
//    这个libname是Android.mk里的 LOCAL_MODULE := Java2C 字段控制的，注意一定要一致的
    static {
        System.loadLibrary("Java2C");
    }

    public native String java2C();
}
