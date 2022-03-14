import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BotonIcono  extends JButton implements Serializable{
		
		private static final long serialVersionUID = -6299481093603650156L;
		ImageIcon icono;
		
		
		BotonIcono(String texto, String path){
			super();
			this.setIconjjj(new ImageIcon(path));
			this.setText(texto);
			this.setSize(25,160);
			this.setHorizontalAlignment(LEFT);
			this.setVisible(true);
		}
	
		public ImageIcon getIcono() {
			return icono;
		}
		

}
