import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class picture_pop_up extends JFrame{

	private static final long serialVersionUID = 1054570099367367957L;

	JPanel picture_pop_up1_panel,
	picture_pop_up_card_layout_panel;
	CardLayout picture_pop_up_basic_panel;
	


	public picture_pop_up() {
		picture_pop_up1();
		add(picture_pop_up_card_layout_panel,BorderLayout.CENTER);

		setSize(670,460);
		setLocation(350, 250);
		setVisible(true);
	}


	public void picture_pop_up1(){

		picture_pop_up_basic_panel= new CardLayout(); 
		picture_pop_up_card_layout_panel = new JPanel(picture_pop_up_basic_panel);

		picture_pop_up1_panel = new JPanel();
		picture_pop_up1_panel.setLayout(null);		

		JLabel picture_pop_up_pic_label = new JLabel();
		picture_pop_up_pic_label.setBounds(5,5,110,110);
		picture_pop_up_pic_label.setIcon(new ImageIcon("Error.jpg"));
		picture_pop_up1_panel.add(picture_pop_up_pic_label);

		JLabel  picture_pop_up_panel_head= new JLabel("Exam Picture");
		picture_pop_up_panel_head.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,20));
		picture_pop_up_panel_head.setBounds(250,10,250,30);
		picture_pop_up1_panel.add(picture_pop_up_panel_head);


		
		
		picture_pop_up_card_layout_panel.add(picture_pop_up1_panel, "1");
	}
}