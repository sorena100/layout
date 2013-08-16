import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		clipboard cl = new clipboard();
		try {
			cl.clipmethod();
			System.exit(0);
		} catch (UnsupportedFlavorException | IOException e1) {
			e1.printStackTrace();
		}
	}

}
