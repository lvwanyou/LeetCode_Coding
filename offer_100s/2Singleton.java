public class Singleton{
	private static Singleton singleton;
	private Singleton() {
		
	}
	
	
	// 错误题解
    /**
     * @Author rex
     * @Date 2018/6/8 下午7:28
     * @Description 公有获取单例对象静态函数
     * 在方法级别上加锁
     * 当一个线程进入该方法之后，其它线程试图进入该方法都必须等待，
     * 因此性能上有一定的损耗
     */
	public static synchronized Singleton getSingleton() {
		if(Singleton.singleton == null) {
			Singleton.singleton = new Singleton();
		}
		return Singleton.singleton;
	}
	
	
	// 正确题解
    /**
     * @Author rex
     * @Date 2018/6/7 下午9:46
     * @Description 公有获取单例对象静态函数
     * 加同步锁前后两次判断实例是否已存在
     * 缩小的同步代码块
     */
	public static Singleton getSingleton1() {
		if(Singleton.singleton == null) {
			 synchronized(Singleton.class) {
				 if(Singleton.singleton == null) {
					 Singleton.singleton = new Singleton();
				 }
			 }
		}
		return Singleton.singleton;
	}
}