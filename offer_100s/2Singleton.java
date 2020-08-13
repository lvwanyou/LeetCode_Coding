public class Singleton{
	private static Singleton singleton;
	private Singleton() {
		
	}
	
	
	// �������
    /**
     * @Author rex
     * @Date 2018/6/8 ����7:28
     * @Description ���л�ȡ��������̬����
     * �ڷ��������ϼ���
     * ��һ���߳̽���÷���֮�������߳���ͼ����÷���������ȴ���
     * �����������һ�������
     */
	public static synchronized Singleton getSingleton() {
		if(Singleton.singleton == null) {
			Singleton.singleton = new Singleton();
		}
		return Singleton.singleton;
	}
	
	
	// ��ȷ���
    /**
     * @Author rex
     * @Date 2018/6/7 ����9:46
     * @Description ���л�ȡ��������̬����
     * ��ͬ����ǰ�������ж�ʵ���Ƿ��Ѵ���
     * ��С��ͬ�������
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