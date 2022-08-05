
public class controlstatement {
	public static void main(String[] args) {
		int i;
		for(i=0;i<10;i++) {
			if(i==5) {
				break;
			}
			else {
				System.out.println("I : "+i);
			}
		}
		
		int y;
		for(y=0;y<10;y++) {
			if(y==5) {
				continue;
			}
			else {
				System.out.println("Y : "+y);
			}
		}
	}
}
