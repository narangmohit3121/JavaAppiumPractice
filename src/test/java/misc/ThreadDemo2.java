package misc;

public class ThreadDemo2 {
	public static ThreadLocal<Integer> local = new ThreadLocal<Integer>() {
		public Integer initialValue() {
			return new Integer(10);
		}
		public Integer get() {
			return super.get();
		}
	};
	public Operate add = (int x, int y)->{
		return x + y;
	};
	public Integer optParams(Object... b) {
		Integer x = 0;
		for(int i = 0; i < b.length; i++) {
			if(b.length > 0) {
				//Integer y = (b[0] instanceof Integer)?(Integer)b[i]:0;
				//System.out.println(y);
				x = x + ((b[0] instanceof Integer)?(Integer)b[i]:0) ;
			}
		}
		return x;		
	}
	
	public static void main(String[] args) {
		ThreadDemo2 demo = new ThreadDemo2();
		System.out.println(demo.optParams(1,2,3,4));
	}
}
